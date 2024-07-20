package com.example.testapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.webkit.WebView
import android.webkit.WebViewClient


class Screen3 : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen3)
        val webView = findViewById<WebView>(R.id.WebView)
        webViewSetup(webView)
    }
    @RequiresApi(Build.VERSION_CODES.O)
    @SuppressLint("SetJavaScriptEnabled")
    private fun webViewSetup(webView: WebView){
        webView.webViewClient = WebViewClient()

        webView.apply {
            settings.safeBrowsingEnabled = true
            settings.javaScriptEnabled = true
            loadUrl(intent.getStringExtra(Screen2.dataURL).toString())
        }
    }
}