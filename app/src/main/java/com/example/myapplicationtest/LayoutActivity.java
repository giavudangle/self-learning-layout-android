package com.example.myapplicationtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Toast;

public class LayoutActivity extends AppCompatActivity {

    public static int RETURN_VALUE_CODE = 9999;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constraint_layout);


        Intent intent = getIntent();

        final String receiveData  = intent.getStringExtra("dataSend");

        findViewById(R.id.testBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(LayoutActivity.this, receiveData.toString(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent();
                intent.putExtra("RETURN_VALUE",receiveData.toString()+ "Returned");
                setResult(RETURN_VALUE_CODE,intent);
                finish();

            }
        });
    }
}