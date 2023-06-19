package com.example.listassimples;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class PlanetaMarte extends AppCompatActivity {

    private Spinner spinner;

    private TextView tv_respuesta;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planeta_marte);

        tv_respuesta = (TextView)findViewById(R.id.txtrest3);
        spinner = (Spinner)findViewById(R.id.spinner_7);

        String [] respuestas = {"Clima", "Geografia", "Flora", "Fauna"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, respuestas);
        spinner.setAdapter(adapter);

    }
}