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
import ort.edu.ar.tp3.primerparcial.grupo4.adapters.CarBrandListAdapter
import ort.edu.ar.tp3.primerparcial.grupo4.adapters.CarCategoryListAdapter
import ort.edu.ar.tp3.primerparcial.grupo4.data.repository.CarRepository
import ort.edu.ar.tp3.primerparcial.grupo4.service.ApiService
import ort.edu.ar.tp3.primerparcial.grupo4.service.CarService

class HomeFragment : Fragment() {

    private lateinit var apiCarService: CarService
    private lateinit var carRepository: CarRepository
    private lateinit var carBrandListAdapter: CarBrandListAdapter
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

        // Setup Car Brand Adapter
        setupCarBrandAdapter(view)

        // Setup Car Category Adapter
        setupCarCategoryAdapter(view)

        // Fetch brands
        fetchCarBrands()

        // Fetch categories
        fetchCarCategories()

        return view
    }

    private fun setupCarBrandAdapter(view: View) {
        carBrandListAdapter = CarBrandListAdapter()

        val recyclerViewCarBrand = view.findViewById<RecyclerView>(R.id.recycler_view_car_brand)
        recyclerViewCarBrand.adapter = carBrandListAdapter

        val linearLayoutManagerHorizontal =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        recyclerViewCarBrand.layoutManager = linearLayoutManagerHorizontal
    }

    private fun setupCarCategoryAdapter(view: View) {
        carCategoryListAdapter = CarCategoryListAdapter()

        val recyclerViewCarCategory = view.findViewById<RecyclerView>(R.id.recycler_view_car_categories)
        recyclerViewCarCategory.adapter = carCategoryListAdapter

        val linearLayoutManagerVertical =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        recyclerViewCarCategory.layoutManager = linearLayoutManagerVertical
    }

    private fun fetchCarBrands() {
        val carBrands = carRepository.getCarBrands()

        carBrands.observe(viewLifecycleOwner, Observer {
            carBrandListAdapter.updateData(it)
        })
    }

    private fun fetchCarCategories() {
        val carCategories = carRepository.getCarCategories()

        carCategories.observe(viewLifecycleOwner, Observer {
            carCategoryListAdapter.updateData(it)
        })
    }

}