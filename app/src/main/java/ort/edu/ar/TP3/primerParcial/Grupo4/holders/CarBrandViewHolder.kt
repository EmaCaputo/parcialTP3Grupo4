package ort.edu.ar.tp3.primerparcial.grupo4.holders

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import ort.edu.ar.tp3.primerparcial.grupo4.R
import ort.edu.ar.tp3.primerparcial.grupo4.data.entities.CarBrand

class CarBrandViewHolder(v: View) : RecyclerView.ViewHolder(v) {

    private var view: View

    init {
        this.view = v
    }

    fun setCarBrand(carBrand: CarBrand) {
        val txtViewTitle = this.view.findViewById<TextView>(R.id.txt_view_car_title)
        txtViewTitle.text = carBrand.title

        val txtViewQuantity = this.view.findViewById<TextView>(R.id.txt_view_car_quantity)
        txtViewQuantity.text = carBrand.quantity

        val imgViewCarCategoryImg =
            this.view.findViewById<ImageView>(R.id.img_view_car_brand)
        imgViewCarCategoryImg.setImageResource(carBrand.img)
    }
}