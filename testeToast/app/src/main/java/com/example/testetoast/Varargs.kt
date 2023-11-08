package com.example.testetoast

class Telefone{
    fun salvarTelefones(vararg telefones: String){
        for (telefone in telefones){
            println("telefones: $telefone")
        }
    }
}

fun main(){
    val telefone = Telefone()
    telefone.salvarTelefones(
        "(61) 999334508",
        "(61) 999334508",
        "(61) 999334508",
        "(61) 999334508",
        "(61) 999334508",
        "(61) 999334508",
        "(61) 999334508"
    )


}