package com.example.mvp_sample.DynamicList;

import com.example.mvp_sample.di.ActivityScope;

import dagger.Binds;
import dagger.Module;

/**
 * Created by KiyoungLee on 2018-02-12.
 */

@Module
public abstract class DynamicModule {

    @ActivityScope
    @Binds
    abstract DynamicContract.Presenter groupPresenter(DynamicPresenterImpl presenter);
}
