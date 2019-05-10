package com.example.csc4001_3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class resetPsw extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_psw);
        final Button resetPsw = (Button) findViewById(R.id.bt_resetPsw);
        resetPsw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"一封确认邮件已发送至您的注册邮箱", Toast.LENGTH_SHORT).show();
                Intent jumpBackStart = new Intent(resetPsw.this, MainActivity.class);
                startActivity(jumpBackStart);
            }
        });
    }
}
