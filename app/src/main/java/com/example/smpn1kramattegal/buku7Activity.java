package com.example.smpn1kramattegal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class buku7Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buku7);
    }

    public void mat7(View view) {
        goTourl("https://drive.google.com/file/d/1QXpoCmuE9qx2lxvllD5u2nntsGpC6zUQ/view?usp=sharing");
    }
    public void ppkn7(View view) {
        goTourl("https://drive.google.com/file/d/1IHQihHJPuT2Wjv6whNvwtgcXDXX_pjMO/view?usp=sharing");
    }

    public void ips(View view) {
        goTourl("https://drive.google.com/file/d/1QTT70ghMSve9x1N8VKC14BUzWfJJhcrR/view?usp=sharing");
    }

    public void pai(View view) {
        goTourl("https://drive.google.com/file/d/1QbEAk6y-Veee89ga4J9AQyC1xJ-4fmfo/view?usp=sharing");
    }

    public void prakarya(View view) {
        goTourl("https://drive.google.com/file/d/1QDSKJmU-TBtyPsthsk4xDOcyePCDqlMi/view?usp=sharing");
    }

    public void ipa(View view) {
        goTourl("https://drive.google.com/file/d/1IVlMAu5WvVR5WCMfXqzqXmyJfEN1KViQ/view?usp=sharing");
    }

    public void penjas(View view) {
        goTourl("https://drive.google.com/file/d/1QkM2zZghoT0BJUKLZF2Bc42hwqwiy3G0/view?usp=sharing");
    }

    public void bindo(View view) {
        goTourl("https://drive.google.com/file/d/1QJi9YctnB1aac2WLgm7j-7jEA-vzfwDQ/view?usp=sharing");
    }

    public void bing(View view) {
        goTourl("https://drive.google.com/file/d/1QMN-DaOtw7rA5IzRLBCLsljKgvxc3hMs/view?usp=sharing");
    }

    public void senibudaya(View view) {
        goTourl("https://drive.google.com/file/d/1QkM2zZghoT0BJUKLZF2Bc42hwqwiy3G0/view?usp=sharing");
    }
    private void goTourl(String url){
        Uri uriUrl = Uri.parse(url);
        Intent launcherBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launcherBrowser);
    }
}