package ort.edu.ar.tp3.primerparcial.grupo4.ui.main.cars

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import ort.edu.ar.tp3.primerparcial.grupo4.R
import ort.edu.ar.tp3.primerparcial.grupo4.data.entities.Car
import ort.edu.ar.tp3.primerparcial.grupo4.data.repository.CarRepository
import ort.edu.ar.tp3.primerparcial.grupo4.service.ApiService
import ort.edu.ar.tp3.primerparcial.grupo4.service.CarService

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
        val vista = inflater.inflate(R.layout.fragment_cars, container, false)

        getCars()

        /*val recyclerViewCar = vista.findViewById<RecyclerView>(R.id.rec_cars)
        recyclerViewCar.adapter = CarListAdapter(cars)
        val linearLayoutManager = LinearLayoutManager(context)
        recyclerViewCar.layoutManager = linearLayoutManager*/

        return vista
    }

    fun getCars() {
        val carRepository = CarRepository(apiCarService)
        val cars = carRepository.getCars("gas")

    }

}