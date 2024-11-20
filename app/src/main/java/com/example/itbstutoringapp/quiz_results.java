package com.example.itbstutoringapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class quiz_results extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_results);

        final AppCompatButton startNewBtn = findViewById(R.id.startNewQuizBtn);
        final TextView correctAnswer = findViewById(R.id.correctAnswers);
        final TextView incorrectAnswer = findViewById(R.id.incorrectAnswers);

        final int getCorrectAnswers = getIntent().getIntExtra("correct",0);
        final int getIncorrectAnswers = getIntent().getIntExtra("incorrect",0);

        correctAnswer.setText(String.valueOf(getCorrectAnswers));
        incorrectAnswer.setText(String.valueOf(getIncorrectAnswers));

        startNewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(quiz_results.this,select_modules.class));
                finish();
            }
        });
    }

    public void onBackPressed(){
        super.onBackPressed();
        startActivity(new Intent(quiz_results.this,select_modules.class));
        finish();
    }
    }
