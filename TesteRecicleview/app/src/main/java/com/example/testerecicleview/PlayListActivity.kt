package com.example.testerecicleview

import android.content.ClipData.Item
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class PlayListActivity : AppCompatActivity() {

    lateinit var listaPlaylist : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play_list)


        val lista = listOf(
            Quadruple(R.drawable.ret, "A meu favor", "Felipe Ret", "02:15"),
            Quadruple(R.drawable.wiu, "Limão", "WIU", "03:57"),
            Quadruple(R.drawable.tupac, "All eyes on me", "2pac", "05:08"),
            Quadruple(R.drawable.wiu, "Brinca demais", "Wiu", "03:14"),
            Quadruple(R.drawable.tupac, "Hail Mary", "2pac", "05:12"),
            Quadruple(R.drawable.ret, "War", "Felipe Ret", "02:32")
        )

        listaPlaylist = findViewById(R.id.lista_Playlist)


        listaPlaylist.adapter = MusciaAdapter(lista)
        listaPlaylist.layoutManager = LinearLayoutManager(this)

    }
}