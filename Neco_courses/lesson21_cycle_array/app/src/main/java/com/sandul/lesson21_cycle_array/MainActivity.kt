package com.sandul.lesson21_cycle_array

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var user = User("Vitalii", "00001", 37)
        user.addAge(1)

        val text = user addAge2 10  //infix fun -> just 1 param

        user.printInfo()
    }
}