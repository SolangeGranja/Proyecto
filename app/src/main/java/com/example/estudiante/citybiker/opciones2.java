package com.example.estudiante.citybiker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class opciones2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opciones2);
    }
    public void menu (View v){
        Intent i = new Intent(this, proyectocitybiker.class);
        startActivity(i);

    }

    public void opc1 (View v){
        Intent i = new Intent(this, pantalla2.class);
        startActivity(i);

    }
    public void opc2 (View v){
        Intent i = new Intent(this, opciones2.class);
        startActivity(i);

    }
    public void opc3 (View v){
        Intent i = new Intent(this, opciones3.class);
        startActivity(i);

    }
}
