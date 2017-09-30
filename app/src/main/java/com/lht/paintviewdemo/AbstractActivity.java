package com.lht.paintviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.lht.paintviewdemo.util.StatusBarUtil;

/**
 * Created by lht-Mac on 2017/9/29.
 */

public abstract class AbstractActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        StatusBarUtil.setStatusBarColor(this, R.color.colorPrimary);
        StatusBarUtil.setStatusBarDarkMode(this);
    }
}
