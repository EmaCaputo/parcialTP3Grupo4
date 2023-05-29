package ort.edu.ar.tp3.primerparcial.grupo4.ui.main.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import ort.edu.ar.tp3.primerparcial.grupo4.ui.adapters.CategoriaListAdapter
import ort.edu.ar.tp3.primerparcial.grupo4.ui.entities.Categoria
import ort.edu.ar.tp3.primerparcial.grupo4.R

class HomeFragment : Fragment() {

    var listaCategorias: MutableList<Categoria> = ArrayList<Categoria>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        listaCategorias.add(Categoria("Deportivos", "shape_bg_category_dep", "img_deportive"))
        listaCategorias.add(Categoria("SUV", "shape_bg_category_suv", "img_suv"))
        listaCategorias.add(Categoria("ELÉCTRICOS", "shape_bg_category_elec", "img_electricos"))

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {

        var vista = inflater.inflate(R.layout.fragment_home, container, false)


        val recyclerViewCategoria = vista.findViewById<RecyclerView>(R.id.rec_categorias)
        recyclerViewCategoria.adapter = CategoriaListAdapter(listaCategorias)
        val linearLayoutManager = LinearLayoutManager(context)
        recyclerViewCategoria.layoutManager = linearLayoutManager


        return vista
    }

}