package com.example.transtu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;

public class MenuAbonneeActivity extends AppCompatActivity {
    CardView   cardViewCompte, cardViewDeconnexion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_abonnee);

        getSupportActionBar().hide();

        cardViewCompte = findViewById(R.id.card_view_compte);
        cardViewDeconnexion = findViewById(R.id.card_view_deconnexion);

        cardViewCompte.setOnClickListener(v -> {
            startActivity(new Intent(MenuAbonneeActivity.this, CompteActivity.class));
        });

        cardViewDeconnexion.setOnClickListener(v -> {
            startActivity(new Intent(MenuAbonneeActivity.this, AuthentificationActivity.class));
            finish();
        });
    }
}


