package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ActivityWeb extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        webView = (WebView) findViewById(R.id.webView);

        String sitio = getIntent().getStringExtra("sitio");
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("http://" + sitio);
        webView.getSettings().setJavaScriptEnabled(true);
    }

    public void Regresar(View view){
        finish();
    }
}
