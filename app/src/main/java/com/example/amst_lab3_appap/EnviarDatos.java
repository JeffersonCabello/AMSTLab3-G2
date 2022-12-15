package com.example.amst_lab3_appap;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class EnviarDatos extends AppCompatActivity {
    private EditText e1;
    private EditText e2;
    private EditText e3;
    private Button b1;
    private Button b2;
    private Button b3;
    private RequestQueue mQueue;
    private String token = "";


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enviar_datos);

        mQueue = Volley.newRequestQueue(this);
        Intent login = getIntent();
        this.token = (String)login.getExtras().get("token");

        e1 = (EditText) findViewById(R.id.temp_ing);
        b1 = (Button) findViewById(R.id.btn_temp);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(e1.getText().toString().equals("")){
                    Toast.makeText(EnviarDatos.this, "Ingrese datos", Toast.LENGTH_SHORT);
                }
                else{
                    envio_temp();
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
                    envio_hum();
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
                    envio_peso();
                }
            }
        });
    }

    public void envio_temp(){
        String url = " https://amst-lab-api.herokuapp.com/api/sensores/";
        JsonObjectRequest request = new JsonObjectRequest(
                Request.Method.POST, url, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {

                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        }){
            @Override
            public Map<String, String> getHeaders() throws AuthFailureError
            {
                Map<String, String> params = new HashMap<String, String>();
                params.put("temperatura", e1.getText().toString());
                return params;
            }
        };
        mQueue.add(request);
    }

    public void envio_hum(){
        String url = " https://amst-lab-api.herokuapp.com/api/sensores/";
        JsonObjectRequest request = new JsonObjectRequest(
                Request.Method.POST, url, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {

                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        }){
            @Override
            public Map<String, String> getHeaders() throws AuthFailureError
            {
                Map<String, String> params = new HashMap<String, String>();
                params.put("humedad", e2.getText().toString());
                return params;
            }
        };
        mQueue.add(request);
    }

    public void envio_peso(){
        String url = " https://amst-lab-api.herokuapp.com/api/sensores/";
        JsonObjectRequest request = new JsonObjectRequest(
                Request.Method.POST, url, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {

                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        }){
            @Override
            public Map<String, String> getHeaders() throws AuthFailureError
            {
                Map<String, String> params = new HashMap<String, String>();
                params.put("peso", e3.getText().toString());
                return params;
            }
        };
        mQueue.add(request);
    }
}