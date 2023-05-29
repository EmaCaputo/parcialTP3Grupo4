package ort.edu.ar.tp3.primerparcial.grupo4.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ort.edu.ar.tp3.primerparcial.grupo4.ui.holders.CategoriasViewHolder
import ort.edu.ar.tp3.primerparcial.grupo4.R
import ort.edu.ar.tp3.primerparcial.grupo4.ui.entities.Categoria

class CategoriaListAdapter(
    private val categoriasList: MutableList<Categoria>
) : RecyclerView.Adapter<CategoriasViewHolder> () {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoriasViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_car_category, parent, false)
        return CategoriasViewHolder(view)
    }

    override fun getItemCount(): Int {
       return categoriasList.size
    }

    override fun onBindViewHolder(holder: CategoriasViewHolder, position: Int) {
        val categoria = categoriasList[position]
        holder.setTitulo(categoria.titulo)
        holder.setColor(categoria.color)
        holder.setImagen(categoria.imagen)
    }


}