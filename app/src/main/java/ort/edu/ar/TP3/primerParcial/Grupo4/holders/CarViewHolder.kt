package ort.edu.ar.tp3.primerparcial.grupo4.holders

import android.annotation.SuppressLint
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import ort.edu.ar.tp3.primerparcial.grupo4.R
import ort.edu.ar.tp3.primerparcial.grupo4.data.entities.Car

class CarViewHolder(v: View) : RecyclerView.ViewHolder(v) {

    private var view: View

    init {
        this.view = v

    }

    @SuppressLint("SetTextI18n")
    fun setCar(car: Car) {
        val textViewCarInfoTitle = this.view.findViewById<TextView>(R.id.txt_view_car_info_title)
        textViewCarInfoTitle.text = car.model

        val imgViewCarInfoImg = this.view.findViewById<ImageView>(R.id.img_view_car_info_img)
        imgViewCarInfoImg.setImageResource(this.getCarImg(car.brand))

        val textViewCarInfoTransmission =
            this.view.findViewById<TextView>(R.id.txt_view_car_info_transmission)
        textViewCarInfoTransmission.text = this.getTransmission(car.transmission)

        val textViewCarInfoFuel = this.view.findViewById<TextView>(R.id.txt_view_car_info_fuel)
        textViewCarInfoFuel.text =
            car.fuelType[0].uppercaseChar() + car.fuelType.substring(1, car.fuelType.length)

        val textViewCarInfoYear = this.view.findViewById<TextView>(R.id.txt_view_car_info_year)
        textViewCarInfoYear.text = car.year.toString()

        val textViewCarInfoSeater = this.view.findViewById<TextView>(R.id.txt_view_car_info_seater)
        textViewCarInfoSeater.text = (car.cylinders.toString() + " Seater")
    }

    private fun getTransmission(transmission: String): String {
        return if (transmission == "a") {
            "Automatic"
        } else {
            "Manual"
        }
    }

    private fun getCarImg(brand: String): Int {
        val carImgs = HashMap<Int, String>()
        carImgs[R.drawable.ic_brand_acura] = "acura"
        carImgs[R.drawable.ic_brand_alfa] = "alfa"
        carImgs[R.drawable.ic_brand_bmw] = "bmw"
        carImgs[R.drawable.ic_brand_ferrari] = "ferrari"
        carImgs[R.drawable.ic_brand_fiat] = "fiat"
        carImgs[R.drawable.ic_brand_ford] = "ford"
        carImgs[R.drawable.ic_brand_honda] = "honda"
        carImgs[R.drawable.ic_brand_hyundai] = "hyundai"
        carImgs[R.drawable.ic_brand_jeep] = "jeep"
        carImgs[R.drawable.ic_brand_kia] = "kia"
        carImgs[R.drawable.ic_brand_lotus] = "lotus"
        carImgs[R.drawable.ic_brand_mercedes] = "mercedes"
        carImgs[R.drawable.ic_brand_volkswagen] = "volkswagen"

        for (key in carImgs.keys) {
            if (carImgs[key]?.contains(brand) == true) {
                return key;
            }
        }

        return R.drawable.ic_car_notification;

    }

    /*fun setCar(car: Car) {
        val txt = this.view.findViewById<TextView>(R.id.txt_model)
        txt.text = car.model
    }

    fun setImagen(imagen: String) {
        val txt = this.view.findViewById<ImageView>(R.id.img_marca)
        val uriGral = "android.resource://ort.edu.ar.tp3.primerparcial.grupo4/drawable/" + imagen
        val uri = Uri.parse(uriGral)
        txt.setImageURI(uri)
    }

    fun setTransmition(transmission: String) {
        val txt = this.view.findViewById<TextView>(R.id.txt_transmition)
        txt.text = transmission
    }


    fun setGasoline(gasoline: String) {
        val txt = this.view.findViewById<TextView>(R.id.txt_gasoline)
        txt.text = gasoline
    }

    fun setYear(year: Int) {
        val year = this.view.findViewById<TextView>(R.id.txt_year)
        year.text = year.toString()
    }
    fun setSeater(brand: String) {
        val txt = this.view.findViewById<TextView>(R.id.txt_seater)
        txt.text = brand
    }*/

}