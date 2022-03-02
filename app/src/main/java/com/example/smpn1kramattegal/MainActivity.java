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

    public void guru(View view) {
    }

    public void eskul(View view) {
    }

    public void profil(View view) {
    }

    public void fasilitas(View view) {
    }

    public void perpus(View view) {
    }

    public void galeri(View view) {
    }
}