package com.example.funcoes_escopo.teste

class Musico(val instrumento: Instrumento){
    fun tocar(){
        println("musico tocou")
        instrumento.sendoTocado()
    }
}

 interface Instrumento{
    open fun sendoTocado(){}
}

class Violao(): Instrumento{
    override fun sendoTocado(){
        println("violão")
    }
}

class Bateria(): Instrumento{
    override fun sendoTocado() {
        println("bateria")
    }

}

class Guitarra(): Instrumento{
    override fun sendoTocado() {
        println("guitarra")
    }
}




fun main(){

    val musico1 = Musico(Violao())
    musico1.tocar()

    println("-----------")

    val musico2 = Musico(Bateria())
    musico2.tocar()

    println("-----------")

    val musico3 = Musico(Guitarra())
    musico3.tocar()

}