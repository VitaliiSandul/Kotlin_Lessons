package com.sandul.lesson_9_view_binding

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.sandul.lesson_9_view_binding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val REQUEST_CODE = 100
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    fun onClickGoTest1(view: View) {
        val intent = Intent(this, TestActivity1::class.java)
        intent.putExtra("key", "what is your name?")
        startActivityForResult(intent, REQUEST_CODE)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQUEST_CODE && resultCode == RESULT_OK && data != null) {
            binding.tvName.text = data.getStringExtra("key2")
        }
    }
}