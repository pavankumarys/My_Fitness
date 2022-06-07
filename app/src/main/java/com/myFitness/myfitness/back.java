package com.myFitness.myfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class back extends AppCompatActivity {
   LinearLayout Back1,Back2,Back3,Back4,Back5,Back6,Back7,Back8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back);
        Back1=findViewById(R.id.back1);
        Back2=findViewById(R.id.back2);
        Back3=findViewById(R.id.back3);
        Back4=findViewById(R.id.back4);
        Back5=findViewById(R.id.back5);
        Back6=findViewById(R.id.back6);
        Back7=findViewById(R.id.back7);
        Back8=findViewById(R.id.back8);
    }
    public void onClick(View view){
        Intent intent=new Intent(back.this,countdowntimer.class);
        startActivity(intent);
    }
}