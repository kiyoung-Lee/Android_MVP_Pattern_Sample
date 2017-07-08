package com.example.mvp_sample.MyPage;

import static com.google.common.base.Preconditions.checkNotNull;

import com.example.mvp_sample.MyPage.Data.MyPageRepository;

/**
 * Created by KiyoungLee on 2017-07-08.
 */

public class MyPagePresenter implements MyPageContract.Presenter {

    private MyPageRepository repository;
    private MyPageContract.ActivityView activityView;

    public MyPagePresenter(MyPageRepository repository) {
        checkNotNull(repository, "Repository Is Null");
        this.repository = repository;
    }

    public void setActivityView(MyPageContract.ActivityView activityView) {
        checkNotNull(activityView, "ActivityView Is Null");
        this.activityView = activityView;
    }

    @Override
    public void start() {

    }
}
