package com.example.tallersharedpreferences;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DeporteActivity extends AppCompatActivity {

    Button btn_regresar_deporte;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_deporte);

        btn_regresar_deporte = findViewById(R.id.btn_regresar_deporte);
        btn_regresar_deporte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DeporteActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
