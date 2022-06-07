package com.myFitness.myfitness;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;

public class homee extends AppCompatActivity implements View.OnClickListener{
     CardView D1,D2,D3,D4,D5,D6,D7,D8,D10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homee);
        D1=(CardView)findViewById(R.id.d1);
        D2=(CardView)findViewById(R.id.d2);
        D3=(CardView)findViewById(R.id.d3);
        D4=(CardView)findViewById(R.id.d4);
        D5=(CardView)findViewById(R.id.d5);
        D6=(CardView)findViewById(R.id.d6);
        D7=(CardView)findViewById(R.id.d7);
        D8=(CardView)findViewById(R.id.d8);
        D10=(CardView)findViewById(R.id.d10);
        D1.setOnClickListener((View.OnClickListener) this);
        D2.setOnClickListener((View.OnClickListener) this);
        D3.setOnClickListener((View.OnClickListener) this);
        D4.setOnClickListener((View.OnClickListener) this);
        D5.setOnClickListener((View.OnClickListener) this);
        D6.setOnClickListener((View.OnClickListener) this);
        D7.setOnClickListener((View.OnClickListener) this);
        D8.setOnClickListener((View.OnClickListener) this);
        D10.setOnClickListener((View.OnClickListener) this);




    }
    public void onClick(View view){
        Intent i;
        switch (view.getId()){
            case R.id.d1 : i=new Intent(this,abs.class);startActivity(i);break;
            case R.id.d2 : i=new Intent(this,homeworkout.class);startActivity(i);break;
            case R.id.d3 : i=new Intent(this,legs.class);startActivity(i);break;
            case R.id.d4 : i=new Intent(this,chest.class);startActivity(i);break;
            case R.id.d5 : i=new Intent(this,bicep.class);startActivity(i);break;
            case R.id.d6 : i=new Intent(this,tricep.class);startActivity(i);break;
            case R.id.d7 : i=new Intent(this,shoulder.class);startActivity(i);break;
            case R.id.d8 : i=new Intent(this,back.class);startActivity(i);break;
            case R.id.d10 : i=new Intent(this,bmi.class);startActivity(i);break;

        }
    }
    public void logout(View v){
        FirebaseAuth.getInstance().signOut();
        startActivity(new Intent(getApplicationContext(),login.class));
        finish();

    }




}