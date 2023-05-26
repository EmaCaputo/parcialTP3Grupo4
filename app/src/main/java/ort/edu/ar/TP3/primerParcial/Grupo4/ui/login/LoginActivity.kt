package ort.edu.ar.tp3.primerparcial.grupo4.ui.login

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import ort.edu.ar.tp3.primerparcial.grupo4.R
import ort.edu.ar.tp3.primerparcial.grupo4.ui.main.MainActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // TODO: Implementar "Pseudo login" para mandar a la home
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 1000)
    }

}