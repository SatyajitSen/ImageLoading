package com.satyajitsentutul.imageloading;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    ImageView imgView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgView=findViewById(R.id.imageView);
        Glide.with(MainActivity.this)
                .load("https://commons.wikimedia.org/wiki/File:HrithikRoshan01.jpg")
                 .placeholder(R.drawable.loading)
                .error(R.drawable.not_found)
                .into(imgView);
    }
}
