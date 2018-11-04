package com.example.lenovo.space_optimization;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Clubs extends AppCompatActivity {

    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clubs);
        ActionBar ab = getSupportActionBar();
        ab.setTitle("Clubs and Societies");
        tv = (TextView) findViewById(R.id.rehnuma);
        final Intent my = new Intent(this,Rehnuma.class);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(my);
            }
        });

    }
}
