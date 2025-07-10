package com.example.avdsplash;

import android.os.Bundle;
import android.os.Handler; // ডেটা লোডিং সিমুলেট করার জন্য
import androidx.activity.ComponentActivity;
import androidx.annotation.Nullable;
import androidx.core.splashscreen.SplashScreen; // SplashScreen ইম্পোর্ট করতে হবে

public class MainActivity extends ComponentActivity {

    private boolean isDataLoaded = false;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        SplashScreen splashScreen = SplashScreen.installSplashScreen(this); //এটি Android 12 থেকে চালু হওয়া SplashScreen API

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        splashScreen.setKeepOnScreenCondition(() -> !isDataLoaded);
        new Handler().postDelayed(() -> {
            isDataLoaded = true;
        }, 2000);
    }
}
