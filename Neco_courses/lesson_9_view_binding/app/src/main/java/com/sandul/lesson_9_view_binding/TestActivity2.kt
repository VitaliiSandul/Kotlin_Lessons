package com.sandul.lesson_9_view_binding

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class TestActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test2)
    }

    fun onClickClose(view: View) {
        finish()
    }
}