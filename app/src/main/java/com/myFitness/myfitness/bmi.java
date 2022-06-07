package com.myFitness.myfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class bmi extends AppCompatActivity {
EditText Weight;
EditText Height;
TextView textview1;
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
        Weight=findViewById(R.id.weight);
        Height=findViewById(R.id.height);
        textview1=findViewById(R.id.textview1);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String weight=Weight.getText().toString();
                double x=Integer.parseInt(weight);
                String height=Height.getText().toString();
                double y=Integer.parseInt(height);
                double bmi = x/(y*y);
                double res=bmi* 10_000;
                if(res<=18.5){
                    Toast.makeText(bmi.this,  "your bmi is " +res  + " \n You are under weight! \n Time To Build Muscles!!", Toast.LENGTH_LONG).show();
                }
                else if(res>18.5 && res<24.9){
                    Toast.makeText(bmi.this, "your bmi is " +res + " \n Your weight is normal \n DOING GREAT!!!", Toast.LENGTH_LONG).show();
                }
                else if(res>24.9&&res<29.9){
                    Toast.makeText(bmi.this, "your bmi is " +res + "\n You are over weight!\n High Time Loose Fat!! \n Dont Give Up", Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(bmi.this, "your bmi is " +res + "\n You are obese!! \n DONT GIVE UP!!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}