package com.myFitness.myfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class legs extends AppCompatActivity {
 LinearLayout Legs1,Legs2,Legs3,Legs4,Legs5,Legs6,Legs7,Legs8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legs);
        Legs1=findViewById(R.id.legs1);
        Legs2=findViewById(R.id.legs2);
        Legs3=findViewById(R.id.legs3);
        Legs4=findViewById(R.id.legs4);
        Legs5=findViewById(R.id.legs5);
        Legs6=findViewById(R.id.legs6);
        Legs7=findViewById(R.id.legs7);
        Legs8=findViewById(R.id.legs8);
    }
    public void onClick(View view){
        Intent intent=new Intent(legs.this,countdowntimer.class);
        startActivity(intent);
    }
}