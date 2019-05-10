package com.example.csc4001_3;

import android.content.Intent;
import android.media.Image;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class listPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_page);

        ImageButton settings = (ImageButton) findViewById(R.id.bt_setting);
        ImageButton home = (ImageButton) findViewById(R.id.bt_home);
        ImageButton list = (ImageButton) findViewById(R.id.bt_graph);
        ImageButton graph = (ImageButton) findViewById(R.id.bt_list);
        RelativeLayout roomCond = (RelativeLayout) findViewById(R.id.bigbed1);

        //设置button转跳

        //跳转至room condition page
        roomCond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent roomCondJump = new Intent(listPage.this, roomCondition.class);
                startActivity(roomCondJump);
            }
        });

        //setting跳转
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent settingsJump = new Intent(listPage.this, setting.class);
                startActivity(settingsJump);
            }
        });

        //home跳转
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeJump = new Intent(listPage.this, mainPage.class);
                startActivity(homeJump);
            }
        });

        //list跳转
        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "已更新至最新状态", Toast.LENGTH_SHORT).show();
            }
        });

        //graph跳转
        graph.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent graphJump = new Intent(listPage.this, graphPage.class);
                startActivity(graphJump);
            }
        });
    }
}
