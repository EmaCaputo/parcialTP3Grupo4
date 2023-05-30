package ort.edu.ar.tp3.primerparcial.grupo4.ui.main.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import ort.edu.ar.tp3.primerparcial.grupo4.ui.adapters.CategoriaListAdapter
import ort.edu.ar.TP3.primerParcial.Grupo4.data.entities.Categoria
import ort.edu.ar.TP3.primerParcial.Grupo4.data.entities.Make
import ort.edu.ar.tp3.primerparcial.grupo4.R
import ort.edu.ar.tp3.primerparcial.grupo4.ui.adapters.MakeListAdapter

class HomeFragment : Fragment() {

    var listaCategorias: MutableList<Categoria> = ArrayList<Categoria>()
    var listaMake: MutableList<Make> = ArrayList<Make>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        listaCategorias.add(Categoria("Deportivos", "shape_bg_category_dep", "img_deportive"))
        listaCategorias.add(Categoria("SUV", "shape_bg_category_suv", "img_suv"))
        listaCategorias.add(Categoria("ELÉCTRICOS", "shape_bg_category_elec", "img_electricos"))

        listaMake.add(Make("Audi", "+4", "audi"))
        listaMake.add(Make("BMW", "+8", "bmw"))
        listaMake.add(Make("Dodge", "+2", "dodge"))
        listaMake.add(Make("Ferrari", "+3", "ferrari"))
        listaMake.add(Make("Mercedes", "+7", "mercedes"))
        listaMake.add(Make("Togg", "+1", "togg"))
        listaMake.add(Make("Toyota", "+4", "toyota"))
        listaMake.add(Make("Volkswagen", "+10", "volkswagen"))
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {

        var vista = inflater.inflate(R.layout.fragment_home, container, false)


        val recyclerViewCategoria = vista.findViewById<RecyclerView>(R.id.rec_categorias)
        recyclerViewCategoria.adapter = CategoriaListAdapter(listaCategorias)
        val linearLayoutManager = LinearLayoutManager(context)
        recyclerViewCategoria.layoutManager = linearLayoutManager

        val recyclerViewMake = vista.findViewById<RecyclerView>(R.id.rec_marcas)
        recyclerViewMake.adapter = MakeListAdapter(listaMake)
        val linearLayoutManager2 = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        recyclerViewMake.layoutManager = linearLayoutManager2


        return vista
    }

}