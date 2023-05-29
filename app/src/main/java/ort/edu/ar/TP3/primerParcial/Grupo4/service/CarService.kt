package ort.edu.ar.tp3.primerparcial.grupo4.service

import ort.edu.ar.tp3.primerparcial.grupo4.data.entities.Car
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface CarService {

    @Headers("X-Api-key:9l/QrDuG/PIUYfo+LKRk1w==POBJwaBdNC5Go25I")
    @GET("cars?fuel_type=gas")
    fun getCars(): Call<List<Car>>

}