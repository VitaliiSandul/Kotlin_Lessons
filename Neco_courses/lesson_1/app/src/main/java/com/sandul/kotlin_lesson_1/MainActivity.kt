package com.sandul.kotlin_lesson_1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import java.sql.Array

class MainActivity : AppCompatActivity() {

    val TAG = "ActivityLifeCycle"
    private var number: Int = 5
    private var number2: Int = 5
    private var text: String = "in the <store1> store there are $number <store2>"
    private var text1: String = "in the store there are ${getNumber()} apples '$' "
    private var tvText: TextView? = null
    private var tvText2: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate")

        tvText = findViewById(R.id.tvText)
        tvText2 = findViewById(R.id.tvText2)
        var sum: Int = getNumber()
        tvText?.setText(text1)


        var subStr: String = text.substringAfter("<").substringBefore(">")
        var subStr2: String = text.substringBefore(" <") + text.substringAfter(">")

        var subStr3: String = text.substringAfterLast("<").substringBeforeLast(">")

        tvText?.setText(subStr)
        tvText2?.setText(subStr3)

        var counter: Int = 0
        //var startNumber = Array(3){""} // для String
        //var startNumber = Array(3){}

//        var startNumber: Array<Int> = arrayOf(2,6,9,6)
//        startNumber[0] = 55
//        var number:Int = startNumber[0]

//        var startNumber = IntArray(3)

        for (n in 0 until text.length) {

            if (text.get(n) == '>') {
                counter++
            }
        }

        var startPosition = IntArray(counter)
        var endPosition = IntArray(counter)
        var startPcounter: Int = 0
        var endPcounter: Int = 0

        for (n in text.indices) {
            if (text.get(n) == '<') {
                startPosition[startPcounter] = n + 1
                startPcounter++
            }

            if (text.get(n) == '>') {
                endPosition[endPcounter] = n
                endPcounter++
            }
        }

        var textFoundArray = Array(counter) { "" }

        for (n in 0 until startPosition.size) {
            textFoundArray[n] = text.substring(startPosition[n], endPosition[n])
            Log.d("MyLog", "Text from $n: " + textFoundArray[n])
        }

        tvText?.setText(counter.toString())
    }

    private fun getNumber(): Int {
        return number + number2
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy")
    }
}