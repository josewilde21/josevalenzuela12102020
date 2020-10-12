package com.example.biblioteca_valenzuela;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ProgressBar progress;
    private Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progress = (ProgressBar)findViewById(R.id.pb);
        btn = (Button)findViewById(R.id.btn);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                new Task().execute(); // ejecuta mi tarea asíncrona.
            }
        });


        progress.setVisibility(View.INVISIBLE); // desaparece el elemento.
    }


    // Tarea Asíncrona.

    class Task extends AsyncTask<String, Void, String> {

        @Override  // Vamos a darle la configuración inicial a la tarea
        protected void onPreExecute() {

            progress.setVisibility(View.VISIBLE);
        }


        @Override // vamos a emplear el proceso o tarea pesada en segundo plano.
        protected String doInBackground(String... strings) {

            for(int i = 1; i < 10; i++)
            {
                try {
                    Thread.sleep(1000);

                }catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
            return null;
        }


        @Override // finalizamos la tarea
        protected void onPostExecute(String s) {

            progress.setVisibility(View.INVISIBLE);

            Intent i = new Intent(getBaseContext(), menu_act.class);
            startActivity(i);

        }
    }
    public void Clientes(View v)
    {
        // Envío el dato
        ArrayList<String> libros = new ArrayList<String>();



        libros.add("farenheith");
        libros.add("revival");
        libros.add("elAlquimista");
        libros.add("elpoder");
        libros.add("despertar");




        Intent i = new Intent(this, github_act.class);
        i.putExtra("listalibros", libros); // preparo el dato que quiero envíar.
        startActivity(i);







    }


}