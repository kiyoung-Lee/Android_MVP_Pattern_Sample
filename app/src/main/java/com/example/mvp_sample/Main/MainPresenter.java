package com.example.mvp_sample.Main;

import com.example.mvp_sample.Main.Data.MainDataSource;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by kiyoung Lee on 2017-05-20.
 */

public class MainPresenter implements MainContract.Presenter {

    private MainDataSource repository;
    private MainContract.ActivityView activityView;

    public MainPresenter(MainDataSource repository) {
        checkNotNull(repository, "Repositoy Is Null");
        this.repository = repository;
    }

    @Override
    public void setActivityView(MainContract.ActivityView activityView) {
        checkNotNull(activityView, "Activity Is Null");
        this.activityView = activityView;
    }

    @Override
    public void start() {

    }
}
