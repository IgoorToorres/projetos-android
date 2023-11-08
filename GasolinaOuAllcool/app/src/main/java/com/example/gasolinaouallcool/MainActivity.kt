package com.example.gasolinaouallcool

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {

    private lateinit var caixaAlcool: TextInputLayout
    private lateinit var inputAlcool: TextInputEditText

    private lateinit var caixaGasolina: TextInputLayout
    private lateinit var inputGasolina: TextInputEditText

    private lateinit var btnCalcular: Button
    private lateinit var textResultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        inicializarInformacoes()
        btnCalcular.setOnClickListener {
            calcularMelhorPreco()
        }
    }


    fun inicializarInformacoes(){
        caixaAlcool = findViewById(R.id.caixa_input_alcool)
        inputAlcool = findViewById(R.id.input_alcool)

        caixaGasolina = findViewById(R.id.caixa_input_gasolina)
        inputGasolina = findViewById(R.id.input_gasolina)

        btnCalcular = findViewById(R.id.btn_calcular)
        textResultado = findViewById(R.id.text_resultado)
    }

    private fun calcularMelhorPreco() {
        var numero = 0;
        val precoAlcool = inputAlcool.text.toString()
        val precoGasolina = inputGasolina.text.toString()

        val resultadoVerificacao = verificar(precoAlcool, precoGasolina)
        if(resultadoVerificacao){
            val valorAlcoolConvertido = precoAlcool.toDouble()
            val valorGasolinaConvertido = precoGasolina.toDouble()

            if(valorAlcoolConvertido / valorGasolinaConvertido >= 0.7){
                textResultado.setText("É melhor utilizar gasolina")
                inputAlcool.setText("")
                inputGasolina.setText("")
                caixaAlcool.clearFocus()
                caixaGasolina.clearFocus()
            }else{
                textResultado.setText("É melhor utilizar Alcool")
                inputAlcool.setText("")
                inputGasolina.setText("")
                caixaAlcool.clearFocus()
                caixaGasolina.clearFocus()
            }
        }

    }

    fun verificar(pAlcool: String, pGasolina: String):Boolean{

        caixaAlcool.error = null
        caixaGasolina.error = null

        if(pAlcool.isEmpty()){
            caixaAlcool.error = "Campo obrigatório"
            caixaAlcool.requestFocus()
            return false
        }else if(pGasolina.isEmpty()){
            caixaGasolina.error = "Campo obrigatório"
            caixaGasolina.requestFocus()
            return false
        }

        return true
    }

}