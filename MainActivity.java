package com.example.trvllapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu, menu);
        return true;
    }

//    public boolean onOptionItemSelected(MenuItem item){
//        int id = item.getItemId();
//        switch (id){
//            case R.id.settings:
//                Toast.makeText(this, "Настройки", Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.help:
//                Toast.makeText(this, "Справка", Toast.LENGTH_SHORT).show();
//                break;
//        }
//        return true;
//    }

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
