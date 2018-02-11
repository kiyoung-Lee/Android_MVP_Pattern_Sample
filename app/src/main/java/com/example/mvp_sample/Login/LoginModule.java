package com.example.mvp_sample.Login;

import com.example.mvp_sample.di.ActivityScope;

import dagger.Binds;
import dagger.Module;

/**
 * Created by KiyoungLee on 2018-02-11.
 */

@Module
public abstract class LoginModule {

    @ActivityScope
    @Binds
    abstract LoginContract.Presenter loginPresenter(LoginPresenterImpl presenter);
}
