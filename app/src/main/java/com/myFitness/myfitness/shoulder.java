package com.myFitness.myfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class shoulder extends AppCompatActivity {
    LinearLayout Shoulder1,Shoulder2,Shoulder3,Shoulder4,Shoulder5,Shoulder6,Shoulder7,Shoulder8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoulder);
        Shoulder1=findViewById(R.id.shoulder1);
        Shoulder2=findViewById(R.id.shoulder2);
        Shoulder3=findViewById(R.id.shoulder3);
        Shoulder4=findViewById(R.id.shoulder4);
        Shoulder5=findViewById(R.id.shoulder5);
        Shoulder6=findViewById(R.id.shoulder6);
        Shoulder7=findViewById(R.id.shoulder9);
        Shoulder8=findViewById(R.id.shoulder8);



    }
    public void onClick(View view){
        Intent intent=new Intent(shoulder.this,countdowntimer.class);
        startActivity(intent);
    }
}