package com.sandul.lesson_5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var tvMessage = findViewById<TextView>(R.id.tvMessage)
        var tvInt = findViewById<TextView>(R.id.tvInt)

        //var i = getIntent()
        var i = intent

        if(i != null)
            tvMessage.setText(i.getCharSequenceExtra("salut"))
            tvInt.setText(i.getIntExtra("salut2",0).toString())
    }
}