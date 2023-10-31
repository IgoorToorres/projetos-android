package com.example.aulaactivityfragment

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {

    lateinit var btnFechar: Button
    lateinit var resultado: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        resultado = findViewById(R.id.texto_resultado)
        btnFechar = findViewById(R.id.btn_segunda_pagina)
        btnFechar.setOnClickListener {
            finish()
        }

        val bundle = intent.extras // todos os parametros
        if(bundle != null){
 /*           val serie = bundle.getString("serie")
            val notaIMDB = bundle.getDouble("IMDB")
            val idadeMinima = bundle.getInt("idade")*/
            val filme = if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU){
                //bundle.getSerializable("filme", Filme::class.java)
                bundle.getParcelable("filme", Filme::class.java)
            }else{
                //bundle.getSerializable("filme") as Filme
                bundle.getParcelable("filme")
            }

            resultado.text = "Filme: ${filme?.nome} , Nota IMDB: ${filme?.nota}, Diretor: ${filme?.diretor}"

        }


    }


}