package com.example.fragmentaula

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.example.fragmentaula.fragments.ChamadasFragment
import com.example.fragmentaula.fragments.ConversasFragment

class MainActivity : AppCompatActivity() {

    lateinit var btnConversas: Button
    lateinit var btnChamadas: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnConversas = findViewById(R.id.btn_conversas)
        btnChamadas = findViewById(R.id.btn_chamadas)

        btnConversas.setOnClickListener {
/*            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_conteudo, ConversasFragment())
                .commit()*/
            supportFragmentManager.commit {
                replace<ConversasFragment>(
                    R.id.fragment_conteudo
                )
            }
        }

        btnChamadas.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_conteudo, ChamadasFragment())
                .commit()
        }

    }
}