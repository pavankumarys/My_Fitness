package com.myFitness.myfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Locale;

public class countdowntimer extends AppCompatActivity {
    private static final long START_TIME_IN_MILLIS=60000;
TextView textView;
ImageView Imageview;
Button Button1;
Button Button2;
CountDownTimer mCountDownTimer;
boolean mTimerRunning;
long mTimeLeftInMillis=START_TIME_IN_MILLIS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer);
        Imageview=findViewById(R.id.imageview);
        textView=findViewById(R.id.textview1);
        Button1=findViewById(R.id.button1);
        Button2=findViewById(R.id.button2);
        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              if(mTimerRunning){
                  pauseTimer();
              }
              else{
                  startTimer();
              }
            }
        });
        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             resetTimer();
            }
        });
        updateCountDownText();
    }
    public void startTimer(){
        mCountDownTimer=new CountDownTimer(mTimeLeftInMillis,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                mTimeLeftInMillis=millisUntilFinished;
                updateCountDownText();
            }

            @Override
            public void onFinish() {
              mTimerRunning=false;
              Button1.setText("start");
              Button1.setVisibility(View.INVISIBLE);
              Button2.setVisibility(View.VISIBLE);
            }
        }.start();
        mTimerRunning=true;
        Button1.setText("pause");
        Button2.setVisibility(View.INVISIBLE);
        }
    public void  pauseTimer(){
       mCountDownTimer.cancel();
       mTimerRunning=false;
       Button1.setText("start");
       Button2.setVisibility(View.VISIBLE);
    }
    public void resetTimer(){
        mTimeLeftInMillis=START_TIME_IN_MILLIS;
        updateCountDownText();
        Button2.setVisibility(View.INVISIBLE);
        Button1.setVisibility(View.VISIBLE);
    }
    public void updateCountDownText(){
        int minutes=(int)(mTimeLeftInMillis/1000)/60;
        int seconds=(int) (mTimeLeftInMillis/1000)%60;
        String timeLeftFormatted= String.format(Locale.getDefault(),"%02d:%02d",minutes,seconds);
        textView.setText(timeLeftFormatted);
    }
}