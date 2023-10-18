package com.example.papeltesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionarPedra(View view){
        verificarResultado("pedra");
    }

    public void selecionarPapel(View view){
        verificarResultado("papel");
    }

    public void selecionarTesoura(View view){
        verificarResultado("tesoura");
    }

    private String resultadoMaquina(){
        ImageView imagemApp = findViewById(R.id.imagem_App);

        int num = new Random().nextInt(3);
        String[] resultadoMquina = {
                "pedra",
                "papel",
                "tesoura",
        };

        String escolha = resultadoMquina[num];

        switch (escolha) {
            case "pedra":
                imagemApp.setImageResource(R.drawable.pedra);
                System.out.println("aaaaaaaa");
                break;
            case "papel":
                imagemApp.setImageResource(R.drawable.papel);
                break;
            case "tesoura":
                imagemApp.setImageResource(R.drawable.tesoura);
                break;
        }
        return escolha;
    }

    private void verificarResultado( String escolhaUsuario){
        TextView resultado = findViewById(R.id.resultado_final);
        String maquina = resultadoMaquina();
        if(
        (maquina == "pedra" && escolhaUsuario == "pedra") ||
        (maquina == "papel" && escolhaUsuario == "papel")||
        (maquina == "tesoura" && escolhaUsuario == "tesoura")
        ){
            resultado.setText("Empate");
        }else if(
        (maquina == "pedra" && escolhaUsuario == "papel") ||
        (maquina == "papel" && escolhaUsuario == "tesoura") ||
        (maquina == "tesoura" && escolhaUsuario == "pedra")
        ){
            resultado.setText("Você venceu!");
        }else if(
        (maquina == "pedra" && escolhaUsuario == "tesoura")||
        (maquina == "papel" && escolhaUsuario == "pedra")||
        (maquina == "tesoura" && escolhaUsuario == "papel")
        ){
            resultado.setText("Você Perdeu!");
        }
    }


}