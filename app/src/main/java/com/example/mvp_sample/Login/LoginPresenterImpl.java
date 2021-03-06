package com.example.mvp_sample.Login;

import static com.google.common.base.Preconditions.checkNotNull;

import com.example.mvp_sample.Login.Data.LoginRepository;

/**
 * Created by KiyoungLee on 2017-06-21.
 */

public class LoginPresenterImpl implements LoginContract.Presenter {

    private LoginRepository repository;
    private LoginContract.ActivityView activityView;

    public LoginPresenterImpl(LoginRepository repository) {
        this.repository = repository;
    }

    public void setActivityView(LoginContract.ActivityView activityView) {
        this.activityView = activityView;
    }

    @Override
    public void start() {

    }
}
