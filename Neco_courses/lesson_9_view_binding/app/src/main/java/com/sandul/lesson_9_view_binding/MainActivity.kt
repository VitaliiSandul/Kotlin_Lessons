package com.sandul.lesson_9_view_binding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.sandul.lesson_9_view_binding.constants.Constants
import com.sandul.lesson_9_view_binding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}