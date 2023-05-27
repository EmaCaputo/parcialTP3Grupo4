package ort.edu.ar.TP3.primerParcial.Grupo4.ui.holders

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import ort.edu.ar.tp3.primerparcial.grupo4.R

class CategoriasViewHolder (v: View) : RecyclerView.ViewHolder(v) {

    private var view: View

    init {
        this.view = v

    }

    fun setTitulo(titulo: String){
        val txt = this.view.findViewById<TextView>(R.id.category_title)
        txt.text = titulo
    }



   /* fun setColor(color: String){
        val txt = this.view.findViewById<TextView>(R.id.category_title)
        txt.text = color
    }*/


}