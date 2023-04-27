package com.example.travel_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonExplore(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://a0810081.xsph.ru/"));
        startActivity(browserIntent);
    }

    public void buttonExplore2(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://a0810081.xsph.ru/"));
        startActivity(browserIntent);
    }

    public void buttonExplore3(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://a0810081.xsph.ru/"));
        startActivity(browserIntent);
    }
}