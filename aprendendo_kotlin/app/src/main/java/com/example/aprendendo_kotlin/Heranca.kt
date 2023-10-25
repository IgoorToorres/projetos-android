package com.example.aprendendo_kotlin

class Heranca {


}
open class Animal(){
    var cor: String = ""
    var tamanho: Double = 0.0
    var peso: Double = 0.0

    open fun correr():String{
        return "este animal"
    }

    fun dormir():String{
        return "animal dormiu!";
    }
}

class Cachorro:Animal() {
    override fun correr():String{
        return super.correr() + " cachorro correu de 4 patas"
    }
}

class Passaro:Animal(){
    override fun correr():String{

        return super.correr() + " passaro correu com duas patas"
    }

    fun voar():String{
        return "voar"
    }
}

fun main(){
    val cachorro = Cachorro()
    val passaro = Passaro()

    println(cachorro.correr())
    println(passaro.correr())
    cachorro.cor = "vermelho"
    println(cachorro.cor)
    passaro.cor = "azul"
    println(passaro.cor)
}