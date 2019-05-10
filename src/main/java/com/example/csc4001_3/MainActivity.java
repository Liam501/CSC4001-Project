package com.example.csc4001_3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;
//
//import java.sql.Connection;
//import java.sql.Driver;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.Properties;
//
//import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private Object psw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //点击"立即注册"进行页面转跳
        TextView signUp = (TextView) findViewById(R.id.tv_signup);
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent signUpJump = new Intent(MainActivity.this, signUp.class);
                startActivity(signUpJump);
            }
        });

        //点击"找回密码"进行页面转跳
        final TextView resetPsw = (TextView) findViewById(R.id.tv_resetPsw);
        resetPsw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent resetPswJump = new Intent(MainActivity.this, resetPsw.class);
                startActivity(resetPswJump);
            }
        });

        //点击"登陆"进入主界面
        Button login = (Button) findViewById(R.id.loginButton);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginJump = new Intent(MainActivity.this, mainPage.class);
                startActivity(loginJump);
            }
        });

        //隐藏密码findViewById(R.id.img_see));
        ToggleButton img = findViewById(R.id.bt_see);
        final EditText psw = findViewById(R.id.et_psw);

        img.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    psw.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                }
                else{
                    psw.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
            }
        });

    }
}
