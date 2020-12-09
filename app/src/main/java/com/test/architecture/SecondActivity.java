package com.test.architecture;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {
    Button btnContinue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        btnContinue = findViewById(R.id.btnContinue);
        btnContinue.setOnClickListener(view ->{
            Intent intent= new Intent(this,ThirdActivity.class);
            startActivity(intent);
        });
    }

}