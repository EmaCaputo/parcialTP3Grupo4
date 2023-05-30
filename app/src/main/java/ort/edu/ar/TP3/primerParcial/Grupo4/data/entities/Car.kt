package ort.edu.ar.tp3.primerparcial.grupo4.data.entities;

class Car(
    model: String?,
    year: Int?,
    fuelType: String?,
    transmission: String?,
    make: String?,
    brand: String?
) {
    var model: String = ""
    var year: Int = 0
    var fuelType: String = ""
    var transmission: String = ""
    var brand: String = ""
    var make: String = ""

    init {
        this.model = model!!
        this.year = year!!
        this.fuelType = fuelType!!
        this.transmission = transmission!!
        this.brand = brand!!
        this.make = make!!
    }

}
