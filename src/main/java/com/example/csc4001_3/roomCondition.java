package com.example.csc4001_3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class roomCondition extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_condition);
        //初始化所有image buttons
        ImageButton settings = (ImageButton) findViewById(R.id.bt_setting);
        ImageButton home = (ImageButton) findViewById(R.id.bt_home);
        ImageButton list = (ImageButton) findViewById(R.id.bt_graph);
        ImageButton graph = (ImageButton) findViewById(R.id.bt_list);

        //设置button转跳

        //setting跳转
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent settingsJump = new Intent(roomCondition.this, setting.class);
                startActivity(settingsJump);
            }
        });

        //graph jump
        graph.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent listJump = new Intent(roomCondition.this, graphPage.class);
                startActivity(listJump);
            }
        });

        //list jump
        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent graphJump = new Intent(roomCondition.this, listPage.class);
                startActivity(graphJump);
            }
        });

        //home jump
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent graphJump = new Intent(roomCondition.this, mainPage.class);
                startActivity(graphJump);
            }
        });
    }
}
