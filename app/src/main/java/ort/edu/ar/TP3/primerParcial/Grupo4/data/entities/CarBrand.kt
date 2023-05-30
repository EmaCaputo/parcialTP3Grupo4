package ort.edu.ar.tp3.primerparcial.grupo4.data.entities

// Car Brand
class CarBrand(brand: String, asset: Int, quantity: String) {
    var brand: String = ""
    var asset: Int = 0
    var quantity: String = ""

    init {
        this.brand = brand
        this.asset = asset
        this.quantity = quantity
    }
}