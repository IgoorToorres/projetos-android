package com.example.testetoast

class Pessoa{
    var nome: String = ""
        get(){
            return field.uppercase()
        }
        set(value){
            field = "set: $value"
        }

    var idade: Int = 0
    val maiorIdade
        get() = idade >= 18
}

fun main(){
    val pessoa = Pessoa()
    pessoa.nome = "igor"
    pessoa.idade = 18

    print(
        "Nome: ${pessoa.nome}\nidade: ${pessoa.idade}\nmaior de idade: ${pessoa.maiorIdade}"
    )
}
