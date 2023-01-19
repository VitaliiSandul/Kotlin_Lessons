package com.sandul.lesson_9_view_binding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.sandul.lesson_9_view_binding.databinding.ActivityTest1Binding

class TestActivity1 : AppCompatActivity() {

    lateinit var bindingClass: ActivityTest1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityTest1Binding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        val message = intent.getStringExtra("key")
        bindingClass.tvMessage.text = message
    }

    fun onClickBack(view: View) {
        intent.putExtra("key2",bindingClass.editTxt.text.toString())
        setResult(RESULT_OK, intent)
        finish()
    }





}