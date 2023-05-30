package ort.edu.ar.tp3.primerparcial.grupo4.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ort.edu.ar.tp3.primerparcial.grupo4.R
import ort.edu.ar.TP3.primerParcial.Grupo4.data.entities.Make
import ort.edu.ar.tp3.primerparcial.grupo4.ui.holders.MakeViewHolder

class MakeListAdapter(
    private val makeList: MutableList<Make>
) : RecyclerView.Adapter<MakeViewHolder> () {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MakeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_car_brand, parent, false)
        return MakeViewHolder(view)
    }

    override fun getItemCount(): Int {
       return makeList.size
    }

    override fun onBindViewHolder(holder: MakeViewHolder, position: Int) {
        val make = makeList[position]
        holder.setTitulo(make.titulo)
        holder.setCounter(make.counter)
        holder.setImagen(make.imagen)
    }


}