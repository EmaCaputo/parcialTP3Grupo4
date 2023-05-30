package ort.edu.ar.tp3.primerparcial.grupo4.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ort.edu.ar.tp3.primerparcial.grupo4.R
import ort.edu.ar.tp3.primerparcial.grupo4.data.entities.Car
import ort.edu.ar.tp3.primerparcial.grupo4.holders.CarViewHolder

class CarListAdapter : RecyclerView.Adapter<CarViewHolder>() {

    private var carList: List<Car> = emptyList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.recycler_car_info, parent, false)
        return CarViewHolder(view)
    }

    override fun getItemCount(): Int {
        return carList.size
    }

    override fun onBindViewHolder(holder: CarViewHolder, position: Int) {
        holder.setCar(carList[position])
    }

    fun updateData(cars: List<Car>) {
        carList = cars
        notifyDataSetChanged()
    }

}