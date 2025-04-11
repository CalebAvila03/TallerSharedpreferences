package com.example.tallersharedpreferences;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SplashScreen extends AppCompatActivity {

    public static final String dataUserCache = "dataUser";
    private static final int  mode_Private = Context.MODE_PRIVATE;
    String dato1, dato2, dato3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_splash_screen);

        dato1 = getApplicationContext().getSharedPreferences(dataUserCache,mode_Private).getString("nombre","0");
        dato2 = getApplicationContext().getSharedPreferences(dataUserCache,mode_Private).getString("edad","0");
        dato3 = getApplicationContext().getSharedPreferences(dataUserCache,mode_Private).getString("categoria","0");

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                if (dato1.equalsIgnoreCase("0") || dato2.equalsIgnoreCase("0") || dato3.equalsIgnoreCase("0")){
                    Intent i = new Intent(SplashScreen.this,MainActivity.class);
                    startActivity(i);

                }else {
                    Intent i = new Intent(SplashScreen.this, DeporteActivity.class, MusicaActivity.class, CineActivity.class);
                    startActivity(i);

                }

            }
        },2000);

    }



}