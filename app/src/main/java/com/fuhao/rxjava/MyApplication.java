package com.fuhao.rxjava;

import android.app.Application;

public class MyApplication extends Application {

    public static MyApplication App;

    @Override
    public void onCreate() {
        super.onCreate();
        App = this;
    }
}
