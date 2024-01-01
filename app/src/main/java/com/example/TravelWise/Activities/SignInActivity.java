package com.example.TravelWise.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.TravelWise.R;

public class SignInActivity extends AppCompatActivity {
    EditText name , password, email , pNumber;
    Button signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        name = findViewById(R.id.editTextText3);
        password = findViewById(R.id.editTextTextPassword2);
        email = findViewById(R.id.editTextTextEmailAddress);
        pNumber = findViewById(R.id.editTextPhone);
        signup = findViewById(R.id.btnsignup);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = name.getText().toString();
                String userpass = password.getText().toString();
                String userEmail = email.getText().toString();
                String userNumber = pNumber.getText().toString();

                if (username.isEmpty()||userpass.isEmpty()||userEmail.isEmpty()||userNumber.isEmpty()){
                    Toast.makeText(SignInActivity.this, "Sign up Failed \n Enter Valid Input", Toast.LENGTH_SHORT).show();
                } else {
                    Intent SingupIntent = new Intent(SignInActivity.this,MainActivity.class);
                    startActivity(SingupIntent);
                    finish();
                }

            }
        });
    }
}