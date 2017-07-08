package com.example.mvp_sample.Common;

import android.app.Application;

import com.facebook.login.LoginManager;

/**
 * Created by KiyoungLee on 2017-06-17.
 */

public class SampleApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
    }



    @Override
    public void onTerminate() {
        super.onTerminate();
        LoginManager.getInstance().logOut();
    }
}
