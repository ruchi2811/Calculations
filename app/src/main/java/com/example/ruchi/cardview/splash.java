package com.example.ruchi.cardview;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class splash extends AppCompatActivity {
    private TextView tv;
    private ImageView iv;
    private static int SPLASH_TIME_OUT = 3500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        tv = (TextView) findViewById(R.id.splashtext);
        iv = (ImageView) findViewById(R.id.iv);
        Animation myanimation = AnimationUtils.loadAnimation(this, R.anim.myanim);
        tv.startAnimation(myanimation);
        iv.startAnimation(myanimation);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(splash.this, MainActivity.class);
                startActivity(i);
                finish();
            }


        }, SPLASH_TIME_OUT);
    }
}