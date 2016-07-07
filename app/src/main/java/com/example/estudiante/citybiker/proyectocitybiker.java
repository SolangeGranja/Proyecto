package com.example.estudiante.citybiker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class proyectocitybiker extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proyecto_city_biker);
    }
    public void cargar (View v) {
    Intent i = new Intent(this, pantalla2.class);
    startActivity(i);
}
     public void jugar (View v){
        Intent i = new Intent(this, pantalla3.class);
         startActivity(i);

    }

}
