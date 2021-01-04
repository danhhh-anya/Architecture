package com.test.architecture;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    Button btnLogin;
    EditText etLogin;
    EditText etPassword;
    ArrayList<UserModel> users;
    HashMap<String, UserModel> userTypes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLogin = findViewById(R.id.btnLogin);
        etLogin = findViewById(R.id.etLogin);
        etPassword = findViewById(R.id.etPassword);

        userTypes.put("ENGINEER", users.get(2));
        UserModel userEngineer = userTypes.get("ENGINEER");

        users = new Utils().getUsers();

        btnLogin.setOnClickListener(view -> {
            if (checkLogin(etLogin.getText().toString(), etPassword.getText().toString())  ) {
                startActivity();
            } else {
                    Toast.makeText(this, "The password or login are wrong", Toast.LENGTH_SHORT).show();
            }

        });




     /*  btnLogin.setOnClickListener(view -> {
            if (checkLogin(etLogin.getText().toString(), etPassword.getText().toString())  ) {

                if (isPasswordInvalid(etPassword.getText().toString())) {
                    startActivity();
                } else {
                    Toast.makeText(this, "The password is wrong", Toast.LENGTH_SHORT).show();

                }
            }

        });
      arrayList = new ArrayList<String>();
        arrayList.add(arrayList.size()/2, "1/2");
        */


    }


    private void startActivity() {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
        finish();
    }

    private boolean checkLogin(String login, String password) {
       // return login.equals(Utils.login);
        for (UserModel userModel: Utils.users){
            if (userModel.getLogin().equals(login) && userModel.getPassword().equals(password)) return true;
        }
        return false;
    }



            /*(String login) {
       for(int i = 0; i<Utils.logins.length; i++){
            if (Utils.logins[i].equals(login)) return true;
        }
        return false;
    }
*/




    private boolean checkPassword(String password) {return password.equals(password); }




  /*  private boolean checkNumbers(String password) {
        char[] array = password.toCharArray();
        for (char x : array) {
            if (Character.isDigit(x)) {
                return true;
            }
        }
        Toast.makeText(this, "The password needs to include numbers", Toast.LENGTH_SHORT).show();
        return false;
    }
        private boolean checkCapitalLetters(String password) {
        boolean result1 = false;
        boolean result2 = false;
            char[] array = password.toCharArray();
            for (char x : array) {
                if (Character.isUpperCase(x)) {
                   result1 = true;
                } else {
                    result2 = true;
                }
            }
            if (result1 && result2){
                return true;
            } else {
                Toast.makeText(this, "The password needs to include upper and lower letters", Toast.LENGTH_SHORT).show();
                return false;
            }
        }
        private boolean checkPasswordLength(String password) {
            if (password.length() >= 7){
                return true;
            } else {
                Toast.makeText(this, "The password needs to include seven or more symbols", Toast.LENGTH_SHORT).show();
                return false;
            }
        }

        private boolean isPasswordInvalid(String password){
            String tmpPassword=Utils.password;
            if (tmpPassword.equals(password)){
                return true;
            } else {
                return false;
            }
        }
        */


}