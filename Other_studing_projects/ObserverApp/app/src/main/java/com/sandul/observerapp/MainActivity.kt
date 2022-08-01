package com.sandul.observerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val weatherStation = WeatherStation()
        weatherStation.addMan(Man(name = "Vitalii", surname = "Sandul"))
        weatherStation.addMan(Man(name = "Slava", surname = "Petrochenko"))
        weatherStation.addMan(Man(name = "Dmitriy", surname = "Chumak"))
        weatherStation.addMan(Man(name = "Serg", surname = "Yarosh"))
        weatherStation.addMan(Man(name = "Yriy", surname = "Boiar"))

        weatherStation.updateWeather()
    }
}