package com.example.verify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.verify.R;

public class MainActivity2 extends AppCompatActivity {

    EditText username;
    EditText password;
    Button loginButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        loginButton = findViewById(R.id.loginButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equals("user") && password.getText().toString().equals("1234")) {
                    Toast.makeText(MainActivity2.this, "Login Successful!", Toast.LENGTH_SHORT).show();

                    // Go to Upload page
                    Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                } else {
                    Toast.makeText(MainActivity2.this, "Incorrect username or password!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}