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

public class login extends AppCompatActivity {
    ImageView imageview1;
    TextView textview3;
    Button button3;
    TextView textview4;
    EditText email;
    EditText password;
    ProgressBar progressBar2;
    FirebaseAuth fAuth;
    TextView forgetpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        imageview1 =findViewById(R.id.imageview1);
        textview3=findViewById(R.id.textview3);
        textview4=findViewById(R.id.TextView2);
        button3=findViewById(R.id.button3);
        email=findViewById(R.id.email);
        password=findViewById(R.id.Password);
        progressBar2=findViewById(R.id.progressBar2);
        forgetpassword=findViewById(R.id.forgetpasword);
        fAuth=FirebaseAuth.getInstance();

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Email=email.getText().toString().trim();
                String Password=password.getText().toString().trim();
                if (TextUtils.isEmpty(Email)) {

                    email.setError("Email cannot be empty");
                    return;
                }
                if(TextUtils.isEmpty(Password)){
                    password.setError("password cannot be empty");
                    return;
                }
                if(password.length()<6){
                    password.setError("password must be more than 6 characters");
                    return;
                }
                progressBar2.setVisibility(View.VISIBLE);
//             user authentication
                fAuth.signInWithEmailAndPassword(Email,Password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(login.this, "Login successful", Toast.LENGTH_SHORT).show();
                           startActivity(new Intent(getApplicationContext(), homee.class));
                        }
                        else{
                            Toast.makeText(login.this, "Error !" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                       progressBar2.setVisibility(View.GONE);
                        }
                    }
                });
            }
        });
    }
    public void ontouch(View view){
        Intent intent=new Intent(login.this,signup.class);
        startActivity(intent);
    }
    public void onpress(View v){
        Intent intent=new Intent(login.this,forgetpassword.class);
        startActivity(intent);
    }
}