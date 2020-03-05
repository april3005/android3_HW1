package com.geektech.lesson1android3.ui.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import com.geektech.lesson1android3.R;
import com.geektech.lesson1android3.data.PreferenceHelper;
import com.geektech.lesson1android3.ui.base.BaseActivity;
import com.geektech.lesson1android3.ui.main.MainActivity;
import com.geektech.lesson1android3.ui.onboard.OnBoardActivity;

public class SplashActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        chooseScreen();
    }

    private void chooseScreen(){
        if(PreferenceHelper.isShown()){startActivity(new Intent(this, MainActivity.class));

        }else {
            PreferenceHelper.setIsShown(true);
            startActivity(new Intent(this, OnBoardActivity.class));
        }
        finish();
    }
}
