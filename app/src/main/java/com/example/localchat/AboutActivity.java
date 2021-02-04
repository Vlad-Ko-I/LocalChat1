package com.example.localchat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        getSupportActionBar().hide();
    }

    public void goBack(View view) {
        Intent intent = new Intent(AboutActivity.this, SettingsActivity.class);
        startActivity(intent);
    }

    public void goGeo(View view) {
        Uri location = Uri.parse("geo:31.9157992,34.7593422,15");
        Intent mapIntent2 = new Intent(Intent.ACTION_VIEW, location);
        startActivity(mapIntent2);
    }

    public void goLink(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tlalimgroup.com/"));
        startActivity(browserIntent);
    }
}