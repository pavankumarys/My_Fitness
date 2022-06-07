package com.myFitness.myfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class chest extends AppCompatActivity {
   LinearLayout Chest1,Chest2,Chest3,Chest4,Chest5,Chest6,Chest7,Chest8,Chest9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chest);
        Chest1=findViewById(R.id.chest1);
        Chest2=findViewById(R.id.chest2);
        Chest3=findViewById(R.id.chest3);
        Chest4=findViewById(R.id.chest4);
        Chest5=findViewById(R.id.chest5);
        Chest6=findViewById(R.id.chest6);
        Chest7=findViewById(R.id.chest7);
        Chest8=findViewById(R.id.chest8);
        Chest9=findViewById(R.id.chest9);

    }
    public void onClick(View view){
        Intent intent=new Intent(chest.this,countdowntimer.class);
        startActivity(intent);
    }
}