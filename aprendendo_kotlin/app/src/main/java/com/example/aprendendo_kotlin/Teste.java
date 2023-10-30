package com.example.aprendendo_kotlin;

import androidx.annotation.NonNull;

class Pessoa{

    static int qtdPessoasLogadas = 2;
    static boolean verificarUsuario(){
        return true;
    }
}

class Tela{
    public static void main(String[] args){
        System.out.println(Pessoa.qtdPessoasLogadas);
        System.out.println(Pessoa.verificarUsuario());
    }
}

public class Teste {
}
