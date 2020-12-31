package com.test.architecture;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    public static  final int DELAY_IN_MILLIS = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


/*      new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent= new Intent (SplashActivity.this, MainActivity.class );
                startActivity(intent);
            }
        }, DELAY_IN_MILLIS);*/
        new Handler().postDelayed(() -> {
                startActivity (new Intent (SplashActivity.this, MainActivity.class));
            finish();
        }, DELAY_IN_MILLIS);
    }
}