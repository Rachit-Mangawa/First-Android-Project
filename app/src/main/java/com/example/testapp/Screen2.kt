package com.example.testapp

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Screen2 : AppCompatActivity() {

    companion object{
        var dataURL = "com.example.TestApp.Screen2.KEY"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen2)

        val btnCall = findViewById<Button>(R.id.callButton)
        btnCall.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:9328692611"))
            startActivity(intent)
        }
        val androidAppDev = findViewById<Button>(R.id.androidAppDev)
        val iosAppDev = findViewById<Button>(R.id.iosAppDev)
        val webDev = findViewById<Button>(R.id.webDev)
        val ai = findViewById<Button>(R.id.ai)
        val ml = findViewById<Button>(R.id.ml)
        val blockchain = findViewById<Button>(R.id.blockchain)

        androidAppDev.setOnClickListener {
            val intent = Intent(this,Screen3::class.java)
            intent.putExtra(dataURL, "https://developer.android.com/")
            startActivity(intent)
        }
        iosAppDev.setOnClickListener {
            val intent = Intent(this,Screen3::class.java)
            intent.putExtra(dataURL ,"https://developer.apple.com/tutorials/app-dev-training/")
            startActivity(intent)
        }
        webDev.setOnClickListener {
            val intent = Intent(this,Screen3::class.java)
            intent.putExtra(dataURL,"https://www.w3schools.com/whatis/")
            startActivity(intent)
        }
        ai.setOnClickListener {
            val intent = Intent(this,Screen3::class.java)
            intent.putExtra(dataURL, "https://cloud.google.com/learn/what-is-artificial-intelligence")
            startActivity(intent)
        }
        ml.setOnClickListener {
            val intent = Intent(this,Screen3::class.java)
            intent.putExtra(dataURL , "https://www.ibm.com/topics/machine-learning")
            startActivity(intent)
        }
        blockchain.setOnClickListener {
            val intent = Intent(this,Screen3::class.java)
            intent.putExtra(dataURL ,"https://en.wikipedia.org/wiki/Blockchain")
            startActivity(intent)
        }

    }
}