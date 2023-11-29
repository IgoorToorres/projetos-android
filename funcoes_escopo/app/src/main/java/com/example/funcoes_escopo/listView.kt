package com.example.funcoes_escopo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.funcoes_escopo.R.id.list_usuarios

class listView : AppCompatActivity() {

    lateinit var listUsuariosView : ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        val listaUsuarios = listOf(
            "igor", "julia", "natan", "bia"
        )

        listUsuariosView = findViewById(R.id.list_usuarios)
        listUsuariosView.adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            android.R.id.text1,
            listaUsuarios
        )

    }
}