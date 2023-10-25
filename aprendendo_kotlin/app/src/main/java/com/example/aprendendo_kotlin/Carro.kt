package com.example.aprendendo_kotlin

open class Carro(){

    protected open fun injetarGasolina(){
        println("injetou gasolina")
    }

    fun acelerar(){
        injetarGasolina()
        println("carro acelerou")
    }
}

class Ferrari:Carro(){

    override fun injetarGasolina(){
        println("injetou muita gasolina")
    }
}

fun main(){
    val ferrari = Ferrari()

    ferrari.acelerar()
}