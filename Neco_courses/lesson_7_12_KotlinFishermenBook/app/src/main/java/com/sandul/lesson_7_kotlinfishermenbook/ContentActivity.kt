package com.sandul.lesson_7_kotlinfishermenbook

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.content_2_layout.*
import kotlinx.android.synthetic.main.content_layout.*

class ContentActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.content_2_layout)

        var index = intent.getIntExtra("index",0)
        webView.clearCache(true)
        webView.loadUrl("file:///android_asset/item_0.html")
    }
}