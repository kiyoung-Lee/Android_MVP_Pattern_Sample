package com.example.mvp_sample.Map;

import static com.google.common.base.Preconditions.checkNotNull;

import com.example.mvp_sample.Map.Data.MapRepository;

/**
 * Created by KiyoungLee on 2017-07-08.
 */

public class MapPresenter implements MapContract.Presenter {

    private MapRepository repository;
    private MapContract.ActivityView activityView;

    public MapPresenter(MapRepository repository) {
        checkNotNull(repository, "Repository Is Null");
        this.repository = repository;
    }

    public void setActivityView(MapContract.ActivityView activityView) {
        checkNotNull(activityView, "ActivityView Is Null");
        this.activityView = activityView;
    }

    @Override
    public void start() {

    }
}
