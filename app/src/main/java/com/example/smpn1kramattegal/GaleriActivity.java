package com.example.smpn1kramattegal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GaleriActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeri);
    }

    public void albumpmr(View view) {
        Intent intent = new Intent(GaleriActivity.this, albumpmrActivity.class);
        startActivity(intent);
    }

    public void albumhutri(View view) {
        Intent intent = new Intent(GaleriActivity.this, albumhutriActivity.class);
        startActivity(intent);
    }

    public void albumpramuka(View view) {
        Intent intent = new Intent(GaleriActivity.this, albumpramukaActivity.class);
        startActivity(intent);
    }

}