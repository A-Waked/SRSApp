package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

public class IntroActivity2 extends AppCompatActivity {
    ImageButton btn_next, btn_skip;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro2);

        overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);

        btn_next = findViewById(R.id.btn_i2_next);
        btn_skip = findViewById(R.id.btn_i2_skip);

        Context context = this;

        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context.startActivity(new Intent(context, IntroActivity3.class));
            }
        });

        btn_skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context.startActivity(new Intent(context, IntroActivity3.class));
            }
        });
    }
}