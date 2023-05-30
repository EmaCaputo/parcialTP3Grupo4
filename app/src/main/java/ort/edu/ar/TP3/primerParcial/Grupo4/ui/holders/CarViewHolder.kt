package ort.edu.ar.tp3.primerparcial.grupo4.ui.holders

import android.net.Uri
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import ort.edu.ar.tp3.primerparcial.grupo4.R

class CarViewHolder(v: View) : RecyclerView.ViewHolder(v) {

    private var view: View

    init {
        this.view = v

    }

    fun setModel(model: String) {
        val txt = this.view.findViewById<TextView>(R.id.txt_model)
        txt.text = model
    }

    fun setImagen(imagen: String) {
        val txt = this.view.findViewById<ImageView>(R.id.img_marca)
        val uriGral = "android.resource://ort.edu.ar.tp3.primerparcial.grupo4/drawable/" + imagen
        val uri = Uri.parse(uriGral)
        txt.setImageURI(uri)
    }

    fun setTransmition(transmission: String) {
        val txt = this.view.findViewById<TextView>(R.id.txt_transmition)
        txt.text = transmission
    }


    fun setGasoline(gasoline: String) {
        val txt = this.view.findViewById<TextView>(R.id.txt_gasoline)
        txt.text = gasoline
    }

    fun setYear(year: Int) {
        val year = this.view.findViewById<TextView>(R.id.txt_year)
        year.text = year.toString()
    }
    fun setSeater(brand: String) {
        val txt = this.view.findViewById<TextView>(R.id.txt_seater)
        txt.text = brand
    }

}