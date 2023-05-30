package ort.edu.ar.tp3.primerparcial.grupo4.service

import ort.edu.ar.tp3.primerparcial.grupo4.utils.Constants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiService {

    private const val BASE_URL = Constants.API_BASE_URL

    private val retrofit =
        Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create())
            .build()

    fun getRetrofit(): Retrofit {
        return retrofit
    }

}