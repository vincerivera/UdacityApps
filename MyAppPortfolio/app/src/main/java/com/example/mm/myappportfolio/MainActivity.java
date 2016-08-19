package com.example.mm.myappportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button popularMovies, stockHawk, buildItBigger, makeYourAppMaterial, goUbiquitous, capstone = null;
    int duration = Toast.LENGTH_SHORT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        popularMovies = (Button) findViewById(R.id.popularMoviesButton);
        popularMovies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This button will launch my Popular Movies app!", duration).show();
            }
        });

        stockHawk = (Button) findViewById(R.id.stockHawkButton);
        stockHawk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This button will launch my Stock Hawk app!", duration).show();
            }
        });

        buildItBigger = (Button) findViewById(R.id.buildItBiggerButton);
        buildItBigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This button will launch my Build It Bigger app!", duration).show();
            }
        });

        makeYourAppMaterial = (Button) findViewById(R.id.makeYourAppMaterialButton);
        makeYourAppMaterial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This button will launch my Make Your App Material app!", duration).show();
            }
        });

        goUbiquitous = (Button) findViewById(R.id.goUbiquitousButton);
        goUbiquitous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This button will launch my Go Ubiquitous app!", duration).show();
            }
        });

        capstone = (Button) findViewById(R.id.capstoneButton);
        capstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This button will launch my Capstone app!", duration).show();
            }
        });
    }
}
