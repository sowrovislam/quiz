package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class bmi extends AppCompatActivity {


    TextView newtext;


    public static String TITTLE="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);


        newtext=findViewById(R.id.newtext);

newtext.append(TITTLE);












    }
}