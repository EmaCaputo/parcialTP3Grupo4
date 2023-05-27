package ort.edu.ar.tp3.primerparcial.grupo4.ui.main.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import ort.edu.ar.TP3.primerParcial.Grupo4.ui.adapters.CategoriaListAdapter
import ort.edu.ar.TP3.primerParcial.Grupo4.ui.entities.Categoria
import ort.edu.ar.tp3.primerparcial.grupo4.R
import ort.edu.ar.tp3.primerparcial.grupo4.ui.main.MainActivity

class HomeFragment : Fragment() {

    var listaCategorias : MutableList<Categoria> = ArrayList<Categoria>()

    override fun onCreate (savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {

        var vista = inflater.inflate(R.layout.fragment_home, container, false)


        listaCategorias.add(Categoria("Deportivos", "white"))
        listaCategorias.add(Categoria("SUV", "white"))
        listaCategorias.add(Categoria("ELÉCTRICOS", "white"))

        val recyclerViewCategoria = vista.findViewById<RecyclerView>(R.id.rec_categorias)
        recyclerViewCategoria.adapter = CategoriaListAdapter(listaCategorias)
        val linearLayoutManager = LinearLayoutManager(context)
        recyclerViewCategoria.layoutManager = linearLayoutManager

        return vista
    }


}