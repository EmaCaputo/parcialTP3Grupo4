package ort.edu.ar.tp3.primerparcial.grupo4.data.repository

import androidx.lifecycle.MutableLiveData
import ort.edu.ar.tp3.primerparcial.grupo4.R
import ort.edu.ar.tp3.primerparcial.grupo4.data.entities.Car
import ort.edu.ar.tp3.primerparcial.grupo4.data.entities.CarBrand
import ort.edu.ar.tp3.primerparcial.grupo4.data.entities.CarCategory
import ort.edu.ar.tp3.primerparcial.grupo4.data.entities.CarResponse
import ort.edu.ar.tp3.primerparcial.grupo4.service.CarService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CarRepository(private val apiService: CarService) {

    fun getCars(fuelType: String): MutableLiveData<List<Car>> {
        val liveData = MutableLiveData<List<Car>>()
        val response = apiService.getCars(fuelType)

        response.enqueue(object : Callback<List<CarResponse>> {
            override fun onResponse(
                call: Call<List<CarResponse>>, response: Response<List<CarResponse>>
            ) {
                if (response.isSuccessful) {
                    val cars = response.body()?.map { carResponse -> Car(carResponse) } as List<Car>
                    liveData.value = cars
                } else {
                    liveData.value = emptyList()
                }
            }

            override fun onFailure(call: Call<List<CarResponse>>, t: Throwable) {
                liveData.value = emptyList()
            }
        })

        return liveData
    }

    fun getCarBrands(): MutableLiveData<List<CarBrand>> {
        val liveData = MutableLiveData<List<CarBrand>>()

        liveData.value = listOf<CarBrand>(
            CarBrand("Acura", R.drawable.ic_brand_acura, "+10"),
            CarBrand("Alfa Romeo", R.drawable.ic_brand_alfa, "+8"),
            CarBrand("BMW", R.drawable.ic_brand_bmw, "+5"),
            CarBrand("Ferrari", R.drawable.ic_brand_ferrari, "+1"),
            CarBrand("Fiat", R.drawable.ic_brand_fiat, "+20"),
            CarBrand("Ford", R.drawable.ic_brand_ford, "+18"),
            CarBrand("Hyundai", R.drawable.ic_brand_hyundai, "+7"),
            CarBrand("Jeep", R.drawable.ic_brand_jeep, "+9"),
            CarBrand("Kia", R.drawable.ic_brand_kia, "+2"),
            CarBrand("Lotus", R.drawable.ic_brand_lotus, "+14"),
            CarBrand("Mercedes Benz", R.drawable.ic_brand_mercedes, "+16")
        )

        return liveData
    }

    fun getCarCategories(): MutableLiveData<List<CarCategory>> {
        val liveData = MutableLiveData<List<CarCategory>>()

        liveData.value = listOf<CarCategory>(
            CarCategory(
                R.string.recycler_car_category_sport,
                R.drawable.shape_bg_car_category_sport,
                R.drawable.img_car_category_sport
            ), CarCategory(
                R.string.recycler_car_category_suv,
                R.drawable.shape_bg_car_category_suv,
                R.drawable.img_car_category_suv
            ), CarCategory(
                R.string.recycler_car_category_electric,
                R.drawable.shape_bg_car_category_electric,
                R.drawable.img_car_category_electric
            )
        )

        return liveData
    }

}