package com.example.itbstutoringapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {

    public static final String MODULE = "MODULE NAME";
    public static final String STUDENT = "STUDENT NAME";

    private EditText moduleName,studentNo;
    private String module;
    private int studentno;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        moduleName = findViewById(R.id.mName);
        studentNo = findViewById(R.id.mAge);


        Intent i = getIntent();
        module = i.getStringExtra(MODULE);
        studentno = i.getIntExtra(STUDENT,0);

       studentNo.setText("Student " + studentno);
       moduleName.setText("has booked tutorial for " + module);


    }
}