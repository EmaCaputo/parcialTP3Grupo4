package ort.edu.ar.tp3.primerparcial.grupo4.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ort.edu.ar.tp3.primerparcial.grupo4.R
import ort.edu.ar.tp3.primerparcial.grupo4.data.entities.CarBrand
import ort.edu.ar.tp3.primerparcial.grupo4.holders.CarBrandViewHolder

class CarBrandListAdapter : RecyclerView.Adapter<CarBrandViewHolder>() {

    private var carBrandList: List<CarBrand> = emptyList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarBrandViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.recycler_car_brand, parent, false)
        return CarBrandViewHolder(view)
    }

    override fun getItemCount(): Int {
        return carBrandList.size
    }

    override fun onBindViewHolder(holder: CarBrandViewHolder, position: Int) {
        holder.setCarBrand(carBrandList[position])
    }

    fun updateData(carBrandList: List<CarBrand>) {
        this.carBrandList = carBrandList
        notifyDataSetChanged()
    }

}