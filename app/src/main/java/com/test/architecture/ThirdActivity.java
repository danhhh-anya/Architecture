package com.test.architecture;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.test.architecture.treads.SomeThing;
import com.test.architecture.treads.SomeThread;

import java.util.ArrayList;
import java.util.Arrays;

public class ThirdActivity extends AppCompatActivity {
    private static final int REQUEST_PHONE_CALL = 22222;
    //Button btnStillContinue;

    private Button Button0, Button1, Button2, Button3, Button4, Button5, Button6, Button7, Button8, Button9, ButtonStar, ButtonPoundSymbol, Undo, Call;
    private EditText number;
    private ArrayList<Button> buttons;
    private SomeThread thread1;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        /*btnStillContinue = findViewById(R.id.btnStillContinue);
        btnStillContinue.setOnClickListener(view ->{
            Intent intent= new Intent(this,NewActivity.class);
            startActivity(intent);
        });*/

        Button0 = findViewById(R.id.button0);
        Button1 = findViewById(R.id.button1);
        Button2 = findViewById(R.id.button2);
        Button3 = findViewById(R.id.button3);
        Button4 = findViewById(R.id.button4);
        Button5 = findViewById(R.id.button5);
        Button6 = findViewById(R.id.button6);
        Button7 = findViewById(R.id.button7);
        Button8 = findViewById(R.id.button8);
        Button9 = findViewById(R.id.button9);
        ButtonStar = findViewById(R.id.buttonStar);
        ButtonPoundSymbol = findViewById(R.id.buttonPoundSymbol);
        number = findViewById(R.id.etPhone);

        Undo = findViewById(R.id.undoButton);
        Call = findViewById(R.id.callButton);
        progressBar = findViewById(R.id.progressBar);
        progressBar.setMax(100);



        buttons = new ArrayList<>(Arrays.asList(Button0, Button1, Button2, Button3, Button4, Button5, Button6, Button7, Button8, Button9, ButtonStar, ButtonPoundSymbol));
        setClickListeners();

        Call.setOnClickListener(v -> call(number.getText().toString()));


        Undo.setOnClickListener (view -> {
            if (number.getText().length() == 0) return; // если длина текста = 0, возвращаем
            number.setText(number.getText().toString().substring(0, number.getText().length() - 1));
            // substring создание стриги на основе той, которая уже есть
            // по сути, вторая строка означает, что мы удаляем по 1 символу из данной строки с символами

                });
        setProgress();

        /*Button0.setOnClickListener (view -> {
            number.setText("0");
        });*/


        // number.setText(number.getText().append("0"));


    /*    Button0.setOnClickListener (view -> {
            if (number.getText().equals("")){ // если поле ввода пустое: "0"
                number.setText("0");
            } else {                          // иначе: символы что уже введены на экране + "0"
                symbolsOnTheScreen = number.getText();
                number.setText(symbolsOnTheScreen + "0");
            }

            number.setText(number.getText().append("0")); // или toString()+"0"
        });

        Button1.setOnClickListener (view -> {
            if (number.getText().equals("")){
                number.setText("1");
            } else {
                symbolsOnTheScreen = number.getText();
                number.setText(symbolsOnTheScreen + "1");
            }
            number.setText(number.getText().append("1"));
        });

        Button2.setOnClickListener (view -> {
            if (number.getText().equals("")){
                number.setText("2");
            } else {
                symbolsOnTheScreen = number.getText();
                number.setText(symbolsOnTheScreen + "2");
            }
            number.setText(number.getText().append("2"));
        });

        Button3.setOnClickListener (view -> {
            if (number.getText().equals("")){
                number.setText("3");
            } else {
                symbolsOnTheScreen = number.getText();
                number.setText(symbolsOnTheScreen + "3");
            }
            number.setText(number.getText().append("3"));
        });

        Button4.setOnClickListener (view -> {
            if (number.getText().equals("")){
                number.setText("4");
            } else {
                symbolsOnTheScreen = number.getText();
                number.setText(symbolsOnTheScreen + "4");
            }
            number.setText(number.getText().append("4"));
        });

        Button5.setOnClickListener (view -> {
            if (number.getText().equals("")){
                number.setText("5");
            } else {
                symbolsOnTheScreen = number.getText();
                number.setText(symbolsOnTheScreen + "5");
            }
            number.setText(number.getText().append("5"));
        });

        Button6.setOnClickListener (view -> {
           if (number.getText().equals("")){
                number.setText("6");
            } else {
                symbolsOnTheScreen = number.getText();
                number.setText(symbolsOnTheScreen + "6");
            }
            number.setText(number.getText().append("6"));
        });

        Button7.setOnClickListener (view -> {
            if (number.getText().equals("")){
                number.setText("7");
            } else {
                symbolsOnTheScreen = number.getText();
                number.setText(symbolsOnTheScreen + "7");
            }
            number.setText(number.getText().append("7"));
        });

        Button8.setOnClickListener (view -> {
           if (number.getText().equals("")){
                number.setText("8");
            } else {
                symbolsOnTheScreen = number.getText();
                number.setText(symbolsOnTheScreen + "8");
            }
            number.setText(number.getText().append("8"));
        });

        Button9.setOnClickListener (view -> {
            if (number.getText().equals("")){
                number.setText("9");
            } else {
                symbolsOnTheScreen = number.getText();
                number.setText(symbolsOnTheScreen + "9");
            }
            number.setText(number.getText().append("9"));
        });

        ButtonStar.setOnClickListener (view -> {
            if (number.getText().equals("")){
                number.setText("*");
            } else {
                symbolsOnTheScreen = number.getText();
                number.setText(symbolsOnTheScreen + "*");
            }
            number.setText(number.getText().append("*"));
        });

        ButtonPoundSymbol.setOnClickListener (view -> {
            if (number.getText().equals("")){
                number.setText("#");
            } else {
                symbolsOnTheScreen = number.getText();
                number.setText(symbolsOnTheScreen + "#");
            }
            number.setText(number.getText().append("#"));
        });*/


    }
    private void setProgress(){
         Thread thread = new Thread(() -> {
        for (int i = 0; i<=100; i++){
            progressBar.setProgress(i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    });
        thread.setName("Progress Thread");
        thread.start();
    }

    private void startThreads(){
        //1
        thread1 = new SomeThread();
        thread1.start();
        //2
        SomeThing someThing = new SomeThing();
        Thread thread2 = new Thread(someThing);
        thread2.start();

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Привет из потока SomeThing");
            }
        });
        thread3.start();
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == REQUEST_PHONE_CALL){
            call(number.getText().toString());
        }
    }

    private void setClickListeners() {
        for (Button button : buttons) {
            button.setOnClickListener(v -> number.setText(number.getText().append(button.getText().toString())));
        }
    }

    private void call(String phone) {
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + phone));

        if (ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_PHONE_CALL);
        } else {
            startActivity(intent);
        }
    }
}
