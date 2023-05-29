package ort.edu.ar.tp3.primerparcial.grupo4.ui.entities

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