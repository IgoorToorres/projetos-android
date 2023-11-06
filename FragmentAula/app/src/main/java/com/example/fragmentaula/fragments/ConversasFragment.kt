package com.example.fragmentaula.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.fragmentaula.R

class ConversasFragment : Fragment() {

    private lateinit var editNome: EditText
    private lateinit var btnEnviar: Button
    private lateinit var textResultado: TextView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(
            R.layout.fragment_conversas,
            container,
            false
        )

        editNome = view.findViewById(R.id.edit_nome)
        btnEnviar = view.findViewById(R.id.btn_enviar)
        textResultado = view.findViewById(R.id.text_resultado)


        btnEnviar.setOnClickListener {
            textResultado.text = editNome.text.toString()
        }


        return view



    }

}