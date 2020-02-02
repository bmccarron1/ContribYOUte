package com.example.testfinalcharity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class OrgSurveyOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.survey_org);

        final OrgSurveyResult surveyResult = new OrgSurveyResult();

        final Button button = findViewById(R.id.NextButton);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent startingSecondActivity = new Intent(getApplicationContext(), OrgSurveyTwo.class);
                startActivity(startingSecondActivity);
            }
        });




        Button newActivityButton = findViewById(R.id.NextButton);


        //Education Box
        CheckBox educationCheckBox = findViewById(R.id.EducationBox);
        educationCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                surveyResult.Education = isChecked;
            }

        }


        );



        //Enviromental Box
        CheckBox enviromentalCheckBox = findViewById(R.id.EnviromentalBox);
        enviromentalCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                surveyResult.Enviromental = isChecked;
            }
        });

       //Soup Kitchen
        CheckBox soupCheckBox = findViewById(R.id.SoupBox);
        soupCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                surveyResult.SoupKitchen = isChecked;
            }
        });

        //Shelter
        CheckBox shelterCheckBox = findViewById(R.id.SoupBox);
        shelterCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                surveyResult.Shelter = isChecked;
            }
        });
        //Politicial
        CheckBox politicialCheckBox = findViewById(R.id.PoliticalBox);
        politicialCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                surveyResult.Political = isChecked;
            }
        });

        //Relief
        CheckBox reliefCheckBox = findViewById(R.id.ReliefBox);
        reliefCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

            }
        });

        //Resource
        CheckBox resourceCheckBox = findViewById(R.id.ResourceBox);
        resourceCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                surveyResult.Collection = isChecked;
            }
        });


        }

    }


