package com.example.calculadoraimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {

    lateinit var resultadoPeso: TextView
    lateinit var resultadoAltura: TextView
    lateinit var resultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        resultadoPeso = findViewById(R.id.text_peso)
        resultadoAltura = findViewById(R.id.text_altura)
        resultado = findViewById(R.id.text_resultado)

        val bundle = intent.extras
        if(bundle != null){
            val peso = bundle.getDouble("peso")
            val altura = bundle.getDouble("altura")

            resultadoPeso.text = "Peso informado: $peso kg"
            resultadoAltura.text = "Altura informada: $altura M"

            val imc = peso / (altura * altura)
            resultado.text = if(imc < 18.5){
                "Baixo"
            }else if(imc in 18.5 .. 24.9){
                "Normal"
            }else if(imc in 25.0 .. 29.9){
                "Sobrepeso"
            }else{
                "obesidade"
            }
        }



    }
}