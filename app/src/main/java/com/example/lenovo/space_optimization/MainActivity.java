package com.example.lenovo.space_optimization;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txt;
    private ImageView iv;
    private ProgressBar pb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = (TextView) findViewById(R.id.text);
        iv = (ImageView) findViewById(R.id.logo);
        pb = (ProgressBar) findViewById(R.id.pb);
        Animation myanim = AnimationUtils.loadAnimation(this,R.anim.splash_anim);
        txt.startAnimation(myanim);
        iv.startAnimation(myanim);
        pb.startAnimation(myanim);
        final Intent my = new Intent(this,Home.class);
        Thread timer = new Thread(){
            public void run()
            {
                try{
                    sleep(5000);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
                finally {
                    startActivity(my);
                    finish();
                }
            }
        };
        timer.start();
    }
}
