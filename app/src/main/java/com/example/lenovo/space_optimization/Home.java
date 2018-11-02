package com.example.lenovo.space_optimization;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Home extends AppCompatActivity {

    private TextView tv,tv1,tv2,tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ActionBar ab = getSupportActionBar();
        ab.setTitle("Home");
        final Intent my = new Intent(this,Upcoming.class);
        final Intent my1 = new Intent(this,Clubs.class);
        final Intent my2 = new Intent(this,Student.class);
        final Intent my3 = new Intent(this,Drives.class);
        tv = (TextView) findViewById(R.id.up);
        tv1 = (TextView) findViewById(R.id.cs);
        tv2 = (TextView) findViewById(R.id.sw);
        tv3 = (TextView) findViewById(R.id.dr);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(my);
            }
        });

        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(my1);
            }
        });

        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(my2);
            }
        });

        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(my3);
            }
        });

    }
}
