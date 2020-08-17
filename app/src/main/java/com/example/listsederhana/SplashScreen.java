package com.example.listsederhana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends AppCompatActivity {
    private int time_load=4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_splashscreen );

        new Handler().postDelayed( new Runnable() {
            @Override
            public void run() {
                Intent splash=new Intent(SplashScreen.this, MainActivity.class);
                startActivity(splash);
                finish();
            }
        }, time_load );
    }

}