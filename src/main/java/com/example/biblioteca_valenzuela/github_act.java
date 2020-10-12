package com.example.biblioteca_valenzuela;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import biblioteca.biblioteca_precios_act;

public class github_act extends AppCompatActivity {
    private Spinner spin1;

    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_github_act);
        spin1 = (Spinner)findViewById(R.id.spn1);
        text = (TextView)findViewById(R.id.tv);

        // Recibir el dato.
        // <----
        ArrayList<String> listalibros = (ArrayList<String>) getIntent().getSerializableExtra("listalibros");



        ArrayAdapter<String> adapt = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,listalibros);


        spin1.setAdapter(adapt);

    }
    public void Calcular(View v)
    {
        String libros = spin1.getSelectedItem().toString();// almaceno selección del spinner.



        biblioteca_precios_act libro= new biblioteca_precios_act();  // Construir mi objeto.
        int resultFarenheith = libro.getFarenheith();
        int resultRevival =  libro.getRevival();
        int resultElAlquimista = libro.getElAlquimista();
        int resultElpoder = libro.getElpoder();
        int resultDespertar = libro.getDespertar();


        // Inteligencia farenheith

        if(libros.equals("farenheith"))
        {
            text.setText("El precio del libro es "+ resultFarenheith);
        }


        // Inteligencia revival

        if(libros.equals("revival"))
        {
            text.setText("El precio del plan es: "+resultRevival );
        }



        if(libros.equals("elAlquimista") )
        {
            text.setText("El precio del plan es: "+resultElAlquimista );
        }

        if(libros.equals("elpoder") )
        {
            text.setText("El precio del plan es: "+resultElpoder );
        }

        if(libros.equals("despertar") )
        {
            text.setText("El precio del plan es: "+resultDespertar );
        }



    }
}