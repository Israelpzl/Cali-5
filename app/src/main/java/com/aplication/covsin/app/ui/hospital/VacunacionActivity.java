package com.aplication.covsin.app.ui.hospital;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.aplication.covsin.R;

public class VacunacionActivity extends AppCompatActivity {

    private WebView Miweb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vacunacion);

        Miweb = findViewById(R.id.wv_main);
        Miweb.getSettings().setJavaScriptEnabled(true);
        Miweb.setWebViewClient(new WebViewClient());
        Miweb.loadUrl("https://www.mscbs.gob.es/profesionales/saludPublica/ccayes/alertasActual/nCov/vacunaCovid19.htm");
    }





}