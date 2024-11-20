package com.example.itbstutoringapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class select_modules extends AppCompatActivity {

    private String selectedModuleName = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_modules);

        final LinearLayout programming = findViewById(R.id.programmingLayout);
        final LinearLayout MobileApplicationDevelopment = findViewById(R.id.mobileLayout);
        final LinearLayout informationSystems = findViewById(R.id.infoLayout);
        final LinearLayout SoftwareEngineering = findViewById(R.id.softwareEngineeringLayout);
        final LinearLayout Techno = findViewById(R.id.technoLayout);
        final LinearLayout ProfComm = findViewById(R.id.profLayout);
        final Button attemptBtn = findViewById(R.id.attemptQuizButton);

        programming.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedModuleName = "programming";

                programming.setBackgroundResource(R.drawable.round_back_white_stroke10);


                MobileApplicationDevelopment.setBackgroundResource(R.drawable.round_back_white10);
                informationSystems.setBackgroundResource(R.drawable.round_back_white10);
                SoftwareEngineering.setBackgroundResource(R.drawable.round_back_white10);
                Techno.setBackgroundResource(R.drawable.round_back_white10);
                ProfComm.setBackgroundResource(R.drawable.round_back_white10);

            }
        });

        MobileApplicationDevelopment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedModuleName = "Mobile Application Development";

                MobileApplicationDevelopment.setBackgroundResource(R.drawable.round_back_white_stroke10);

                programming.setBackgroundResource(R.drawable.round_back_white10);
                informationSystems.setBackgroundResource(R.drawable.round_back_white10);
                SoftwareEngineering.setBackgroundResource(R.drawable.round_back_white10);
                Techno.setBackgroundResource(R.drawable.round_back_white10);
                ProfComm.setBackgroundResource(R.drawable.round_back_white10);
            }
        });

        informationSystems.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedModuleName = "Information Systems";

                informationSystems.setBackgroundResource(R.drawable.round_back_white_stroke10);

                MobileApplicationDevelopment.setBackgroundResource(R.drawable.round_back_white10);
                programming.setBackgroundResource(R.drawable.round_back_white10);
                SoftwareEngineering.setBackgroundResource(R.drawable.round_back_white10);
                Techno.setBackgroundResource(R.drawable.round_back_white10);
                ProfComm.setBackgroundResource(R.drawable.round_back_white10);
            }
        });

        SoftwareEngineering.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedModuleName = "Software Engineering";

                SoftwareEngineering.setBackgroundResource(R.drawable.round_back_white_stroke10);

                MobileApplicationDevelopment.setBackgroundResource(R.drawable.round_back_white10);
                informationSystems.setBackgroundResource(R.drawable.round_back_white10);
                programming.setBackgroundResource(R.drawable.round_back_white10);
                Techno.setBackgroundResource(R.drawable.round_back_white10);
                ProfComm.setBackgroundResource(R.drawable.round_back_white10);
            }
        });

        Techno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedModuleName = "Technopreneurship";

                Techno.setBackgroundResource(R.drawable.round_back_white_stroke10);

                MobileApplicationDevelopment.setBackgroundResource(R.drawable.round_back_white10);
                informationSystems.setBackgroundResource(R.drawable.round_back_white10);
                SoftwareEngineering.setBackgroundResource(R.drawable.round_back_white10);
                programming.setBackgroundResource(R.drawable.round_back_white10);
                ProfComm.setBackgroundResource(R.drawable.round_back_white10);
            }
        });

        ProfComm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedModuleName = "Professional Communication";

                ProfComm.setBackgroundResource(R.drawable.round_back_white_stroke10);

                MobileApplicationDevelopment.setBackgroundResource(R.drawable.round_back_white10);
                informationSystems.setBackgroundResource(R.drawable.round_back_white10);
                SoftwareEngineering.setBackgroundResource(R.drawable.round_back_white10);
                Techno.setBackgroundResource(R.drawable.round_back_white10);
                programming.setBackgroundResource(R.drawable.round_back_white10);
            }
        });

        attemptBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (selectedModuleName.isEmpty()){
                    Toast.makeText(select_modules.this, "Please select a Module", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent intent = new Intent(select_modules.this, quiz_activity.class);
                    intent.putExtra("selectedModule",selectedModuleName);
                    startActivity(intent);
                }
            }
        });
    }
}