package com.example.verify;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    EditText regUsername, regEmail, regPassword, regConfirmPassword;
    Button registerButton;
    TextView loginText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_layout);

        regUsername = findViewById(R.id.regUsername);
        regEmail = findViewById(R.id.regEmail);
        regPassword = findViewById(R.id.regPassword);
        regConfirmPassword = findViewById(R.id.regConfirmPassword);
        registerButton = findViewById(R.id.registerButton);
        loginText = findViewById(R.id.loginText);

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = regUsername.getText().toString();
                String email = regEmail.getText().toString();
                String password = regPassword.getText().toString();
                String confirmPassword = regConfirmPassword.getText().toString();

                if (validateInput(username, email, password, confirmPassword)) {
                    // Registration logic here
                    Toast.makeText(RegisterActivity.this, "Registration Successful!", Toast.LENGTH_SHORT).show();
                    // You can save user data to SharedPreferences or database here

                    // Go back to login page after successful registration
                    Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });

        loginText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Navigate back to login page
                Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    private boolean validateInput(String username, String email, String password, String confirmPassword) {
        if (username.isEmpty()) {
            regUsername.setError("Username is required");
            return false;
        }
        if (email.isEmpty()) {
            regEmail.setError("Email is required");
            return false;
        }
        if (password.isEmpty()) {
            regPassword.setError("Password is required");
            return false;
        }
        if (confirmPassword.isEmpty()) {
            regConfirmPassword.setError("Please confirm your password");
            return false;
        }
        if (!password.equals(confirmPassword)) {
            regConfirmPassword.setError("Passwords do not match");
            return false;
        }
        if (password.length() < 6) {
            regPassword.setError("Password must be at least 6 characters");
            return false;
        }
        return true;
    }
}