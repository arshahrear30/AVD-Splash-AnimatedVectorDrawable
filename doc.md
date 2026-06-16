https://www.youtube.com/watch?v=Loo4i5IrZ4Y&list=LL&index=10&t=496s


https://www.youtube.com/watch?v=8F0lK2i3VJk&list=LL&index=8


https://www.youtube.com/watch?v=g-oAWrAvOMo&list=LL&index=7&t=298s


https://www.youtube.com/watch?v=HRJnlQTRHN0&list=LL&index=6


https://www.youtube.com/watch?v=AzmkIyIeTJs&list=LL&index=4


https://developer.android.com/develop/ui/views/launch/splash-screen#java



Manifest

<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    package="com.rohitanabhavane.learnguru">

    <application
        android:allowBackup="true"
        android:icon="@mipmap/ic_launcher"
        android:label="@string/app_name"
        android:roundIcon="@mipmap/ic_launcher_round"
        android:supportsRtl="true"
        android:theme="@style/Theme.LearnGuru">

        <activity
            android:name=".MainActivity"
            android:exported="true" />

        <activity
            android:name=".SplashScreen"
            android:exported="true"
            android:theme="@style/SplashScreen">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />

                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
    </application>

background_splashscren.xml


<?xml version="1.0" encoding="utf-8"?>
<layer-list xmlns:android="http://schemas.android.com/apk/res/android">

    <item android:drawable="@color/white" />

    <item>
        <bitmap
            android:gravity="center"
            android:src="@drawable/logo" />
    </item>

    <item>
        <bitmap
            android:gravity="bottom"
            android:src="@drawable/bottom_logo_text" />
    </item>

</layer-list>



SplashScreen.java

package com.rohitanabhavane.learnguru;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashScreen.this, MainActivity.class));
                finish();
            }
        }, 2000);

    }

}




themes.xml
<resources xmlns:tools="http://schemas.android.com/tools">
    <!-- Base application theme. -->
    <style name="Theme.LearnGuru" parent="Theme.MaterialComponents.DayNight.NoActionBar">
        <!-- Primary brand color. -->
        <item name="colorPrimary">@color/white</item>
        <item name="colorPrimaryVariant">@color/purple_700</item>
        <item name="colorOnPrimary">@color/white</item>
        <!-- Secondary brand color. -->
        <item name="colorSecondary">@color/teal_200</item>
        <item name="colorSecondaryVariant">@color/teal_700</item>
        <item name="colorOnSecondary">@color/black</item>
        <!-- Status bar color. -->
        <item name="android:statusBarColor" tools:targetApi="l">?attr/colorPrimary</item>
        <!-- Customize your theme here. -->
    </style>

    <!-- SplashScreen -->
    <style name="SplashScreen" parent="Theme.MaterialComponents.DayNight.NoActionBar">
        <item name="android:windowBackground">@drawable/background_splashscren</item>
        <item name="android:statusBarColor" tools:targetApi="l">?attr/colorOnPrimary</item>
    </style>

</resources>



