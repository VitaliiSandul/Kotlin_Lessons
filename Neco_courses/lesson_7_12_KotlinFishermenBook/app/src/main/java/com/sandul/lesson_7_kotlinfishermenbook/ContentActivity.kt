package com.sandul.lesson_7_kotlinfishermenbook

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.content_layout.*

class ContentActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.content_layout)

        tvTitle.text = intent.getStringExtra("title")
        tvContent.text = intent.getStringExtra("content")
        im.setImageResource(intent.getIntExtra("image",R.drawable.ic_fish))
    }
}