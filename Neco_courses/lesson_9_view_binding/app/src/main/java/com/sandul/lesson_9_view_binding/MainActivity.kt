package com.sandul.lesson_9_view_binding

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.sandul.lesson_9_view_binding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    fun onClickGoTest2(view: View) {
        val intent = Intent(this, TestActivity2::class.java)
        startActivity(intent)
    }

    fun onClickClose(view: View) {
        finish()
    }
}