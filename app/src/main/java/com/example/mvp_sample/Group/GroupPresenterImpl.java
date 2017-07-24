package com.example.mvp_sample.Group;

import com.example.mvp_sample.Group.Data.GroupRepository;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by mapssi on 24/07/2017.
 */

public class GroupPresenterImpl implements GroupContract.Presenter {

    private GroupRepository repository;
    private GroupContract.ActivityView activityView;

    public GroupPresenterImpl(GroupRepository repository) {
        checkNotNull(repository, "Repository Is Null");
        this.repository = repository;
    }

    public void setActivityView(GroupContract.ActivityView activityView) {
        checkNotNull(activityView, "ActivityView Is Null");
        this.activityView = activityView;
    }

    @Override
    public void start() {

    }
}
