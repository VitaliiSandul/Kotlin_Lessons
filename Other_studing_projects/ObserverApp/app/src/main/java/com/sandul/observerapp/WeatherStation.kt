package com.sandul.observerapp

import android.os.Handler
import java.util.*


class WeatherStation {
    private val people: MutableList<ManBehavior> = LinkedList()
    var degrees = 0

    fun addMan(manBehavior: ManBehavior){
        people.add(manBehavior)
    }

    fun RemoveMan(manBehavior: ManBehavior){
        people.remove(manBehavior)
    }
    fun updateWeather() {
        degrees = Random().nextInt(40)
        people.forEach{
            it.getCloth(degrees = degrees)
        }

        val handler = Handler()
        handler.postDelayed({
            updateWeather()
        }, 2000)
    }
}