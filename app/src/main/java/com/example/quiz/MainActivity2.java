package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    LinearLayout layout;

    EditText tvage, tvhight, tvwight;

    Button button;


    TextView tvdisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        layout = findViewById(R.id.layout);


        tvage = findViewById(R.id.tvage);


        tvhight = findViewById(R.id.tvhight);
        tvwight = findViewById(R.id.tvwight);
        button = findViewById(R.id.button);
        tvdisplay = findViewById(R.id.tvdisplay);





            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (tvage.length() > 0) {


                    String mmm = tvage.getText().toString();

                    Integer age = Integer.parseInt(mmm);


                    String sss = tvhight.getText().toString();

                    Float hight = Float.parseFloat(sss);


                    String ooo = tvwight.getText().toString();

                    Float wight = Float.parseFloat(ooo);


                    double ggg = (hight * 0.3048 + wight * 0.0254);

                    double index = age / (ggg * ggg);


                    startActivity(new Intent(MainActivity2.this, bmi.class));


                    double qqq = index;

                    bmi.TITTLE = String.valueOf(qqq);

                    }else {

                        tvage.setError("Input the right valu");


                }

                }



            });




    }










    @Override
    public void onBackPressed() {
//        super.onBackPressed();


        new AlertDialog.Builder(MainActivity2.this)


                .setTitle("AlertDialog")
                .setMessage("you raaly exit this app!!")
                .setIcon(R.drawable.exit)


                .setNegativeButton("no", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();


                    }
                })


                .setPositiveButton("Exit!!", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        finish();


                    }
                })


                .show();


    }


    }

