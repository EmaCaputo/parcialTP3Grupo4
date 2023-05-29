package ort.edu.ar.tp3.primerparcial.grupo4.ui.main.cars

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import ort.edu.ar.tp3.primerparcial.grupo4.R
import ort.edu.ar.tp3.primerparcial.grupo4.data.entities.Car
import ort.edu.ar.tp3.primerparcial.grupo4.data.repository.CarRepository
import ort.edu.ar.tp3.primerparcial.grupo4.service.ApiService
import ort.edu.ar.tp3.primerparcial.grupo4.service.CarService
import java.util.logging.Logger

class CarsFragment : Fragment() {

    private lateinit var apiCarService: CarService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        // Instanciar apiCarService
        apiCarService = ApiService.getRetrofit().create(CarService::class.java)

        getCars()

        return inflater.inflate(R.layout.fragment_cars, container, false)
    }

    fun getCars() {
        val carRepository = CarRepository(apiCarService)
        val cars = carRepository.getCars("gas")

    }

}