package com.example.telaloginsenha;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class LoginSenha extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_senha);

        Button botao = findViewById(R.id.botao_enviar);
        TextInputEditText email = findViewById(R.id.edit_email);
        TextInputEditText senha = findViewById(R.id.edit_senha);

        botao.setOnClickListener(v -> {
            String emailUsuario = email.getText().toString();
            String senhaUsuario = senha.getText().toString();
            System.out.println("usuario digitou: " + emailUsuario + " " + senhaUsuario);
        });

    }
}