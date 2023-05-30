package ort.edu.ar.tp3.primerparcial.grupo4.ui.holders

import android.net.Uri
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import ort.edu.ar.tp3.primerparcial.grupo4.R

class MakeViewHolder(v: View) : RecyclerView.ViewHolder(v) {

    private var view: View

    init {
        this.view = v

    }

    fun setTitulo(titulo: String) {
        val txt = this.view.findViewById<TextView>(R.id.txt_make)
        txt.text = titulo
    }

    fun setCounter(counter: String) {
        val txt = this.view.findViewById<TextView>(R.id.txt_counter)
        txt.text = counter
    }


    fun setImagen(imagen: String) {
        val txt = this.view.findViewById<ImageView>(R.id.img_car_make)
        val uriGral = "android.resource://ort.edu.ar.tp3.primerparcial.grupo4/drawable/" + imagen
        val uri = Uri.parse(uriGral)
        txt.setImageURI(uri)
    }
}