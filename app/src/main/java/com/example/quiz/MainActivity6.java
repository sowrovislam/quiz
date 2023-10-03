package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity6 extends AppCompatActivity {

    ImageView tvimage;

    TextView tvtittle,tvdis;


    public static String TITTLE="";
    public static String DISCRIPSHON="";

    public static Bitmap My_Bitmap=null;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        tvimage=findViewById(R.id.tvimage);
        tvtittle=findViewById(R.id.tvtittle);
        tvdis=findViewById(R.id.tvdis);


        tvtittle.setText(TITTLE);
        tvdis.setText(DISCRIPSHON);


        if (My_Bitmap!=null){

            tvimage.setImageBitmap(My_Bitmap);
        }




    }
}