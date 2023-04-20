package com.sandul.gradleexample

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener{
            val addressUri: Uri = Uri.parse(BuildConfig.API_URL)
            val openLinkIntent = Intent(Intent.ACTION_VIEW, addressUri)
            startActivity(openLinkIntent)
        }
    }
}