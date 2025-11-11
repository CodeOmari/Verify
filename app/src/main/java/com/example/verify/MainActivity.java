package com.example.verify;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText certIdField;
    Button uploadBtn, verifyBtn, chooseFileBtn, resultBtn;
    Uri fileUri;

    private static final int FILE_SELECT_CODE = 101;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        certIdField = findViewById(R.id.certIdField);
        chooseFileBtn = findViewById(R.id.chooseFileBtn);
        uploadBtn = findViewById(R.id.uploadBtn);
        verifyBtn = findViewById(R.id.verifyBtn);
        resultBtn = findViewById(R.id.resultBtn);

        // Choose File Button
        chooseFileBtn.setOnClickListener(v -> {
            Toast.makeText(this, "Feature coming soon!", Toast.LENGTH_SHORT).show();
        });

        // Upload Button
        uploadBtn.setOnClickListener(v -> {
            Toast.makeText(this, "Feature coming soon!", Toast.LENGTH_SHORT).show();
        });

        // Verify Button
        verifyBtn.setOnClickListener(v -> {
            Toast.makeText(this, "Feature coming soon!", Toast.LENGTH_SHORT).show();
        });

        // Check Result Button
        resultBtn.setOnClickListener(v -> {
            Toast.makeText(this, "Feature coming soon!", Toast.LENGTH_SHORT).show();
        });
    }

    // Handle selected file (currently not used)
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == FILE_SELECT_CODE && resultCode == RESULT_OK) {
            fileUri = data.getData();
            Toast.makeText(this, "File selected", Toast.LENGTH_SHORT).show();
        }
    }
}