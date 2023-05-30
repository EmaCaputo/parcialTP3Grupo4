package ort.edu.ar.tp3.primerparcial.grupo4.service

import ort.edu.ar.tp3.primerparcial.grupo4.data.entities.CarResponse
import ort.edu.ar.tp3.primerparcial.grupo4.utils.Constants
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface CarService {

    @Headers("X-Api-key:" + Constants.API_KEY)
    @GET("cars?fuel_type=gas")
    fun getCars(@Query("fuel_type") fuelType: String): Call<List<CarResponse>>

}