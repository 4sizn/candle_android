package com.example.candle_android

import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import com.example.candle_android.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val webView: WebView = findViewById(R.id.webview)
        webView.webViewClient = WebViewClient() // WebView에서 바로 페이지 열기
        webView.settings.javaScriptEnabled = true // JavaScript 사용 가능
        webView.loadUrl("https://www.naver.com") // 원하는 URL
    }
}
