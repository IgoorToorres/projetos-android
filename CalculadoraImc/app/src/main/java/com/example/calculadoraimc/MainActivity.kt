package com.example.calculadoraimc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var btnCalcular: Button
    lateinit var inputPeso: EditText
    lateinit var inputAltura: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inputPeso = findViewById(R.id.input_text1)
        inputAltura = findViewById(R.id.input_text2)

        btnCalcular = findViewById(R.id.btn_calcular)
        btnCalcular.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            val peso = inputPeso.text.toString()
            val altura = inputAltura.text.toString()

            if(peso.isNotEmpty() && altura.isNotEmpty()) {
                intent.putExtra("peso", peso.toDouble())
                intent.putExtra("altura", altura.toDouble())
            }

            startActivity(intent)
        }

    }
}