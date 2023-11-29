package com.example.funcoes_escopo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class MensagemAdapter (
    private val lista: Array<Pair<String, String>>
) : Adapter<MensagemAdapter.MensagemViewHolder>() {

    inner class MensagemViewHolder(
         itemView: View
    ) : ViewHolder(itemView){

        val txtNomeUsuario: TextView = itemView.findViewById(R.id.txt_nome_usuario)
        val txtUltimaMensagem : TextView = itemView.findViewById(R.id.txt_ultima_mensagem)
        val txtHorario : TextView = itemView.findViewById(R.id.txt_horario)



    }

    //ao criar o View Holder -> cria a visualizacao
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MensagemViewHolder {

        val layoutInflater = LayoutInflater.from(
            parent.context
        )

        val itemView = layoutInflater.inflate(
            R.layout.item_lista, parent, false
        )

        return MensagemViewHolder(itemView)

    }

    //pega a quantidade de itens
    override fun getItemCount(): Int {
        return lista.size
    }

    //ao vincular o View Holder
    override fun onBindViewHolder(holder: MensagemViewHolder, position: Int) {
        val posicao = lista[position]
        holder.txtNomeUsuario.text = posicao.first
        holder.txtHorario.text = posicao.second


    }

}