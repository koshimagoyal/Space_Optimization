
package com.example.lenovo.space_optimization;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Team extends AppCompatActivity {

    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team);
        ActionBar ab = getSupportActionBar();
        ab.setTitle("Teams");
        tv = (TextView) findViewById(R.id.creative);
        final Intent my = new Intent(this,Creative.class);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(my);
            }
        });
    }
}
