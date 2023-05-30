package ort.edu.ar.tp3.primerparcial.grupo4.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ort.edu.ar.tp3.primerparcial.grupo4.R
import ort.edu.ar.tp3.primerparcial.grupo4.data.entities.Car
import ort.edu.ar.tp3.primerparcial.grupo4.data.entities.CarCategory
import ort.edu.ar.tp3.primerparcial.grupo4.holders.CarCategoryViewHolder

class CarCategoryListAdapter : RecyclerView.Adapter<CarCategoryViewHolder>() {

    private var carCategoryList: List<CarCategory> = emptyList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarCategoryViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.recycler_car_category, parent, false)
        return CarCategoryViewHolder(view)
    }

    override fun getItemCount(): Int {
        return carCategoryList.size
    }

    override fun onBindViewHolder(holder: CarCategoryViewHolder, position: Int) {
        carCategoryList[position]
        holder.setCarCategory(carCategoryList[position])
    }

    fun updateData(carCategoryList: List<CarCategory>) {
        this.carCategoryList = carCategoryList
        notifyDataSetChanged()
    }


}