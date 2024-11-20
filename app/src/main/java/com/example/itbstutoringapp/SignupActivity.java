package com.example.itbstutoringapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class SignupActivity extends AppCompatActivity {

    EditText signupUsername, signupName, signupSurname, signupStudentNumber, signupEmail, signupPassword, signupConfirmPassword;
    TextView loginRedirectText, nameError, surnameError, usernameError, studentNoError, passwordError, confirmpasswordError;
    Button signupButton;


    FirebaseDatabase database;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        signupUsername = findViewById(R.id.signup_username);
        signupName = findViewById(R.id.signup_name);
        signupSurname = findViewById(R.id.signup_surname);
        signupStudentNumber = findViewById(R.id.signup_studentnumber);
        signupEmail = findViewById(R.id.signup_email);
        signupPassword = findViewById(R.id.signup_password);
        signupConfirmPassword = findViewById(R.id.signup_confirm_password);

        signupButton = findViewById(R.id.signup_button);
        loginRedirectText = findViewById(R.id.loginRedirectText);

        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                database = FirebaseDatabase.getInstance();
                reference = database.getReference("users");

                String username = signupUsername.getText().toString();
                String name = signupName.getText().toString();
                String surname = signupSurname.getText().toString();
                String studentnumber = signupStudentNumber.getText().toString();
                String email = signupEmail.getText().toString();
                String password = signupPassword.getText().toString();


                HelperClass helperClass = new HelperClass(name, surname, email, username, studentnumber, password);
                reference.child(username).setValue(helperClass);

                if (signupName.length() > 0 && signupSurname.length() > 0 && signupPassword.length() > 0 && signupUsername.length() > 0 && signupStudentNumber.length() > 0 && signupConfirmPassword.length() > 0) {

                    Toast.makeText(SignupActivity.this, "Signup successfully", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(SignupActivity.this, LoginActivity.class);
                    startActivity(intent);
                }
                else {
                    if (signupName.length()==0){
                        nameError.setVisibility(View.VISIBLE);
                    }
                    if (signupSurname.length()==0){
                        surnameError.setVisibility(View.VISIBLE);
                    }
                    if (signupPassword.length()==0){
                        passwordError.setVisibility(View.VISIBLE);
                    }
                    if (!signupPassword.equals(signupConfirmPassword)){
                        confirmpasswordError.setVisibility(View.VISIBLE);
                    }
                    if (signupUsername.length()==0){
                        usernameError.setVisibility(View.VISIBLE);
                    }
                    if (signupStudentNumber.length()==0){
                        studentNoError.setVisibility(View.VISIBLE);
                    }
                }

            }
        });


        loginRedirectText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignupActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }

    private void checkEmpty(String name, String surname, String username, String password, String studentNumber, String confirmPassword){
        if ( name.length()>0 && nameError.getVisibility()== View.VISIBLE){
            nameError.setVisibility(View.GONE);
        }
        if (surname.length()> 0 && surnameError.getVisibility()== View.VISIBLE){
            surnameError.setVisibility(View.GONE);
        }
        if (username.length()>0 && usernameError.getVisibility()== View.VISIBLE){
            usernameError.setVisibility(View.GONE);
        }
        if (studentNumber.length() > 0 && studentNoError.getVisibility()== View.VISIBLE){
            studentNoError.setVisibility(View.GONE);
        }
        if (confirmPassword.length()>0 && password.length()>0 && password.equals(confirmPassword) && confirmpasswordError.getVisibility()==View.VISIBLE){
            confirmpasswordError.setVisibility(View.GONE);
        }
    }
}




