package main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import com.aplication.covsin.R;
import com.aplication.covsin.app.ui.menu.MenuActivity;


public class MainActivity extends AppCompatActivity {

    int tiempoTranscurrir = 1000; //1 segundo, 1000 millisegundos.

    Handler handler = new Handler();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        handler.postDelayed(r, 1000);


    }

    final Runnable r = new Runnable() {
        public void run() {
            Intent menu = new Intent(getApplicationContext(), MenuActivity.class);
            startActivity(menu);
        }
    };

    //Método para botones
    public void Menu (View View){

        Intent menu = new Intent(this, MenuActivity.class);
        startActivity(menu);


    }
}