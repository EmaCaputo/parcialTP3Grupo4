package ort.edu.ar.TP3.primerParcial.Grupo4.data.entities

import java.io.Serializable

class Categoria(titulo: String?, color: String?, imagen: String?) : Serializable {

    var titulo: String = ""
    var color: String = ""
    var imagen: String = ""

    init {
        this.titulo = titulo!!
        this.color = color!!
        this.imagen = imagen!!
    }


}