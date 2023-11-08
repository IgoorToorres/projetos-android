package com.example.testetoast

data class Cliente(
    val nome: String,
    val idade: Int
)

fun main(){
    //val cliente1 = Cliente("igor", 20)
    //val cliente2 = Cliente("julia", 19)

    val listaClientes = mutableListOf(
        Cliente("julia", 19),
        Cliente("igor", 20)
    )

    listaClientes.forEach { cliente ->
        print("Nome: ${cliente.nome}\nIdade: ${cliente.idade}\n")
    }

}