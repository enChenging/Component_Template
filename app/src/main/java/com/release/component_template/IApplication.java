package com.release.component_template;

import android.app.Application;

import com.release.router.Router;

/**
 * @author Mr.release
 * @create 2020/9/21
 * @Describe
 */

public class IApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Router.getInstance().init(this);
    }
}