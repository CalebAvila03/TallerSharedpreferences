package com.example.tallersharedpreferences;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DeporteActivity extends AppCompatActivity {

    public static final String dataUserCache = "dataUser";
    private static final int  mode_Private = Context.MODE_PRIVATE;
    String dato1;
    TextView txt_usuario_deporte;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_deporte);

        txt_usuario_deporte = findViewById(R.id.txt_usuario_deporte);

    }
}