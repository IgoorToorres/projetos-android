package com.example.papeltesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

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
        resultadoMaquina();
    }

    private void resultadoMaquina(View view){
        Maquina maquina = new Maquina();
        ImageView imagemApp = new 

    }

    private void verificarResultado( String escolhaUsuario){
        System.out.println("usuario selecionou: " + escolhaUsuario);
    }


}