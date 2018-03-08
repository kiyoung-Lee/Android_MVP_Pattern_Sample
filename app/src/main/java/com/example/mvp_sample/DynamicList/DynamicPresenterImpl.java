package com.example.mvp_sample.DynamicList;

import static com.google.common.base.Preconditions.checkNotNull;

import com.example.mvp_sample.DynamicList.Data.DynamicDataRepository;
import com.example.mvp_sample.DynamicList.Data.DynamicDataRepositoryImpl;

/**
 * Created by KiyoungLee on 2017-06-10.
 */

public class DynamicPresenterImpl implements DynamicContract.Presenter {

    private DynamicDataRepository repository;
    private DynamicContract.ActivityView activityView;

    //Unit Test:  constructor_Test(), constructor_Null_Test()
    public DynamicPresenterImpl(DynamicDataRepository repository) {
        this.repository = repository;
    }

    //Unit Test: setActivityView_Test(), setActivityView_Null_Test()
    public void setActivityView(DynamicContract.ActivityView activityView) {
        this.activityView = activityView;
    }

    @Override
    public void start() {

    }
}
