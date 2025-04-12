package com.example.tallersharedpreferences;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText edt_nombre, edt_edad;
    Spinner spinner_categoria;
    Button btn_guardar;

    public static final String dataUserCache = "dataUser";
    private static final int  mode_Private = Context.MODE_PRIVATE;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        edt_nombre = findViewById(R.id.edt_nombre);
        edt_edad = findViewById(R.id.edt_edad);
        spinner_categoria = findViewById(R.id.spinner_categoria);
        btn_guardar = findViewById(R.id.btn_guardar);

        sharedPreferences = getSharedPreferences(dataUserCache,mode_Private);
        editor = sharedPreferences.edit();

        String[] categorias = {"Deportes", "Música", "Cine"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, categorias);
        spinner_categoria.setAdapter(adapter);

        btn_guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                guardar();
            }
        });
    }

    private void guardar() {
        String nombre = edt_nombre.getText().toString();
        String edad = edt_edad.getText().toString();
        String categoria = spinner_categoria.getSelectedItem().toString();


        if (!nombre.isEmpty() || !edad.isEmpty()){
            editor.putString("nombre",nombre);
            editor.putString("edad",edad);
            editor.putString("categoria",categoria);
            editor.commit();
            Intent i = new Intent(MainActivity.this, SplashScreen.class);
            startActivity(i);

        }else{
            Toast.makeText(MainActivity.this,"Debe completar todos los campos",Toast.LENGTH_LONG).show();

        }

        switch (categoria) {
            case "Deportes":
                startActivity(new Intent(this, DeporteActivity.class));
                break;
            case "Música":
                startActivity(new Intent(this, MusicaActivity.class));
                break;
            case "Cine":
                startActivity(new Intent(this, CineActivity.class));
                break;
        }

    }
}
