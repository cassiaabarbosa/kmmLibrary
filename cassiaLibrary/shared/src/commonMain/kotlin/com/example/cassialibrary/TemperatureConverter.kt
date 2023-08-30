package com.example.cassialibrary

class TemperatureConverter {
    fun celsiusToFahrenheit(celsius: Double): Double {
        return celsius * 1.8 + 32.0
    }

    fun celsiusToKelvin(celsius: Double): Double {
        return celsius + 273.15
    }


    fun fahrenheitToCelsius(fahrenheit: Double): Double {
        return (fahrenheit - 32.0) / 1.8
    }

    fun fahrenheitToKelvin(fahrenheit: Double): Double {
        return (fahrenheit - 459.67) * 5/9
    }

    fun kelvinToFahrenheit(kelvin: Double): Double {
        return 1.8 * (kelvin - 273.15) + 32
    }
    fun kelvinToCelsius(kelvin: Double): Double {
        return kelvin - 273.15
    }
}