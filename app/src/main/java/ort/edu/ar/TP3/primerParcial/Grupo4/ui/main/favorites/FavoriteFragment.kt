package ort.edu.ar.tp3.primerparcial.grupo4.ui.main.favorites

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatDelegate
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import ort.edu.ar.tp3.primerparcial.grupo4.R

class FavoriteFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_favorite, container, false)

        val mainLayout = view.findViewById<ConstraintLayout>(R.id.fragment_fav)

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