package com.test.architecture;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.widget.Button;
import android.widget.EditText;

public class ThirdActivity extends AppCompatActivity {
    //Button btnStillContinue;

    Button Button0;
    Button Button1;
    Button Button2;
    Button Button3;
    Button Button4;
    Button Button5;
    Button Button6;
    Button Button7;
    Button Button8;
    Button Button9;
    Button ButtonStar;
    Button ButtonPoundSymbol;
    EditText number;

    Editable symbolsOnTheScreen;

    Button Undo;
    Button Call;

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


        Undo.setOnClickListener (view -> {
            if (number.getText().length() == 0) return; // если длина текста = 0, возвращаем
            number.setText(number.getText().toString().substring(0, number.getText().length() - 1));
            // substring создание стриги на основе той, которая уже есть
            // по сути, вторая строка означает, что мы удаляем по 1 символу из данной строки с символами

                });

        /*Button0.setOnClickListener (view -> {
            number.setText("0");
        });*/


        // number.setText(number.getText().append("0"));


        Button0.setOnClickListener (view -> {
            /*if (number.getText().equals("")){ // если поле ввода пустое: "0"
                number.setText("0");
            } else {                          // иначе: символы что уже введены на экране + "0"
                symbolsOnTheScreen = number.getText();
                number.setText(symbolsOnTheScreen + "0");
            }*/

            number.setText(number.getText().append("0")); // или toString()+"0"
        });

        Button1.setOnClickListener (view -> {
        /*    if (number.getText().equals("")){
                number.setText("1");
            } else {
                symbolsOnTheScreen = number.getText();
                number.setText(symbolsOnTheScreen + "1");
            }*/
            number.setText(number.getText().append("1"));
        });

        Button2.setOnClickListener (view -> {
        /*    if (number.getText().equals("")){
                number.setText("2");
            } else {
                symbolsOnTheScreen = number.getText();
                number.setText(symbolsOnTheScreen + "2");
            }*/
            number.setText(number.getText().append("2"));
        });

        Button3.setOnClickListener (view -> {
        /*    if (number.getText().equals("")){
                number.setText("3");
            } else {
                symbolsOnTheScreen = number.getText();
                number.setText(symbolsOnTheScreen + "3");
            }*/
            number.setText(number.getText().append("3"));
        });

        Button4.setOnClickListener (view -> {
        /*    if (number.getText().equals("")){
                number.setText("4");
            } else {
                symbolsOnTheScreen = number.getText();
                number.setText(symbolsOnTheScreen + "4");
            }*/
            number.setText(number.getText().append("4"));
        });

        Button5.setOnClickListener (view -> {
        /*    if (number.getText().equals("")){
                number.setText("5");
            } else {
                symbolsOnTheScreen = number.getText();
                number.setText(symbolsOnTheScreen + "5");
            }*/
            number.setText(number.getText().append("5"));
        });

        Button6.setOnClickListener (view -> {
        /*    if (number.getText().equals("")){
                number.setText("6");
            } else {
                symbolsOnTheScreen = number.getText();
                number.setText(symbolsOnTheScreen + "6");
            }*/
            number.setText(number.getText().append("6"));
        });

        Button7.setOnClickListener (view -> {
        /*    if (number.getText().equals("")){
                number.setText("7");
            } else {
                symbolsOnTheScreen = number.getText();
                number.setText(symbolsOnTheScreen + "7");
            }*/
            number.setText(number.getText().append("7"));
        });

        Button8.setOnClickListener (view -> {
        /*    if (number.getText().equals("")){
                number.setText("8");
            } else {
                symbolsOnTheScreen = number.getText();
                number.setText(symbolsOnTheScreen + "8");
            }*/
            number.setText(number.getText().append("8"));
        });

        Button9.setOnClickListener (view -> {
        /*    if (number.getText().equals("")){
                number.setText("9");
            } else {
                symbolsOnTheScreen = number.getText();
                number.setText(symbolsOnTheScreen + "9");
            }*/
            number.setText(number.getText().append("9"));
        });

        ButtonStar.setOnClickListener (view -> {
        /*    if (number.getText().equals("")){
                number.setText("*");
            } else {
                symbolsOnTheScreen = number.getText();
                number.setText(symbolsOnTheScreen + "*");
            }*/
            number.setText(number.getText().append("*"));
        });

        ButtonPoundSymbol.setOnClickListener (view -> {
        /*    if (number.getText().equals("")){
                number.setText("#");
            } else {
                symbolsOnTheScreen = number.getText();
                number.setText(symbolsOnTheScreen + "#");
            }*/
            number.setText(number.getText().append("#"));
        });



    }
}