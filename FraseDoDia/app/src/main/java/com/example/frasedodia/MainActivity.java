package com.example.frasedodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    String[] frases = {
            "Não lamente o que podia ter e se perdeu por caminhos errados e nunca mais voltou.",
            "Há três coisas na vida que nunca voltam atrás: a flecha lançada, a palavra pronunciada e a oportunidade perdida.",
            "Quando a vida te decepciona, qual é a solução? Simplesmente continue a nadar.",
            "Maior que a tristeza de não haver vencido é a vergonha de não ter lutado!",
    };



    public void gerarFrase(View view){
        TextView texto = findViewById(R.id.textResultado);
        int num = new Random().nextInt(4);
        texto.setText(frases[num]);
    }

    public void gerarTodas(View view){
        TextView texto = findViewById(R.id.textResultado);
        String area = "";
        for(String frase: frases){
            area += frase + "\n\n";
        }
        texto.setText(area);
    }

    public void limpar(View view){
        TextView texto = findViewById(R.id.textResultado);
        texto.setText("");
    }
}