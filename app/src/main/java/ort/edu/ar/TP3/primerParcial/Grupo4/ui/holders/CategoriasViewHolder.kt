package ort.edu.ar.TP3.primerParcial.Grupo4.ui.holders

import android.graphics.drawable.Drawable
import android.net.Uri
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import ort.edu.ar.tp3.primerparcial.grupo4.R
import android.util.Log


class CategoriasViewHolder (v: View) : RecyclerView.ViewHolder(v) {

    private var view: View

    init {
        this.view = v

    }

    fun setTitulo(titulo: String){
        val txt = this.view.findViewById<TextView>(R.id.category_title)
        txt.text = titulo
    }



   fun setColor(color: String){
        val txt = this.view.findViewById<ImageView>(R.id.background_category)
        val uriGral = "android.resource://ort.edu.ar.tp3.primerparcial.grupo4/drawable/" + color
        val uri = Uri.parse(uriGral)
        txt.setImageURI(uri)
    }

    fun setImagen(imagen: String){
        val txt = this.view.findViewById<ImageView>(R.id.image_car)
        val uriGral = "android.resource://ort.edu.ar.tp3.primerparcial.grupo4/drawable/" + imagen
        val uri = Uri.parse(uriGral)
        txt.setImageURI(uri)
    }
}