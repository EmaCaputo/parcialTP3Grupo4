package ort.edu.ar.tp3.primerparcial.grupo4.data.repository

import androidx.lifecycle.MutableLiveData
import ort.edu.ar.tp3.primerparcial.grupo4.data.entities.Car
import ort.edu.ar.tp3.primerparcial.grupo4.service.CarService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CarRepository(private val apiService: CarService) {

    fun getCars(fuelType: String): MutableLiveData<List<Car>> {
        val liveData = MutableLiveData<List<Car>>()
        val response = apiService.getCars()

        response.enqueue(object : Callback<List<Car>> {
            override fun onResponse(call: Call<List<Car>>, response: Response<List<Car>>) {
                if (response.isSuccessful) {
                    liveData.value = response.body()
                    // Procesa la respuesta exitosa
                } else {
                    // Procesa la respuesta con error
                }
            }

            override fun onFailure(call: Call<List<Car>>, t: Throwable) {
                // Procesa el error de la llamada
            }
        })

        return liveData
    }
}