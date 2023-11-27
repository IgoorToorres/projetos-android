package com.example.funcoes_escopo.teste


class Musico(val instrumento: Instrumento){
    fun tocar(){
        println("musico tocando")
        instrumento.sendoTocado()
    }
}

abstract class Instrumento(){
    open fun sendoTocado(){}
}

class Violao: Instrumento(){
    override fun sendoTocado(){
        println("violao")
    }
}

class Bateria: Instrumento(){
    override fun sendoTocado() {
        println("bateria")
    }
}


fun main(){

    val musico1 = Musico(Violao())
    musico1.tocar()

    println("--------------")

    val musico2 = Musico(Bateria())
    musico2.tocar()

}