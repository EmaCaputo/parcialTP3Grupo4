package ort.edu.ar.TP3.primerParcial.Grupo4.data.entities

import java.io.Serializable

class Make(titulo: String?, counter: String?, imagen: String?) : Serializable {

    var titulo: String = ""
    var counter: String = ""
    var imagen: String = ""

    init {
        this.titulo = titulo!!
        this.counter = counter!!
        this.imagen = imagen!!
    }


}