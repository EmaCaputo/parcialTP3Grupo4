package ort.edu.ar.tp3.primerparcial.grupo4.data.entities

// Car Brand
class CarBrand(brand: String, asset: Int, quantity: String) {
    var title: String = ""
    var img: Int = 0
    var quantity: String = ""

    init {
        this.title = brand
        this.img = asset
        this.quantity = quantity
    }
}