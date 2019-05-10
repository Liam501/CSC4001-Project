package com.example.csc4001_3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class graphPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph_page);

        ImageButton settings = (ImageButton) findViewById(R.id.bt_setting);
        ImageButton home = (ImageButton) findViewById(R.id.bt_home);
        ImageButton list = (ImageButton) findViewById(R.id.bt_graph);
        ImageButton graph = (ImageButton) findViewById(R.id.bt_list);

        //settings jump
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent settingsJump = new Intent(graphPage.this, setting.class);
                startActivity(settingsJump);
            }
        });

        //home jump
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeJump = new Intent(graphPage.this, mainPage.class);
                startActivity(homeJump);
            }
        });

        //graph
        graph.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "已更新至最新状态", Toast.LENGTH_SHORT).show();
            }
        });

        //list jump
        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent listJump = new Intent(graphPage.this, listPage.class);
                startActivity(listJump);
            }
        });
    }
}
