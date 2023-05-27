package ort.edu.ar.TP3.primerParcial.Grupo4.ui.entities

import java.io.Serializable

class Categoria (titulo: String?, color: String?) : Serializable {

    var titulo: String= ""
    var color: String= ""

    init {
        this.titulo = titulo!!
        this.color = color!!
    }


}