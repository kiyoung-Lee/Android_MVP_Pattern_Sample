package com.example.mvp_sample.Feed;

import static com.google.common.base.Preconditions.checkNotNull;

import com.example.mvp_sample.Feed.Data.FeedRepositoy;

/**
 * Created by KiyoungLee on 2017-06-21.
 */

public class FeedPresenterImpl implements FeedContract.Presenter {

    private FeedRepositoy repository;
    private FeedContract.ActivityView activityView;

    public FeedPresenterImpl(FeedRepositoy repository) {
        checkNotNull(repository, "Repository Is Null");
        this.repository = repository;
    }

    public void setActivityView(FeedContract.ActivityView activityView) {
        checkNotNull(activityView, "ActivityView Is Null");
        this.activityView = activityView;
    }

    @Override
    public void start() {

    }
}
