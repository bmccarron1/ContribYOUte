package com.example.HomePage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.testfinalcharity.OrgSurveyOne;
import com.example.testfinalcharity.R;

public class HomePage extends AppCompatActivity {
    private Button button;
    private Button volunteerbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        button = (Button) findViewById(R.id.submitButton);
        volunteerbutton = (Button) findViewById(R.id.button5);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOrganization_Survey();

            }
        });
        volunteerbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openVolunteer_Survey();

            }
        });
    }

    public void openOrganization_Survey() {

        Intent intent = new Intent(this, OrgSurveyOne.class);
        startActivity(intent);
    }
    public void openVolunteer_Survey() {

        Intent intent = new Intent(this, com.example.TestFinalCharity.VolunteerSurvey.class);
        startActivity(intent);
    }




}

