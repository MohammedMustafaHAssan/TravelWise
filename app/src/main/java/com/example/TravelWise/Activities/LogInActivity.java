package com.example.TravelWise.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.TravelWise.R;

public class LogInActivity extends AppCompatActivity {

    EditText name , password;
    Button btnsign , btnlog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        name = findViewById(R.id.editTextText2);
        password = findViewById(R.id.editTextTextPassword);
        btnlog = findViewById(R.id.btnlog);
        btnsign = findViewById(R.id.btnsign);

        btnlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = name.getText().toString();
                String userPass = password.getText().toString();
                if (username.isEmpty()||userPass.isEmpty()){
                    Toast.makeText(LogInActivity.this, "Enter valid input or create acount", Toast.LENGTH_SHORT).show();
                } else {
                    Intent logintent = new Intent(LogInActivity.this,MainActivity.class);
                    startActivity(logintent);
                    Toast.makeText(LogInActivity.this, "Logged in successfully", Toast.LENGTH_SHORT).show();
                    finish();
                }

            }
        });

        btnsign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent signIntent = new Intent(LogInActivity.this,SignInActivity.class);
                startActivity(signIntent);
            }
        });

    }
}