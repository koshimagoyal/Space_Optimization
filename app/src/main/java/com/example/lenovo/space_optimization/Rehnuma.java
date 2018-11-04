package com.example.lenovo.space_optimization;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Rehnuma extends AppCompatActivity {

    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rehnuma);
        ActionBar ab = getSupportActionBar();
        ab.setTitle("Rehnuma");
        tv = (TextView) findViewById(R.id.rl);
        final Intent my = new Intent(this,MapsActivity.class);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(my);
            }
        });
    }
}
