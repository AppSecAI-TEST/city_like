package com.android.jco.citylike_android.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.android.jco.citylike_android.BuildConfig;
import com.android.jco.citylike_android.R;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;


public class SplashScreen extends AppCompatActivity {


    private ImageView splashScreenIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        splashScreenIcon = (ImageView)findViewById(R.id.splashScreenIcon);

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.shrink_icon);
        splashScreenIcon.startAnimation(animation);
        Thread welcomeThread = new Thread() {

                    @Override
                    public void run() {
                        try {
                            super.run();


                            sleep(10000);
                } catch (Exception e) {

                } finally {

                    Intent startLoginActivity = new Intent(SplashScreen.this, LoginActivity.class);
                    startActivity(startLoginActivity);
                    finish();
                }
            }
        };

        welcomeThread.start();
    }

}