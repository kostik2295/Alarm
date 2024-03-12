package com.simplemobiletools.clock.activities

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebSettings
import android.webkit.WebView
import com.simplemobiletools.clock.R
import com.simplemobiletools.clock.databinding.ActivityWebBinding


class WebActivity : AppCompatActivity() {
    private lateinit var webView: WebView
    private lateinit var binding: ActivityWebBinding
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWebBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setUpWeb()
    }


    @SuppressLint("SetJavaScriptEnabled")
    private fun setUpWeb() {
        val webSettings: WebSettings = binding.webView.settings
        webSettings.javaScriptEnabled = true

        binding.webView.loadUrl("https://dayspedia.com/world-clock/?lang=ru")
    }
}
