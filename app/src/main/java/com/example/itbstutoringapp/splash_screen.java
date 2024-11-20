package com.example.itbstutoringapp;

import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class splash_screen extends AppCompatActivity {

    ProgressBar progressBar;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash_screen);

        progressBar= findViewById(R.id.progressBar);
        textView = findViewById(R.id.progressBarText);
        progressBar.setMax(100);
        progressBar.setScaleY(3f);
        progressAnimation();

    }

    public void progressAnimation(){
        ProgressBarAnimation anim = new ProgressBarAnimation(this,progressBar,textView,0f,100f);
        anim.setDuration(8000);
        progressBar.setAnimation(anim);
    }
}