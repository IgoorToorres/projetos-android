package com.example.testetoast



data class pergunta(val pergunta: String, val resposta: Int )



fun main(){

    val pergunta1 = pergunta("pergunta1", 2)
    val pergunta2 = pergunta("pergunta1", 1)
    println(pergunta1 == pergunta2)

    val (pergunta, resposta) = pergunta1

    //desestruturação
    println(pergunta1.pergunta)
    println(pergunta1.resposta)
}

