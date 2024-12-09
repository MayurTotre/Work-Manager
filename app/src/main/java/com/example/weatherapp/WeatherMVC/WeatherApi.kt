package com.example.weatherapp.WeatherMVC

import android.database.Observable
import com.example.weatherapp.WeatherMVC.WeatherRequest

import android.telecom.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {
    @GET("forecast.json")
    suspend fun getWeather(
        @Query("key") apiKey: String,
        @Query("q") location: String,
        @Query("days") days: Int,
        @Query("aqi") aqi: String = "no",
        @Query("alerts") alerts: String ="no"
    ): Response<WeatherRequest>
}