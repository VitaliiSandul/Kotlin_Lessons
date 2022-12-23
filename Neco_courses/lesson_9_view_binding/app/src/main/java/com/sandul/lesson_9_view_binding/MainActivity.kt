package com.sandul.lesson_9_view_binding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sandul.lesson_9_view_binding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    val a = 324
    val b = 34
    val currentPerson = 95
    val maxPerson = 90

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonPlus.setOnClickListener {
            binding.tvResult.text = when (currentPerson) {
                !in 0..maxPerson -> "Limit exceeded"
                else -> "The limit is not exceeded"
            }
        }

        binding.buttonMinus.setOnClickListener {
            binding.tvResult.text = (a - b).toString()
        }

        binding.buttonMultiply.setOnClickListener {
            binding.tvResult.text = (a * b).toString()
        }
    }
}