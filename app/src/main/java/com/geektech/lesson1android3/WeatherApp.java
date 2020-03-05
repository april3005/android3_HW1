package com.geektech.lesson1android3;

import android.app.Application;

import com.geektech.lesson1android3.data.PreferenceHelper;

public class WeatherApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        new PreferenceHelper(this);
    }
}
