package com.example.mini;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {
FrameLayout frameLayout,frameLayout1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();




        setContentView(R.layout.activity_main);
frameLayout=findViewById(R.id.student);
        frameLayout1=findViewById(R.id.teacher);

frameLayout.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent next=new Intent(MainActivity.this,login_sigup.class);
        startActivity(next);

    }
});
frameLayout1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent next=new Intent(MainActivity.this,techer_log.class);
        startActivity(next);
    }
});
    }
}