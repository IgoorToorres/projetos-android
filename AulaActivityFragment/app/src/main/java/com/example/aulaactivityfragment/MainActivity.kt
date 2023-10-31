package com.example.aulaactivityfragment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var btnAbrir: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAbrir = findViewById(R.id.btn_principal)
        btnAbrir.setOnClickListener {
            val intent = Intent(
                this,
                MainActivity2::class.java
            )
            //passando parametros para a outra tela:
/*            intent.putExtra("serie", "greys anatomy")
            intent.putExtra("IMDB", 7.8)
            intent.putExtra("idade", 12)*/
            val filme = Filme(
                "sem limites",
                "igor",
                8.9
            )

            intent.putExtra("filme", filme)

            startActivity(intent)

        }


    }


}