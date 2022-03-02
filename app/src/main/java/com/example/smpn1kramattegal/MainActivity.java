package com.example.smpn1kramattegal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {
    ViewFlipper viewFlipper;
    Animation fadein,fadeout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewFlipper =(ViewFlipper) findViewById(R.id.viewFlipper);
        fadein = AnimationUtils.loadAnimation(this,R.anim.fade_in);
        fadeout=AnimationUtils.loadAnimation(this,R.anim.fade_out);

        viewFlipper.setInAnimation(fadein);
        viewFlipper.setOutAnimation(fadein);

        viewFlipper.setAutoStart(true);
        viewFlipper.setFlipInterval(5000);
        viewFlipper.startFlipping();
    }


    public void profil(View view) {
        Intent intent = new Intent(MainActivity.this, profilActivity.class);
        startActivity(intent);
    }

    public void Guru(View view) {
        Intent intent = new Intent(MainActivity.this, GuruActivity.class);
        startActivity(intent);
    }

    public void Ekskul(View view) {
        Intent intent = new Intent(MainActivity.this, EkskulActivity.class);
        startActivity(intent);
    }

    public void Fasilitas(View view) {
        Intent intent = new Intent(MainActivity.this, fasilitasActivity.class);
        startActivity(intent);
    }

    public void Perpus(View view) {
        Intent intent = new Intent(MainActivity.this, PerpusActivity.class);
        startActivity(intent);
    }

    public void Galeri(View view) {
        Intent intent = new Intent(MainActivity.this, GaleriActivity.class);
        startActivity(intent);
    }
}