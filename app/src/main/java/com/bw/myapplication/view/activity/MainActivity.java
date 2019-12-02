package com.bw.myapplication.view.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;

import com.bw.myapplication.R;
import com.bw.myapplication.base.BaseActivity;

public class MainActivity extends BaseActivity {

    private ViewPager viewPager;


    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        viewPager = findViewById(R.id.vp);
    }

    @Override
    protected int layoutId() {
        return R.layout.activity_main;
    }
}
