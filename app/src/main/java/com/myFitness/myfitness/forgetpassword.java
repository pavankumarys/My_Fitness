package com.myFitness.myfitness;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class forgetpassword extends AppCompatActivity {
    TextView textview10;
    EditText email1;
    TextView resetpassword;
    ProgressBar progressBar3;
    FirebaseAuth auth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgetpassword);
        textview10=findViewById(R.id.textview10);
        email1=findViewById(R.id.email1);
        resetpassword=findViewById(R.id.resetpassword);
        progressBar3=findViewById(R.id.progressBar3);

        auth=FirebaseAuth.getInstance();
        resetpassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetpassword();
            }
        });
    }
    public void resetpassword(){
        String email=email1.getText().toString().trim();
        if(email.isEmpty()){
            email1.setError("email cannot be empty");
            email1.requestFocus();
            return;
        }
        if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            email1.setError("please enter valid email ");
            email1.requestFocus();
            return;
        }
        progressBar3.setVisibility(View.VISIBLE);
        auth.sendPasswordResetEmail(email).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull  Task<Void> task) {
               if(task.isSuccessful()){
                   Toast.makeText(forgetpassword.this, "check your email to reset your password", Toast.LENGTH_SHORT).show();
               }
               else{
                   Toast.makeText(forgetpassword.this, "Error!...  Try again", Toast.LENGTH_SHORT).show();
                   progressBar3.setVisibility(View.GONE);
               }
            }
        });
    }
}