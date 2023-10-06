package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity8 extends AppCompatActivity {
    WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        web=findViewById(R.id.web);

        web.getSettings().setJavaScriptEnabled(true);

        web.loadUrl("https://www.dpi.edu.bd/");


    }
}