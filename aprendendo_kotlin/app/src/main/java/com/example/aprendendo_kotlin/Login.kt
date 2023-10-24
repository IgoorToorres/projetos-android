package com.example.aprendendo_kotlin

class Login {
    fun verificarLoguin(email: String, senha: String): String{
        return "usuario logado com email: $email e senha: $senha"
    }

    fun verificarLoguin(telefone: Int):String{
        return "usuario logado com telefone: $telefone"
    }
}

fun main(){

    val login = Login()
    //println(login.verificarLoguin("igor@gmail.com", "igor123"))
    println(login.verificarLoguin(1923871293))

}