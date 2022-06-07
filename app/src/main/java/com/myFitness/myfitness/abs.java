package com.myFitness.myfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;


public class abs extends AppCompatActivity {
    LinearLayout Abs1,Abs2,Abs3,Abs4,Abs5,Abs6,Abs7,Abs8,Abs9;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abs);
        Abs1=findViewById(R.id.abs1);
        Abs2=findViewById(R.id.abs2);
        Abs3=findViewById(R.id.abs3);
        Abs4=findViewById(R.id.abs4);
        Abs5=findViewById(R.id.abs5);
        Abs6=findViewById(R.id.abs6);
        Abs7=findViewById(R.id.abs7);
        Abs8=findViewById(R.id.abs8);
        Abs9=findViewById(R.id.abs9);


    }
    public void onClick(View view){
        Intent intent=new Intent(abs.this,countdowntimer.class);
        startActivity(intent);
    }
}