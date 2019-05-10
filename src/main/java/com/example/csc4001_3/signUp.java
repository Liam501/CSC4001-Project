package com.example.csc4001_3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class signUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        final Button signUpBt = findViewById(R.id.bt_signUp);
        final EditText etSignUpUserName = findViewById(R.id.et_signUpAccount);
        final EditText etSignUpPassword = findViewById(R.id.et_signUpPsw);
        signUpBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "一封确认邮件已发送至您的邮箱", Toast.LENGTH_SHORT).show();
                Intent jumpBackStart = new Intent(signUp.this, MainActivity.class);
                startActivity(jumpBackStart);
            }
        });
    }
}