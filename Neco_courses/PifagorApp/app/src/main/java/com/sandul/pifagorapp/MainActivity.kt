package com.sandul.pifagorapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.sandul.pifagorapp.databinding.ActivityMainBinding
import kotlin.math.pow
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(binding.root)

        setContentView(R.layout.test_layout)
    }

    fun onClickResult(view: View) {
        if (!isFieldEmpty()) {
            val result = getString(R.string.result_info) + getResult()
            binding.tvResult.text = result
        }
    }

    private fun isFieldEmpty(): Boolean {
        binding.apply {
            if (etA.text.isNullOrEmpty()) etA.error = "field should be filled"
            if (etB.text.isNullOrEmpty()) etB.error = "field should be filled"
            return etA.text.isNullOrEmpty() || etB.text.isNullOrEmpty()
        }
    }

    private fun getResult(): String {
        val a: Double
        val b: Double
        binding.apply {
            a = etA.text.toString().toDouble()
            b = etB.text.toString().toDouble()
        }
        return sqrt(a.pow(2) + b.pow(2)).toString()
    }
}