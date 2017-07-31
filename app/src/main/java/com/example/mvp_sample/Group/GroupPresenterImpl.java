package com.example.mvp_sample.Group;

import com.example.mvp_sample.Group.Data.GroupRepository;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by mapssi on 24/07/2017.
 */

public class GroupPresenterImpl implements GroupContract.Presenter {

    private GroupRepository repository;
    private GroupContract.ActivityView activityView;

    //Unit Test: constructor_Test(), constructor_Null_Test()
    public GroupPresenterImpl(GroupRepository repository) {
        checkNotNull(repository, "Repository Is Null");
        this.repository = repository;
    }

    //Unit Test: setActivityView_Test(), setActivityView_Null_Test()
    public void setActivityView(GroupContract.ActivityView activityView) {
        checkNotNull(activityView, "ActivityView Is Null");
        this.activityView = activityView;
    }

    @Override
    public void start() {

    }
}
