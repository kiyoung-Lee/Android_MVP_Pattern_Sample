package com.example.mvp_sample.Common;

import android.app.Application;

import com.example.mvp_sample.di.DaggerAppComponent;
import com.facebook.login.LoginManager;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

/**
 * Created by KiyoungLee on 2017-06-17.
 */

public class SampleApplication extends DaggerApplication {

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerAppComponent.builder().application(this).build();
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        LoginManager.getInstance().logOut();
    }
}
