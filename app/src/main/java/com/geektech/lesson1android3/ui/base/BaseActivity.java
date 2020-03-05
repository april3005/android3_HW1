package com.geektech.lesson1android3.ui.base;

import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

abstract public class BaseActivity extends AppCompatActivity {
    protected void toast (String msg){
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}
