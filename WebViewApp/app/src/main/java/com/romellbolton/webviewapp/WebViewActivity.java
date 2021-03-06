package com.romellbolton.webviewapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class WebViewActivity extends AppCompatActivity {

    // Declare a WebView object
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        // Inflate the WebView widget
        webView = (WebView) findViewById(R.id.webView1);

        // Tells the WebView to execute JavaScript execution
        webView.getSettings().setJavaScriptEnabled(true);

        // Load the URL for the WebView to go to
        webView.loadUrl("https://www.google.com");
    }
}
