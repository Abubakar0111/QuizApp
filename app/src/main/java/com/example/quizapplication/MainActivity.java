package com.example.quizapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1,btn2;
        btn1 = findViewById(R.id.btnlogin);
        btn2 = findViewById(R.id.btnSignup);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ilogin;
               ilogin =  new Intent(MainActivity.this, LoginActivity.class);
               startActivity(ilogin);
            }


        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iSignUp;
                iSignUp =  new Intent(MainActivity.this, Signup.class);
               startActivity(iSignUp);
            }


        });
    }
}