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

        binding.btnResult.setOnClickListener {
            val editText = binding.edValue.text.toString()
            val editPass = binding.edPassword.text.toString().toInt()
            var tmp = ""

            when (editText) {
                Constants.DIRECTOR -> {
                    if (editPass == Constants.DIRECTOR_PASSWORD) {
                        tmp = "${Constants.DIRECTOR}, your salary is ${Constants.DIRECTOR_SALARY} USD/month"
                        binding.tvResult.text = tmp
                    }
                }
                Constants.IOS_ENGINEER -> {
                    if (editPass == Constants.IOS_ENGINEER_PASSWORD) {
                        tmp = "${Constants.IOS_ENGINEER}, your salary is ${Constants.IOS_ENGINEER_SALARY} USD/month"
                        binding.tvResult.text = tmp
                    }
                }
                Constants.ANDROID_ENGINEER -> {
                    if (editPass == Constants.ANDROID_ENGINEER_PASSWORD) {
                        tmp = "${Constants.ANDROID_ENGINEER}, your salary is ${Constants.ANDROID_ENGINEER_SALARY} USD/month"
                        binding.tvResult.text = tmp
                    }
                }
                else -> {
                    tmp = "Wrong name or password"
                    binding.tvResult.text = tmp
                }
            }
            binding.tvResult.visibility = View.VISIBLE
        }
    }
}