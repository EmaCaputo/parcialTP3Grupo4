package ort.edu.ar.tp3.primerparcial.grupo4.data.entities;

// Object from Api Ninja
class CarResponse {
    var model: String = ""
    var year: Int = 0
    var fuel_type: String = ""
    var transmission: String = ""
    var make: String = ""
}

// Map CarResponse to Car
class Car(carResponse: CarResponse) {
    var model: String = ""
    var year: Int = 0
    var fuelType: String = ""
    var transmission: String = ""
    var brand: String = ""

    init {
        this.model = carResponse.model
        this.year = carResponse.year
        this.fuelType = carResponse.fuel_type
        this.transmission = carResponse.transmission
        this.brand = carResponse.make
    }
}
