package com.example.myapplicationtest;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class IntentExampleActivity extends AppCompatActivity {
    TextView txtView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_api_layout);

      txtView = findViewById(R.id.txtLabel);

        final TextView c = findViewById(R.id.txtChange);

        Button button = findViewById(R.id.btnEdit);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                String s = txtView.getText().toString();
//                Toast.makeText(IntentExampleActivity.this, s, Toast.LENGTH_SHORT).show();

                    String changed = c.getText().toString();
                //Toast.makeText(IntentExampleActivity.this, c.getText().toString(), Toast.LENGTH_SHORT).show();
                txtView.setText(changed);
            }
        });

        findViewById(R.id.navigate).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                String s = txtView.getText().toString();
                intent.putExtra("dataSend",s);
                intent.setClass(IntentExampleActivity.this,LayoutActivity.class);
                startActivity(intent);
                startActivityForResult(intent,9999);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == LayoutActivity.RETURN_VALUE_CODE){
            String s = data.getStringExtra("RETURN_VALUE");
            txtView.setText(s);
        }
    }
}
