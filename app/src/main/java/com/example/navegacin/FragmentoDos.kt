package com.example.navegacin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class FragmentoDos : Fragment() {

    lateinit var botonDos:Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val vistaDos=inflater.inflate(R.layout.fragment_fragmento_dos, container, false)
        botonDos = vistaDos.findViewById(R.id.button2)
        botonDos.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentoDos_to_fragmentoUno)
        }
        return vistaDos
    }
}