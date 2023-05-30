package ort.edu.ar.tp3.primerparcial.grupo4.ui.main.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatDelegate
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import ort.edu.ar.tp3.primerparcial.grupo4.R

class ProfileFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_profile, container, false)
        val mainLayout = view.findViewById<ConstraintLayout>(R.id.fragment_profile)

        if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES) {
            // Modo oscuro activado
            mainLayout.setBackgroundColor(
                ContextCompat.getColor(requireContext(), R.color.white_2)
            )

        } else {
            // Modo claro activado
            mainLayout.setBackgroundColor(
                ContextCompat.getColor(requireContext(), R.color.white)
            )
        }

        return view
    }
}