package com.example.mvp_sample.Main;

import com.example.mvp_sample.di.ActivityScope;

import dagger.Binds;
import dagger.Module;

/**
 * Created by KiyoungLee on 2018-02-11.
 */

@Module
public abstract class MainModule {

    @ActivityScope
    @Binds
    abstract MainContract.Presenter mainPresenter(MainPresenterImpl presenter);
}
