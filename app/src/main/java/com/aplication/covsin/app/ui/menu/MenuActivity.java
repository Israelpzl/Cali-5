package com.aplication.covsin.app.ui.menu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.aplication.covsin.R;
import com.aplication.covsin.app.ui.faq.Faq2Activity;
import com.aplication.covsin.app.ui.hospital.HospitalMapsActivity;
import com.aplication.covsin.app.ui.hospital.MapActivity;
import com.aplication.covsin.app.ui.login.LoginActivity;
import com.aplication.covsin.app.ui.login.RegisterActivity;
import com.aplication.covsin.app.ui.symptons.SymptomsActivity;
import com.aplication.covsin.app.ui.tutorial.TutorialActivity;
import com.blogspot.atifsoftwares.animatoolib.Animatoo;


public class MenuActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    //Método para botones
    public void Login (View View){
        Intent login = new Intent(this, LoginActivity.class);
        startActivity(login);
        Animatoo.animateSlideRight(this);
    }

    public void Register (View View){
        Intent register = new Intent(this, RegisterActivity.class);
        startActivity(register);
        Animatoo.animateSlideRight(this);
    }

    public void Symtoms (View View){
        Intent symtons = new Intent(this, SymptomsActivity.class);
        startActivity(symtons);
        Animatoo.animateSlideRight(this);
    }

    public void Map (View View){
        Intent map = new Intent(this, MapActivity.class);
        startActivity(map);
        Animatoo.animateSlideRight(this);
    }

    public void Frequent (View View){
        Intent freque = new Intent(this, Faq2Activity.class);
        startActivity(freque);
        Animatoo.animateSlideRight(this);
    }

    public void Tutorial (View View){
        Intent freque = new Intent(this, TutorialActivity.class);
        startActivity(freque);
    }

    public void HospitalMap (View View){
        Intent hospi = new Intent(this, HospitalMapsActivity.class);
        startActivity(hospi);
    }


}