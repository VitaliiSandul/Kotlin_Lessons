package com.sandul.testonresult

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.result.ActivityResult
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity : AppCompatActivity() {

    private var launcher: ActivityResultLauncher<Intent>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        launcher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
            result: ActivityResult ->
            if(result.resultCode == RESULT_OK){
                val text = result.data?.getStringExtra("key1")
                findViewById<TextView>(R.id.textView).text = text
            }
        }
    }

    fun onClick(view: View){
        launcher?.launch(Intent(this, TestActivity::class.java))
    }

}