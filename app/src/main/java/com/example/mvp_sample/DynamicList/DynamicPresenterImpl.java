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


    public DynamicPresenterImpl(DynamicDataRepository repository) {
        checkNotNull(repository, "Repository Is Null");
        this.repository = repository;
    }

    @Override
    public void start() {

    }
}
