package com.example.smpn1kramattegal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class buku8Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buku8);
    }

    public void mat8(View view) {
        goTourl("https://drive.google.com/file/d/1U3NTQWTF2NBVtuk_hakHouzUJV4Af7FA/view?usp=sharing");
    }

    public void ips8(View view) {
        goTourl("https://drive.google.com/file/d/1VdtC2d8igkOYX1IAC8dteOyvWJyZoxtL/view?usp=sharing");
    }

    public void pai8(View view) {
        goTourl("https://drive.google.com/file/d/1VtvtHEMD9N0t_rg40CaB_wnC1ZyBBPl3/view?usp=sharing");
    }

    public void ipa8(View view) {
        goTourl("https://drive.google.com/file/d/1TxMrzAmD_VAgo50tpFW3roYoZK6iUf_6/view?usp=sharing");
    }

    public void prakrya8(View view) {
        goTourl("https://drive.google.com/file/d/1VdwP4T_i729bJRqSwLW_zCsFtmey6KD4/view?usp=sharing");
    }

    public void penjas8(View view) {
        goTourl("https://drive.google.com/file/d/1UI6h7y3c1ISx1wg32siJARstFtEoYSLr/view?usp=sharing");
    }

    public void bindo8(View view) {
        goTourl("https://drive.google.com/file/d/1TslxrtBmz_m4VCa7IlewKWjbQj2GTcSz/view?usp=sharing");
    }

    public void bing8(View view) {
        goTourl("https://drive.google.com/file/d/1TtzAclXmXX-wEJXgk3_HVWtcuWVDXrqq/view?usp=sharing");
    }

    public void ppkn8(View view) {
        goTourl("https://drive.google.com/file/d/1WiuFjy6XwtWfPUKcWdNAn-WEGPW0dC7R/view?usp=sharing");
    }

    public void senibudaya8(View view) {
        goTourl("https://drive.google.com/file/d/1VsHDDRYLcBAWj0DyhPazXy-urnHiK6kW/view?usp=sharing");
    }
    private void goTourl(String url){
        Uri uriUrl = Uri.parse(url);
        Intent launcherBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launcherBrowser);
    }
}