package com.chunyan.daggertest.base;

import android.app.Application;

import com.chunyan.daggertest.DaggerBaseConponent;

public class MyApplication extends Application {

    private BaseConponent baseConponent;

    @Override
    public void onCreate() {
        super.onCreate();
        baseConponent = DaggerBaseConponent.create();
    }

    public BaseConponent getBaseConponent() {
        return baseConponent;
    }
}
