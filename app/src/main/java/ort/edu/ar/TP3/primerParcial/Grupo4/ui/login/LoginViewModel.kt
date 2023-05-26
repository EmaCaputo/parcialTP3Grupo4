package ort.edu.ar.TP3.primerParcial.Grupo4.ui.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ort.edu.ar.tp3.primerparcial.grupo4.ui.login.LoginActivity

class LoginViewModel : ViewModel() {

    private val _nombreUsuario = MutableLiveData<String>()

    val nombreUsuario: LiveData<String>
        get() = _nombreUsuario
}