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

    public void gerarFrase(View view){
        Frases f = new Frases();
        TextView texto = findViewById(R.id.textResultado);
        texto.setText(f.geradorFrases());
    }

    public void limpar(View view){
        TextView texto = findViewById(R.id.textResultado);
        texto.setText("");
    }
}