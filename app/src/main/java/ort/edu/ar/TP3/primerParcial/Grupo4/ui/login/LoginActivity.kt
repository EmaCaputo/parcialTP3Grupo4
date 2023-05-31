package ort.edu.ar.tp3.primerparcial.grupo4.ui.login

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import ort.edu.ar.tp3.primerparcial.grupo4.R
import ort.edu.ar.tp3.primerparcial.grupo4.ui.main.MainActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnLogin = findViewById<Button>(R.id.btn_login)

        btnLogin.background.alpha = 192

        val editTextPass = findViewById<EditText>(R.id.edit_txt_pass)

        val editTextUsername = findViewById<EditText>(R.id.edit_txt_username)

        editTextUsername.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(
                s: CharSequence, start: Int,
                before: Int, count: Int
            ) {
                if (s.isNotEmpty() && editTextPass.text.isNotEmpty()) {
                    btnLogin.background.alpha = 250
                    btnLogin.isEnabled = true
                } else {
                    btnLogin.background.alpha = 192
                    btnLogin.isEnabled = false
                }
            }
        })

        editTextPass.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(
                s: CharSequence, start: Int,
                before: Int, count: Int
            ) {
                if (s.isNotEmpty() && editTextUsername.text.isNotEmpty()) {
                    btnLogin.background.alpha = 250
                    btnLogin.isEnabled = true
                } else {
                    btnLogin.background.alpha = 192
                    btnLogin.isEnabled = false
                }
            }
        })

        btnLogin.setOnClickListener {
            val intent = Intent(this@LoginActivity, MainActivity::class.java)
            intent.putExtra("username", editTextUsername.text.toString())

            startActivity(intent)
        }
    }

}