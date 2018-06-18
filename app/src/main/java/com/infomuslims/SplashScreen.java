package com.infomuslims;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;



public class SplashScreen extends AppCompatActivity {

   // ProgressBar pb;
    RelativeLayout rll;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        rll=(RelativeLayout)findViewById(R.id.rl_splash);
        rll.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(SplashScreen.this,HomeScreen.class);
                startActivity(i);
            }
        },2000);
       // pb=(ProgressBar)findViewById(R.id.progressBar);
        Thread th=new Thread()
        {
            public void run()
            {
                for(int i=0;i<=100;i++)
                {
                    //pb.setProgress(i);
                    try{
                        sleep(500);
                    }
                    catch (Exception e)
                    {
                        e.printStackTrace();
                    }
                }
            }
        };
        th.start();
    }
}

