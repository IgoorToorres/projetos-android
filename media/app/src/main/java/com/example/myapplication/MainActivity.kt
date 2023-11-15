package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    val calculos = Calculos()
    lateinit var caixaNumero: TextInputLayout
    lateinit var inputNumero: TextInputEditText

    lateinit var btnAddNumero: Button
    lateinit var btnCalcular: Button
    lateinit var resultado: TextView
    lateinit var qtdNumerosAdicionados: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        inicializarElementos()
        btnAddNumero.setOnClickListener {
            var numero = inputNumero.text.toString()
            calculos.adicionarNumero(numero.toDouble())
            inputNumero.setText("")
            qtdNumerosAdicionados.setText("${calculos.listaNumeros.size}")
        }
        btnCalcular.setOnClickListener {
            val media = calculos.calcularMedia()
            resultado.setText("$media")
            calculos.listaNumeros.clear()
        }
    }

    fun inicializarElementos(){
        caixaNumero = findViewById(R.id.caixa_numeros)
        inputNumero = findViewById(R.id.input_numeros)
        btnAddNumero = findViewById(R.id.btn_adicionar)
        btnCalcular = findViewById(R.id.btn_calcular)
        resultado = findViewById(R.id.txt_resultado)
        qtdNumerosAdicionados = findViewById(R.id.qtd_numeros)
    }
}