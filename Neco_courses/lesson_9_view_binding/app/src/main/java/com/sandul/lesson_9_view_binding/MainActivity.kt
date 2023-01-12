package com.sandul.lesson_9_view_binding

import android.content.ContextWrapper
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.sandul.lesson_9_view_binding.databinding.ActivityMainBinding
import java.io.*

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fileName = File(applicationContext.filesDir.path, "tmpFile.txt")

        binding.save.setOnClickListener {

            writeToFile(fileName, "test file")
            Log.d("MainActivity1", "${fileName.absolutePath}")

            val file = File("test.txt")
            Log.d("MainActivity2", "${file.absolutePath}")

            val cw = ContextWrapper(applicationContext)
            val path = cw.filesDir
            Log.d("MainActivity3", "${path}")
        }

        binding.read.setOnClickListener {

            if(resources.assets.list("")?.contains("local_test.txt") == true){
                Log.d("MainActivityFile","Yes File")
            }
            else {
                Log.d("MainActivityFile","No File")
            }
        }
    }

    private fun isAssetExists(pathInAssetsDir: String): Boolean {
        val assetManager = resources.assets
        var inputStream: InputStream? = null
        try {
            inputStream = assetManager.open(pathInAssetsDir)
            if (inputStream != null) {
                return true
            }
        } catch (e: IOException) {
            e.printStackTrace()
        } finally {
            try {
                inputStream!!.close()
            } catch (e: IOException) {
                e.printStackTrace()
            }
        }
        return false
    }

    fun writeToFile(file: File, content: String) {
        val writer = OutputStreamWriter(FileOutputStream(file), "UTF-8")
        try {
            writer.write(content)
            writer.flush()
        } catch (var12: IOException) {
            Log.e("FileUtils", var12.toString())
        } finally {
            try {
                writer.close()
            } catch (var11: IOException) {
                Log.e("FileUtils", var11.toString())
            }
        }
    }

    fun readFromFile(file: File): String? {
        val inputStream: InputStream = FileInputStream(file)
        val inputStreamReader: Reader = InputStreamReader(inputStream)
        val output = StringWriter()
        try {
            val buffer = CharArray(4096)
            var count: Int
            while (inputStreamReader.read(buffer).also { count = it } != -1) {
                output.write(buffer, 0, count)
            }
        } catch (var14: IOException) {
            Log.w("FileUtils", var14.toString())
        } finally {
            try {
                inputStreamReader.close()
            } catch (var13: IOException) {
                Log.e("FileUtils", var13.toString())
            }
        }
        return output.toString()
    }
}