package com.geektech.lesson1android3.ui.onboard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.geektech.lesson1android3.R;
import com.geektech.lesson1android3.ui.base.BaseActivity;

public class OnBoardActivity extends BaseActivity {

    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_board);
        initViews();
    }

    private void initViews() {
        viewPager = findViewById(R.id.viewPager);
    }


}
