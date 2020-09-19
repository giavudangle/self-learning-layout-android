package com.example.myapplicationtest;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class MyCustomActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_layout);
        TextView txtView = findViewById(R.id.textViewLabel);
        txtView.setText(txtView.getText() + " NEW ACCOUNT");
    }
}
