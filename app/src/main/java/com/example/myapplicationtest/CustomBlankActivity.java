package com.example.myapplicationtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class CustomBlankActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_activity);

        Log.d("LogforString : " , "On CREATE");

    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("LogforString : " , "On Post Resume");

    }

//    comme

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LogforString : " , "On START");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LogforString : " , "On STOP");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LogforString : " , "On DESTROY");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LogforString : " , "On RESUME");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("LogforString : " , "On RESTART");

    }
}