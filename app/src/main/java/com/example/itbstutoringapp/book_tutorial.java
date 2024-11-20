package com.example.itbstutoringapp;

import android.Manifest;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class book_tutorial extends AppCompatActivity {

    final Calendar myCalendar = Calendar.getInstance();
    private EditText datePicker, timePicker;
    String module;
    int studentno;
    private EditText moduleName, PhoneNo, txtMessage;
    Button btnBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_tutorial);

        datePicker = (EditText) findViewById(R.id.datePicker);
        timePicker = (EditText) findViewById(R.id.timePicker);
        btnBook = (Button) findViewById(R.id.bookButton);
        moduleName = (EditText) findViewById(R.id.moduleName);
        PhoneNo = (EditText) findViewById(R.id.phone_number);
        txtMessage = (EditText) findViewById(R.id.editTextMessage);
        selectDate();
        timePicker.setOnClickListener(v -> selectTime());
        btnBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

             if (ContextCompat.checkSelfPermission(book_tutorial.this,Manifest.permission.SEND_SMS)
             ==PackageManager.PERMISSION_GRANTED){
                  sendSMS();
             }else {
                 ActivityCompat.requestPermissions(book_tutorial.this,new String[]{Manifest.permission.SEND_SMS},100);
             }


            }
        });





    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        if (requestCode == 100 & grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {

            sendSMS();

        }else {
            Toast.makeText(this, "Permission Denied!", Toast.LENGTH_SHORT).show();
        }
    }

    private void sendSMS(){
        String phone = PhoneNo.getText().toString();
        String message = txtMessage.getText().toString();

        if (!phone.isEmpty() && !message.isEmpty()){
            SmsManager smsManager = SmsManager.getDefault();

            smsManager.sendTextMessage(phone,null,message,null,null);
            Toast.makeText(this, "SMS sent successfully", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "Please enter phone and message ", Toast.LENGTH_SHORT).show();
        }
    }






    private void selectDate() {
        DatePickerDialog.OnDateSetListener date = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int day) {
                myCalendar.set(Calendar.YEAR, year);
                myCalendar.set(Calendar.MONTH, month);
                myCalendar.set(Calendar.DAY_OF_MONTH, day);

                datePicker.setText(updateDate());
            }
        };

        datePicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new DatePickerDialog(book_tutorial.this, date, myCalendar.get(Calendar.YEAR), myCalendar.get(Calendar.MONTH), myCalendar.get(Calendar.DAY_OF_MONTH)).show();


            }
        });

    }

    private String updateDate() {
        String myFormat = "yyyy-MM-dd";
        SimpleDateFormat dateFormat = new SimpleDateFormat(myFormat, Locale.US);

        return dateFormat.format(myCalendar.getTime());
    }

    private void selectTime() {
        Calendar currentTime = Calendar.getInstance();
        int hour = currentTime.get(Calendar.HOUR_OF_DAY);
        int minute = currentTime.get(Calendar.MINUTE);
        TimePickerDialog timePickerDialog;
        timePickerDialog = new TimePickerDialog(book_tutorial.this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hour, int minute) {
                currentTime.set(Calendar.HOUR_OF_DAY, hour);
                currentTime.set(Calendar.MINUTE, minute);

                String myFormat = "HH:mm:ss";
                SimpleDateFormat dateFormat = new SimpleDateFormat(myFormat, Locale.US);
                timePicker.setText(dateFormat.format(currentTime.getTime()));
            }
        }, hour, minute, true);
        timePickerDialog.setTitle("Select Time ");
        timePickerDialog.show();
    }
}
