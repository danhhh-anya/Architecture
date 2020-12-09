package com.test.architecture;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ThirdActivity extends AppCompatActivity {
    Button btnStillContinue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        btnStillContinue = findViewById(R.id.btnStillContinue);
        btnStillContinue.setOnClickListener(view ->{
            Intent intent= new Intent(this,NewActivity.class);
            startActivity(intent);
        });
    }
}