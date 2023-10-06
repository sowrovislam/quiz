package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity7 extends AppCompatActivity {

    TextView tvtex;
    Button button;
   CardView vii;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        tvtex=findViewById(R.id.tvtex);

        button=findViewById(R.id.button);
        
        vii=findViewById(R.id.vii);
        




        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                vii.setVisibility(View.VISIBLE);



                ConnectivityManager connectivityManager= (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);


                NetworkInfo networkInfo=connectivityManager.getActiveNetworkInfo();

                if (networkInfo!=null   && networkInfo.isConnected()){


                    tvtex.setText("Internet is canacted ");



                }else {

                    tvtex.setText("Internet is not canacted");
                }




            }
        });





    }
}