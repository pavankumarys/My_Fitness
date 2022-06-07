package com.myFitness.myfitness;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class signup extends AppCompatActivity {
 ImageView imageview3;
 TextView signup2;
 EditText fullname;
 EditText Email;
 EditText Password;
 Button button5;
 TextView TextView2;
 ProgressBar progressBar;
 FirebaseAuth fAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        imageview3 = findViewById(R.id.imageview3);
        signup2=findViewById(R.id.signup2);
        fullname=findViewById(R.id.fullname);
        Email=findViewById(R.id.Email);
        Password=findViewById(R.id.Password);
        button5=findViewById(R.id.button5);
        TextView2=findViewById(R.id.TextView2);
        progressBar=findViewById(R.id.progressBar);
        fAuth=FirebaseAuth.getInstance();

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email=Email.getText().toString().trim();
                String password=Password.getText().toString().trim();
                if (TextUtils.isEmpty(email)) {

                    Email.setError("Email cannot be empty");
                    return;
                }
                if(TextUtils.isEmpty(password)){
                    Password.setError("password cannot be empty");
                    return;
                }
                if(password.length()<6){
                    Password.setError("password must be more than 6 characters");
                    return;
                }
                progressBar.setVisibility(View.VISIBLE);
                fAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull  Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(signup.this, "registered successfully", Toast.LENGTH_SHORT).show();
                          startActivity(new Intent(getApplicationContext(),login.class));
                        }
                        else{
                            Toast.makeText(signup.this, "Error in registering "+task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                            progressBar.setVisibility(View.GONE);
                        }
                    }
                });
            }

        });
        if(fAuth.getCurrentUser() != null){
            Toast.makeText(this, "you are already registered!", Toast.LENGTH_SHORT).show();
        }
    }
    public void onClick(View v){
        Intent intent=new Intent(signup.this,login.class);
        startActivity(intent);
    }
}