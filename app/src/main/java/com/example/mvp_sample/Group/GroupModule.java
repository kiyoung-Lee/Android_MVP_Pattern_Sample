package com.example.mvp_sample.Group;

import com.example.mvp_sample.di.ActivityScope;

import dagger.Binds;
import dagger.Module;

/**
 * Created by KiyoungLee on 2018-02-12.
 */

@Module
public abstract class GroupModule {

    @ActivityScope
    @Binds
    abstract GroupContract.Presenter groupPresenter(GroupPresenterImpl presenter);
}
