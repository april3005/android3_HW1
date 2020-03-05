package com.geektech.lesson1android3.ui.main;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.geektech.lesson1android3.R;
import com.geektech.lesson1android3.ui.base.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
