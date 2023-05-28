package ort.edu.ar.TP3.primerParcial.Grupo4.ui.entities

import android.graphics.drawable.Drawable
import android.net.Uri
import java.io.Serializable

class Categoria (titulo: String?, color: String?, imagen: String?) : Serializable {

    var titulo: String= ""
    var color: String= ""
    var imagen: String= ""

    init {
        this.titulo = titulo!!
        this.color = color!!
        this.imagen = imagen!!
    }


}