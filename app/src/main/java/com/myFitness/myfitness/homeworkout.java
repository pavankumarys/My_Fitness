package com.myFitness.myfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class homeworkout extends AppCompatActivity {
    LinearLayout Homeworkout1,Homeworkout2,Homeworkout3,Homeworkout4,Homeworkout5,Homeworkout6,Homeworkout7,Homeworkout8,Homeworkout9,Homeworkout10,Homeworkout11,Homeworkout12,Homeworkout13,Homeworkout14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homeworkout);
        Homeworkout1=findViewById(R.id.homeworkout1);
        Homeworkout2=findViewById(R.id.homeworkout1);
        Homeworkout3=findViewById(R.id.homeworkout1);
        Homeworkout4=findViewById(R.id.homeworkout1);
        Homeworkout5=findViewById(R.id.homeworkout1);
        Homeworkout6=findViewById(R.id.homeworkout1);
        Homeworkout7=findViewById(R.id.homeworkout1);
        Homeworkout8=findViewById(R.id.homeworkout1);
        Homeworkout9=findViewById(R.id.homeworkout1);
        Homeworkout10=findViewById(R.id.homeworkout1);
        Homeworkout11=findViewById(R.id.homeworkout1);
        Homeworkout12=findViewById(R.id.homeworkout1);
        Homeworkout13=findViewById(R.id.homeworkout1);
        Homeworkout14=findViewById(R.id.homeworkout1);
    }
    public void onClick(View view){
        Intent intent=new Intent(homeworkout.this,countdowntimer.class);
        startActivity(intent);
    }
}