package com.example.mvp_sample.di;

import android.app.Application;
import android.content.Context;

import dagger.Binds;
import dagger.Module;

/**
 * Created by KiyoungLee on 2018-02-11.
 */

@Module
public abstract class ApplicationModule {

    @Binds
    abstract Context bindContext(Application application);
}
