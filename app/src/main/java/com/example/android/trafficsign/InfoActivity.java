package com.example.android.trafficsign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {

    private TextView textView;
    private String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        Intent intent = getIntent();
        message = intent.getStringExtra("message");

        textView = findViewById(R.id.message_textview);
        textView.setText(message);
    }
}