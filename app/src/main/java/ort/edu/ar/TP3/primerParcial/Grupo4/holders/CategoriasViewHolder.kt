package ort.edu.ar.tp3.primerparcial.grupo4.holders

import android.content.res.Resources
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import ort.edu.ar.tp3.primerparcial.grupo4.R
import ort.edu.ar.tp3.primerparcial.grupo4.data.entities.CarCategory

class CarCategoryViewHolder(v: View) : RecyclerView.ViewHolder(v) {

    private var view: View

    init {
        this.view = v
    }

    fun setCarCategory(carCategory: CarCategory) {
        val txtViewTitle = this.view.findViewById<TextView>(R.id.txt_view_car_category_title)
        txtViewTitle.text = this.view.context.getString(carCategory.title)

        val imgViewCarCategoryBackground =
            this.view.findViewById<ImageView>(R.id.img_view_car_category_bg)
        imgViewCarCategoryBackground.setBackgroundResource(carCategory.color)

        val imgViewCarCategoryImg =
            this.view.findViewById<ImageView>(R.id.img_view_car_category_img)
        imgViewCarCategoryImg.setImageResource(carCategory.image)
    }

}