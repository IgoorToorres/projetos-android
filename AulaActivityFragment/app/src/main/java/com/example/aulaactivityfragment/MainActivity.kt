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
            startActivity(intent)

        }


    }


}