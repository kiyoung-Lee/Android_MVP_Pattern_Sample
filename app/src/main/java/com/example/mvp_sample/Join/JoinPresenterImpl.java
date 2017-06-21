package com.example.mvp_sample.Join;

import static com.google.common.base.Preconditions.checkNotNull;

import com.example.mvp_sample.Join.Data.JoinRepositoy;

/**
 * Created by KiyoungLee on 2017-06-21.
 */

public class JoinPresenterImpl implements JoinContract.Presenter {

    private JoinRepositoy repository;
    private JoinContract.ActivityView activityView;

    public JoinPresenterImpl(JoinRepositoy repository) {
        checkNotNull(repository, "Repository Is Null");
        this.repository = repository;
    }

    public void setActivityView(JoinContract.ActivityView activityView) {
        checkNotNull(activityView, "ActivityView Is Null");
        this.activityView = activityView;
    }

    @Override
    public void start() {

    }
}
