package com.example.listassimples;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class Planetamercurio extends AppCompatActivity {


    private Spinner spinner;
    private TextView tv_respuesta;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planetamercurio);

        tv_respuesta = (TextView)findViewById(R.id.txtRespuesta);
        spinner = (Spinner)findViewById(R.id.spinner_1);

        String [] respuestas = {"Clima", "Geografia", "Flora", "Fauna"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, respuestas);
        spinner.setAdapter(adapter);
    }

    public void mostrar(View view){
        String seleccionado = spinner.getSelectedItem().toString();
        if (seleccionado.equals("Clima")){
            tv_respuesta.setText("El planeta es muy frio");
        } else if (seleccionado.equals("Geografia")){
            tv_respuesta.setText("Se encuentra a 2 años luz de la tierra");
        }else if (seleccionado.equals("Flora")){
            tv_respuesta.setText("No posee flora");
        } else if (seleccionado.equals("Fauna")){
            tv_respuesta.setText("Los aliens son los unicos");
        }
    }


}