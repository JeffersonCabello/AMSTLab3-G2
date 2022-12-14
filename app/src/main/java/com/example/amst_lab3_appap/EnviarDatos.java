package com.example.amst_lab3_appap;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EnviarDatos extends AppCompatActivity {
    private EditText e1;
    private EditText e2;
    private EditText e3;
    private Button b1;
    private Button b2;
    private Button b3;
    private String token = "";

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enviar_datos);

        e1 = (EditText) findViewById(R.id.temp_ing);
        b1 = (Button) findViewById(R.id.btn_temp);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(e1.getText().toString().equals("")){
                    Toast.makeText(EnviarDatos.this, "Ingrese datos", Toast.LENGTH_SHORT);
                }
                else{

                }
            }
        });

        e2 = (EditText) findViewById(R.id.humedad_ing);
        b2 = (Button) findViewById(R.id.btn_hum);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(e2.getText().toString().equals("")){
                    Toast.makeText(EnviarDatos.this, "Ingrese datos", Toast.LENGTH_SHORT);
                }
                else{

                }
            }
        });

        e3 = (EditText) findViewById(R.id.peso_ing);
        b3 = (Button) findViewById(R.id.btn_peso);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(e3.getText().toString().equals("")){
                    Toast.makeText(EnviarDatos.this, "Ingrese datos", Toast.LENGTH_SHORT);
                }
                else{

                }
            }
        });


    }
}