package com.zzzmode.appopsx.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDelegate;

import com.zzzmode.appopsx.ui.analytics.ATracker;
import com.zzzmode.appopsx.ui.core.SpHelper;

/**
 * Created by zl on 2017/1/7.
 */

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppCompatDelegate.setDefaultNightMode(SpHelper.getThemeMode(this));
    }

    @Override
    protected void onResume() {
        super.onResume();
        ATracker.onResume(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        ATracker.onPause(this);
    }
}
