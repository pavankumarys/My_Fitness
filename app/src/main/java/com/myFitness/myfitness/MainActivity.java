package com.myFitness.myfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textview1;
    TextView textview2;
    Button button;
    Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textview1=findViewById(R.id.textview1);
        textview2=findViewById(R.id.textview2);
        button=findViewById(R.id.resetpassword);
        button2=findViewById(R.id.button2);
    }
    public void onclick(View v){
        Intent intent=new Intent(MainActivity.this,login.class);
        startActivity(intent);
    }
    public void onhit(View view){
        Intent intent=new Intent(MainActivity.this,signup.class);
        startActivity(intent);
    }
}