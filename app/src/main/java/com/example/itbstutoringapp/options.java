package com.example.itbstutoringapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class options extends AppCompatActivity {

    ImageButton tutorial, study,test;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);

        tutorial = (ImageButton) findViewById(R.id.bookTutorial);
        study    = (ImageButton) findViewById(R.id.SelfStudy);
        test    = (ImageButton) findViewById(R.id.attemptTest);

        tutorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(options.this,book_tutorial.class);
                startActivity(intent);
            }
        });

        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(options.this,evaluation_form.class);
                startActivity(intent);
            }
        });

        study.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://quizlet.com/3224257/test?funnelUUID=a48b2123-4e0d-4c1a-b820-f9f4434b2ade"));
                startActivity(intent);
            }
        });

    }
}