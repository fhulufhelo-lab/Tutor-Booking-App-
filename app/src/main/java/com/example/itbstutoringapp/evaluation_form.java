package com.example.itbstutoringapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class evaluation_form extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_evaluation_form);

        final RatingBar simpleRatingBar = (RatingBar) findViewById(R.id.simpleRatingBar);

        Button sendButton = (Button) findViewById(R.id.send_button);

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String totalStars = "Total Stars ::" + simpleRatingBar.getNumStars();
                String rating = "Raiting::" + simpleRatingBar.getRating();

                Toast.makeText(getApplicationContext(),"Sent",Toast.LENGTH_LONG).show();
            }
        });



    }
}