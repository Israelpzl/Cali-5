package com.aplication.covsin.app.ui.faq;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

import com.aplication.covsin.R;
import com.aplication.covsin.app.ui.menu.MenuActivity;

public class Faq2Activity extends AppCompatActivity {

    private Switch[] preguntas;
    private TextView respuesta;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq2);

        preguntas=GetPreguntas();
        respuesta = (TextView) findViewById(R.id.faqRespuesta3);
    }


    public void setPreguntas(View View) {
        if (preguntas[0].isChecked()) {
            respuesta.setText(R.string.textoPreguntaMenu1);
        } else if (preguntas[1].isChecked()) {
            respuesta.setText(R.string.textoPreguntaMenu2);
        } else if (preguntas[2].isChecked()) {
            respuesta.setText(R.string.textoPreguntaMenu3);
        } else if (preguntas[3].isChecked()) {
            respuesta.setText(R.string.textoPreguntaMenu4);
        } else if (preguntas[4].isChecked()) {
            respuesta.setText(R.string.textoPreguntaMenu5);
        } else if (preguntas[5].isChecked()) {
            respuesta.setText(R.string.textoPreguntaMenu6);
        } else
            respuesta.setText("");
    }

    public void Menu(View View) {
        Intent menu = new Intent(this, MenuActivity.class);
        startActivity(menu);
    }

    public Switch[] GetPreguntas() {
        int numeroPreguntas = 6;
        Switch[] preguntas = new Switch[numeroPreguntas];
        for (int i = 0; i < numeroPreguntas; i++) {
            preguntas[i] = GetPreguntaCorrespondiente(i);
        }
        return preguntas;
    }

    private Switch GetPreguntaCorrespondiente(int numeroPregunta) {
        switch (numeroPregunta) {
            case 0:
                return (Switch) findViewById(R.id.faqPregunta1);
            case 1:
                return (Switch) findViewById(R.id.faqPregunta2);
            case 2:
                return (Switch) findViewById(R.id.faqPregunta3);
            case 3:
                return (Switch) findViewById(R.id.faqPregunta4);
            case 4:
                return (Switch) findViewById(R.id.faqPregunta5);
            case 5:
                return (Switch) findViewById(R.id.faqPregunta6);
            default:
                return null;
        }
    }

}