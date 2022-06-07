package com.myFitness.myfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class bicep extends AppCompatActivity {
 LinearLayout Bicep1,Bicep2,Bicep3,Bicep4,Bicep5,Bicep6,Bicep7,Bicep8,Bicep9,Bicep10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bicep);
        Bicep1=findViewById(R.id.bicep1);
        Bicep2=findViewById(R.id.bicep2);
        Bicep3=findViewById(R.id.bicep3);
        Bicep4=findViewById(R.id.bicep4);
        Bicep5=findViewById(R.id.bicep5);
        Bicep6=findViewById(R.id.bicep6);
        Bicep7=findViewById(R.id.bicep7);
        Bicep8=findViewById(R.id.bicep8);
        Bicep9=findViewById(R.id.bicep9);
        Bicep10=findViewById(R.id.bicep10);

    }
    public void onClick(View view){
        Intent intent=new Intent(bicep.this,countdowntimer.class);
        startActivity(intent);
    }
}