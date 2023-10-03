package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    TextView tvcount,spick;

    Button button1,button2,button3;

    TextToSpeech textToSpeech;

    int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        tvcount=findViewById(R.id.tvcount);
        button1=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);
        button3=findViewById(R.id.button3);
        spick =findViewById(R.id.spick);





//
//        textToSpeech =new TextToSpeech(MainActivity3.this, new TextToSpeech.OnInitListener() {
//            @Override
//            public void onInit(int status) {
//
//            }
//        });
//




textToSpeech =new TextToSpeech(MainActivity3.this, new TextToSpeech.OnInitListener() {
    @Override
    public void onInit(int status) {

    }
});





















        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                count++;
                tvcount.setText(""+count);

                textToSpeech.speak(""+spick.getText().toString(),textToSpeech.QUEUE_FLUSH,null, null);


            }
        });


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {






            if (count==0){




            }else {

              count--;
              tvcount.setText(""+count);


            }






            }
        });




        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                count=0;
                tvcount.setText(""+count);


            }
        });





    }
}