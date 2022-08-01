package com.sandul.observerapp

import android.util.Log

data class Man(val name: String, val surname: String): ManBehavior {
    private val TAG = Man::class.java.simpleName

    override fun getCloth(degrees: Int) {
        if(degrees > 20){
            Log.e(TAG, "$name $surname: warm")
        }
        else{
            Log.e(TAG, "$name $surname: cold")
        }
    }
}