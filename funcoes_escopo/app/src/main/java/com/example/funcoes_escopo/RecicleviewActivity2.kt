package com.example.funcoes_escopo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecicleviewActivity2 : AppCompatActivity() {

    private lateinit var rvLista: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recicleview2)

        val lista = arrayOf(
            Pair("Igor Torres", "12:50"),
            Pair("Julia Lyssa", "20:30"),
            Pair("Mãe", "08:20"),
            Pair("Pai", "23:21")

        )


        rvLista = findViewById(R.id.rv_lista)
        rvLista.adapter = MensagemAdapter(lista)
        rvLista.layoutManager = LinearLayoutManager(this)

    }
}