package com.example.tallersharedpreferences;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CineActivity extends AppCompatActivity {

    Button btn_regresar_cine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cine);

        btn_regresar_cine = findViewById(R.id.btn_regresar_cine);
        btn_regresar_cine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CineActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }


}

