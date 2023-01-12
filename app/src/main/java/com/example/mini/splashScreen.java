package com.example.mini;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class splashScreen extends AppCompatActivity {
    TextView wel,learing;
private static  int splash_timeout=2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_splash_screen);
        Intent splash=new Intent(splashScreen.this,MainActivity.class);

        wel=findViewById(R.id.text1);
        learing=findViewById(R.id.text2);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent splashintent=new Intent(splashScreen.this,MainActivity.class);
                startActivity(splashintent);
                finish();





            }
        },splash_timeout);
        Animation myanimation= AnimationUtils.loadAnimation(splashScreen.this,R.anim.anminaton2);
        wel.startAnimation(myanimation);

        Animation myanimation2= AnimationUtils.loadAnimation(splashScreen.this,R.anim.amination1);
        learing.startAnimation(myanimation2);






















    }
}