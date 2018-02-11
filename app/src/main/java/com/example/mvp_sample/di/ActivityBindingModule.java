package com.example.mvp_sample.di;

import com.example.mvp_sample.DynamicList.DynamicActivity;
import com.example.mvp_sample.DynamicList.DynamicModule;
import com.example.mvp_sample.Group.GroupActivity;
import com.example.mvp_sample.Group.GroupModule;
import com.example.mvp_sample.Login.LoginActivity;
import com.example.mvp_sample.Login.LoginModule;
import com.example.mvp_sample.Main.MainActivity;
import com.example.mvp_sample.Main.MainModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by KiyoungLee on 2018-02-11.
 */

@Module
public abstract class ActivityBindingModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = MainModule.class)
    abstract MainActivity mainActivity();

    @ActivityScope
    @ContributesAndroidInjector(modules = LoginModule.class)
    abstract LoginActivity loginActivity();

    @ActivityScope
    @ContributesAndroidInjector(modules = GroupModule.class)
    abstract GroupActivity groupActivity();

    @ActivityScope
    @ContributesAndroidInjector(modules = DynamicModule.class)
    abstract DynamicActivity dynamicActivity();
}
