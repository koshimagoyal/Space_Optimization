package com.example.lenovo.space_optimization;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Upcoming extends AppCompatActivity {

    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upcoming);
        ActionBar ab = getSupportActionBar();
        ab.setTitle("Upcoming Events");
        tv = (TextView) findViewById(R.id.innerve);
        final Intent my = new Intent(this,Innerve.class);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(my);
            }
        });
    }
}
