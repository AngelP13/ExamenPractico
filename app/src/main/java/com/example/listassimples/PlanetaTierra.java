package com.example.listassimples;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class PlanetaTierra extends AppCompatActivity {

    private Spinner spinner;

    private TextView tv_respuesta;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planeta_tierra);

        tv_respuesta = (TextView)findViewById(R.id.txtrest2);
        spinner = (Spinner)findViewById(R.id.spinner_6);

        String [] respuestas = {"Clima", "Geografia", "Flora", "Fauna"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, respuestas);
        spinner.setAdapter(adapter);

    }

    public void mostrar(View view){
        String seleccionado = spinner.getSelectedItem().toString();
        if (seleccionado.equals("Clima")){
            tv_respuesta.setText("El planeta tien un clima leve");
        } else if (seleccionado.equals("Geografia")){
            tv_respuesta.setText("Se encuentra cenca del sol");
        }else if (seleccionado.equals("Flora")){
            tv_respuesta.setText("Posee una gran flora");
        } else if (seleccionado.equals("Fauna")){
            tv_respuesta.setText("Posee una gran fauna");
        }
    }

}