package com.example.myapplication

class Calculos {


    val listaNumeros = mutableListOf<Double>()


    fun adicionarNumero(n: Double){
        listaNumeros.add(n)
    }

    fun calcularMedia(): Double {
        val somaNumeros = listaNumeros.sum()
        val qtdNumeros = listaNumeros.size
        return somaNumeros / qtdNumeros

    }
}