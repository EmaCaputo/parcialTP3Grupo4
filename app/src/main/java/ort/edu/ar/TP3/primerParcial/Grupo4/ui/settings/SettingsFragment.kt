package ort.edu.ar.tp3.primerparcial.grupo4.ui.settings

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Switch
import androidx.appcompat.app.AppCompatDelegate
import androidx.fragment.app.Fragment
import ort.edu.ar.tp3.primerparcial.grupo4.R

class SettingsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val vista = inflater.inflate(R.layout.fragment_settings, container, false)

        vista.findViewById<Switch>(R.id.switch_oscuro)
            .setOnCheckedChangeListener { compoundButton, b ->
                if (compoundButton.isChecked) {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
                } else {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
                }
            }

        return vista
    }

}
