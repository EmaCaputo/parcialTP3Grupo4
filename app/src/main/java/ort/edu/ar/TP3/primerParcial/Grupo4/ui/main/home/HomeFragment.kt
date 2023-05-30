package ort.edu.ar.tp3.primerparcial.grupo4.ui.main.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import ort.edu.ar.tp3.primerparcial.grupo4.R
import ort.edu.ar.tp3.primerparcial.grupo4.adapters.CarCategoryListAdapter
import ort.edu.ar.tp3.primerparcial.grupo4.data.repository.CarRepository
import ort.edu.ar.tp3.primerparcial.grupo4.service.ApiService
import ort.edu.ar.tp3.primerparcial.grupo4.service.CarService

class HomeFragment : Fragment() {

    private lateinit var apiCarService: CarService
    private lateinit var carRepository: CarRepository
    private lateinit var carCategoryListAdapter: CarCategoryListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Instance CarService
        apiCarService = ApiService.getRetrofit().create(CarService::class.java)

        // Instance CarRepository
        carRepository = CarRepository(apiCarService)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        carCategoryListAdapter = CarCategoryListAdapter()

        val recyclerViewCategoria = view.findViewById<RecyclerView>(R.id.rec_categorias)
        recyclerViewCategoria.adapter = carCategoryListAdapter

        val linearLayoutManager = LinearLayoutManager(context)
        recyclerViewCategoria.layoutManager = linearLayoutManager

        fetchDataAndUpdateLiveData()

        return view
    }

    private fun fetchDataAndUpdateLiveData() {
        val carCategories = carRepository.getCarCategories()

        carCategories.observe(viewLifecycleOwner, Observer {
            carCategoryListAdapter.updateData(it)
        })
    }

}