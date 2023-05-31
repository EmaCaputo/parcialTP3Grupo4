package ort.edu.ar.tp3.primerparcial.grupo4.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ort.edu.ar.tp3.primerparcial.grupo4.data.entities.Car

class CarViewModel : ViewModel() {
    val carsLiveData: MutableLiveData<List<Car>> = MutableLiveData()

    fun updateData(cars: List<Car>) {
        carsLiveData.value = cars
    }
}