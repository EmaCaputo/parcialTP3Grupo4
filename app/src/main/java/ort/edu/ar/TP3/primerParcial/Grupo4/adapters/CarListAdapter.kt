package ort.edu.ar.tp3.primerparcial.grupo4.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ort.edu.ar.tp3.primerparcial.grupo4.R
import ort.edu.ar.tp3.primerparcial.grupo4.data.entities.Car
import ort.edu.ar.tp3.primerparcial.grupo4.holders.CarCategoryViewHolder

class CarListAdapter : RecyclerView.Adapter<CarCategoryViewHolder>() {

    private var carList: List<Car> = emptyList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarCategoryViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.recycler_car_category, parent, false)
        return CarCategoryViewHolder(view)
    }

    override fun getItemCount(): Int {
        return carList.size
    }

    override fun onBindViewHolder(holder: CarCategoryViewHolder, position: Int) {
        val categoria = carList[position]
        // holder.setTitulo(categoria.model)
    }

    fun updateCarList(cars: List<Car>) {
        carList = cars
        notifyDataSetChanged()
    }

}