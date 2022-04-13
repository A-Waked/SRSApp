package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

import com.example.finalproject.ui.home.HomeFragment;

public class AddCardActivity extends AppCompatActivity {
    ImageButton btn_add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_card);

        btn_add = findViewById(R.id.btn_deck_add);
        Context context = this;

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HomeFragment.al_deckNames.add("Deck 1");
                context.startActivity(new Intent(context, DeckViewActivity.class));
            }
        });
    }
}