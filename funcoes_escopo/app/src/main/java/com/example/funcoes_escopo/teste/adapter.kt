package com.example.funcoes_escopo.teste


class TomadaAntiga(val conector : Conector){
    val qtdPinos = conector.getPinos()
    fun passarEnergia(){
        if(qtdPinos == 2){
            conector.ligarTomada()
            println("quantidade de pinos: $qtdPinos")
            println("passando energia!")
        }else{
            println("a tomada so tem 2 pinos, seu conector tem: $qtdPinos")
        }
    }
}

interface Conector{
    fun getPinos():Int
    fun ligarTomada()
}


class Adaptador(val tomadaNova : TomadaNova) : Conector{
    override fun getPinos(): Int {
        return 2
    }

    override fun ligarTomada() {
        tomadaNova.ligarTomada()
    }

}

class TomadaNova() : Conector{
    val qtdPinos = 3
    override fun getPinos(): Int{
        return qtdPinos
    }
    override fun ligarTomada(){
        println("aparelho ligado!")
    }
}


fun main(){
    val tomadaNova = TomadaNova()
    val adaptador = Adaptador(tomadaNova)
    val tomadaAntiga = TomadaAntiga(adaptador)

    tomadaAntiga.passarEnergia()
}