package com.example.testapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnWelcome = findViewById<Button>(R.id.welcome)

        btnWelcome.setOnClickListener {
            val intent = Intent(applicationContext,Screen2::class.java)
            startActivity(intent)
        }
    }
}