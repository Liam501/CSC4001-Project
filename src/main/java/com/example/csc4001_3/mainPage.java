package com.example.csc4001_3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class mainPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        final ImageView refresh = findViewById(R.id.img_refresh);
        refresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final RotateAnimation animation = new RotateAnimation(0.0f, 180.0f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                animation.setDuration(500);
                refresh.startAnimation(animation);
                Toast.makeText(getApplicationContext(),"数据已更新", Toast.LENGTH_SHORT).show();
            }
        });

        //初始化所有image buttons
        ImageButton settings = findViewById(R.id.bt_setting);
        ImageButton home = findViewById(R.id.bt_home);
        ImageButton list = findViewById(R.id.bt_graph);
        ImageButton graph = findViewById(R.id.bt_list);

        //设置button转跳

        //setting跳转
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent settingsJump = new Intent(mainPage.this, setting.class);
                startActivity(settingsJump);
            }
        });

        //graph jump
        graph.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent listJump = new Intent(mainPage.this, graphPage.class);
                startActivity(listJump);
            }
        });

        //list jump
        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent graphJump = new Intent(mainPage.this, listPage.class);
                startActivity(graphJump);
            }
        });

        //home则刷新
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"数据已更新", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
