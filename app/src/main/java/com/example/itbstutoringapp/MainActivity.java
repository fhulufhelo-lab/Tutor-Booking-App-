package com.example.itbstutoringapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String MODULE = "MODULE NAME";
    public static final String STUDENT = "STUDENT NAME";

    private TextView moduleName,studentNo;
    private String module;
    private int studentno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //moduleName = findViewById(R.id.mModuleName);
        //studentNo = findViewById(R.id.mstudentno);


        Intent i = getIntent();
        module = i.getStringExtra(MODULE);
        studentno = i.getIntExtra(STUDENT,0);

        studentNo.setText("Student " + studentno);
        moduleName.setText("has booked tutorial for " + module);
    }
}