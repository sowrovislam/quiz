package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity10 extends AppCompatActivity {





    EditText edtex;
    Button button;

    TextView tvdisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);

        edtex=findViewById(R.id.edtex);
        button=findViewById(R.id.button);
        tvdisplay=findViewById(R.id.tvdisplay);




        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
















            }
        });








    }
}