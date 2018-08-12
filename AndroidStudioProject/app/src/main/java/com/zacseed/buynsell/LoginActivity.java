package com.zacseed.buynsell;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    public static String email;
    public static String pwd;
    public static String WvSwitch = "login";

    Intent loginToHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginToHome = new Intent(this,MainActivity.class);
        final Intent loginToCreateAccount = new Intent(LoginActivity.this,CreateAccountActivity.class);

        loginToHome.putExtra("EMAIL",email);
        loginToHome.putExtra("PWD",pwd);
        loginToHome.putExtra("SWITCH",WvSwitch);

        Button btnGoToCreateAcc = (Button) findViewById(R.id.btnGoToCreateAcc);
        Button btnLogin = (Button) findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editTextEmail = (EditText) findViewById(R.id.loginEmail);
                EditText editTextPwd = (EditText) findViewById(R.id.loginPwd);

                email = editTextEmail.getText().toString();
                pwd = editTextPwd.getText().toString();
                startActivity(loginToHome);
            }
        });

        btnGoToCreateAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(loginToCreateAccount);
            }
        });


    }
}
