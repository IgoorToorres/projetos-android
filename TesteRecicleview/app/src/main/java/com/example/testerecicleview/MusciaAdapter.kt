package com.example.testerecicleview

import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import org.w3c.dom.Text

class MusciaAdapter (
    private val lista: List<Quadruple<Int, String, String, String>>
) : Adapter<MusciaAdapter.MusicaViewHolder>() {

    inner class MusicaViewHolder(
        itemView : View
    ) : ViewHolder(itemView){
        val nomeArtista : TextView = itemView.findViewById(R.id.nome_artitsta)
        val nomeMusica : TextView = itemView.findViewById(R.id.nome_musica)
        val tempoMusica : TextView = itemView.findViewById(R.id.tempo_musica)
        val imgMusica : ImageView = itemView.findViewById(R.id.img_artista)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusicaViewHolder {
        val layoutinflater = LayoutInflater.from(
            parent.context
        )

        val itemView = layoutinflater.inflate(
            R.layout.musicas,
            parent,
            false
        )

        return MusicaViewHolder(itemView)

    }

    override fun getItemCount(): Int {
        return lista.size
    }

    override fun onBindViewHolder(holder: MusicaViewHolder, position: Int) {
        val posicao = lista[position]
        holder.imgMusica.setImageResource(posicao.first)
        holder.nomeMusica.text = posicao.second
        holder.nomeArtista.text = posicao.third
        holder.tempoMusica.text = posicao.fourth
    }

}