package com.sandul.lesson21_cycle_array

import android.util.Log

class User(var name: String, var id: String, var age: Int) {

    val TAG = "My LOG"

    fun addAge(years: Int) {
        age = age.plus(years)
    }

    infix fun addAge2(years: Int): String {
        age = age.plus(years)
        return "$age"
    }

    fun printInfo(){
        Log.d(TAG, "NAME: $name \nID: $id \nAGE: ${age}")
    }
}