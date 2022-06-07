package com.myFitness.myfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class tricep extends AppCompatActivity {
    LinearLayout Tricep1,Tricep2,Tricep3,Tricep4,Tricep5,Tricep6,Tricep7,Tricep8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tricep);
        Tricep1=findViewById(R.id.tricep1);
        Tricep2=findViewById(R.id.tricep2);
        Tricep3=findViewById(R.id.tricep3);
        Tricep4=findViewById(R.id.tricep4);
        Tricep5=findViewById(R.id.tricep5);
        Tricep6=findViewById(R.id.tricep6);
        Tricep7=findViewById(R.id.tricep7);
        Tricep8=findViewById(R.id.tricep8);
    }
    public void onClick(View view ){
        Intent intent=new Intent(tricep.this,countdowntimer.class);
        startActivity(intent);
    }
}