package com.example.myapplication

import com.example.cassialibrary.TemperatureConverter


class Greeting {
    private val platform: Platform = getPlatform()
    val cassia = TemperatureConverter()


    fun greet(): String {
    cassia.celsiusToKelvin(32.0)
        return "Hello, ${platform.name}!"
    }
}