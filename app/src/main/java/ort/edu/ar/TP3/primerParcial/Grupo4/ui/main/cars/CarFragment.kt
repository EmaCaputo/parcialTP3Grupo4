package ort.edu.ar.tp3.primerparcial.grupo4.ui.main.cars

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import ort.edu.ar.tp3.primerparcial.grupo4.R
import ort.edu.ar.tp3.primerparcial.grupo4.adapters.CarListAdapter
import ort.edu.ar.tp3.primerparcial.grupo4.data.repository.CarRepository
import ort.edu.ar.tp3.primerparcial.grupo4.service.ApiService
import ort.edu.ar.tp3.primerparcial.grupo4.service.CarService

class CarFragment : Fragment() {

    private lateinit var apiCarService: CarService
    private lateinit var carRepository: CarRepository
    private lateinit var carViewModel: CarViewModel
    private lateinit var carListAdapter: CarListAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Instance CarService
        apiCarService = ApiService.getRetrofit().create(CarService::class.java)

        // Instance CarRepository
        carRepository = CarRepository(apiCarService)

        // Instance CarViewModel
        carViewModel = ViewModelProvider(this)[CarViewModel::class.java]

        // CarViewModel subscriber
        carViewModel.carsLiveData.observe(this, Observer { cars ->
            carListAdapter.updateData(cars)
        })
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_cars, container, false)

        // Setup Car List Adapter
        setupCarListAdapter(view)

        // Fetch cars
        fetchCars()

        return view
    }

    private fun setupCarListAdapter(view: View) {
        carListAdapter = CarListAdapter()

        val recyclerViewCar = view.findViewById<RecyclerView>(R.id.rec_cars)

        carListAdapter = CarListAdapter()

        recyclerViewCar.adapter = carListAdapter
        recyclerViewCar.layoutManager = LinearLayoutManager(context)
    }


    private fun fetchCars() {
        val cars = carRepository.getCars("diesel")

        cars.observe(viewLifecycleOwner , Observer {
            carViewModel.updateData(it)
        })
    }

}