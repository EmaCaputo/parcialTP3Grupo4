package ort.edu.ar.tp3.primerparcial.grupo4.data.entities;

class Car(
    model: String?,
    year: Int?,
    fuelType: String?,
    transmission: String?,
    cylinders: String?,
    brand: String?
) {
    var model: String = ""
    var year: Int = 0
    var fuelType: String = ""
    var transmission: String = ""
    var cylinders: String = ""
    var brand: String = ""

    init {
        this.model = model!!
        this.year = year!!
        this.fuelType = fuelType!!
        this.transmission = transmission!!
        this.cylinders = cylinders!!
        this.brand = brand!!
    }

}
