package com.example.papeltesoura;

import java.util.Random;

public class Maquina {
    private int num = new Random().nextInt(3);
    private String[] resultadoMquina = {
            "pedra",
            "papel",
            "tesoura",
    };

    public String escolhaMaquina(){
        return resultadoMquina[num];
    }

}
