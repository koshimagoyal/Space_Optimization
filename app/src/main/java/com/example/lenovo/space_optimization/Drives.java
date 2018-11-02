package com.example.lenovo.space_optimization;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Drives extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drives);
        ActionBar ab = getSupportActionBar();
        ab.setTitle("Drives");
    }
}
