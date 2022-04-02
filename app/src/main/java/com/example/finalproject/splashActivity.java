package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class splashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);

        (new Handler()).postDelayed(this::nextPage, 2000);
    }

    //Go to next page based on user sign in status
    void nextPage() {
        this.startActivity(new Intent(this, IntroActivity1.class));
    }
}