package com.release.basic;

import android.app.Application;

/**
 * @author Mr.release
 * @create 2020/9/21
 * @Describe
 */

public class BaseAppication extends Application {
    public final static boolean is_application = BuildConfig.is_application;
    @Override
    public void onCreate() {
        super.onCreate();
    }
}
