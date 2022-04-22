package com.sandul.preferences

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var counter = 0
    var test = "0"
    var pref: SharedPreferences? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pref = getSharedPreferences("TABLE", Context.MODE_PRIVATE)
        counter = pref?.getInt("counter", 0)!!
        test = pref?.getString("test","0")!!
        tvResult.text = counter.toString()
        tvRes2.text = test
    }

    fun OnClickAdd(view: View) {
        counter++
        tvResult.text = counter.toString()
        saveData(counter)
    }

    fun saveData(res: Int){
        val editor = pref?.edit()
        editor?.putInt("counter", res)
        editor?.putString("test", "Test")
        editor?.apply()
    }

    fun deleteAll(){
        val editor = pref?.edit()
        editor?.clear()
        editor?.apply()
    }

    fun deleteItem(item: String){
        val editor = pref?.edit()
        editor?.remove(item)
        editor?.apply()
    }

    override fun onDestroy() {
        super.onDestroy()
//        saveData(counter)
    }

    fun onClickClear(view: View) {
        counter = 0
        deleteAll()
    }

    fun onClickDeleteItem(view: View) {
        deleteItem("counter")
    }
}