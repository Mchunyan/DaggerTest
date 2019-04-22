package com.chunyan.daggertest.base;

import android.app.Application;


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
