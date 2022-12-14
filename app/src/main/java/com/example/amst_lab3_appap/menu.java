package com.example.amst_lab3_appap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class menu extends AppCompatActivity {
    String token = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Intent login = getIntent();
        this.token = (String)login.getExtras().get("token");
    }

    public void Salir(View v){
        this.finish();
        System.exit(0);
    }

    public void revisarSensores(View v){
        Intent red_sensores = new Intent(getBaseContext(),
                RedSensores.class);
        red_sensores.putExtra("token", token);
        startActivity(red_sensores);
    }

    public void enviarDatos(View v){
        Intent enviar_datos = new Intent(getBaseContext(),
                EnviarDatos.class);
        enviar_datos.putExtra("token", token);
        startActivity(enviar_datos);
    }
}