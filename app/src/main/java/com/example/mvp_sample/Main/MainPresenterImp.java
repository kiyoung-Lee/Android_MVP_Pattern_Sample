package com.example.mvp_sample.Main;

import com.example.mvp_sample.Main.Data.MainData;
import com.example.mvp_sample.Main.Data.MainDataSource;

import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by kiyoung Lee on 2017-05-20.
 */

public class MainPresenterImp implements MainContract.Presenter {

    private MainDataSource repository;
    private MainContract.ActivityView activityView;
    private MainAdapterContract.Model adapterModel;
    private MainAdapterContract.View adapterView;

    public MainPresenterImp(MainDataSource repository) {
        checkNotNull(repository, "Repository Is Null");
        this.repository = repository;
    }

    @Override
    public void setActivityView(MainContract.ActivityView activityView) {
        checkNotNull(activityView, "Activity Is Null");
        this.activityView = activityView;
    }

    @Override
    public void setAdapterModel(MainAdapterContract.Model adapterModel) {
        checkNotNull(adapterModel, "AdapterModel Is Null");
        this.adapterModel = adapterModel;
    }

    @Override
    public void setAdapaterView(MainAdapterContract.View adapaterView) {
        checkNotNull(adapaterView, "AdapterView Is Null");
        this.adapterView = adapaterView;
    }

    @Override
    public void start() {
        repository.getList(new MainDataSource.LoadListCallBack() {
            @Override
            public void onListLoaded(List<MainData> alramList) {
                checkNotNull(adapterModel, "AdapterModel Is Null");
                checkNotNull(adapterView, "AdapterView Is Null");
                adapterModel.replaceData(alramList);
                adapterView.notifyAdapter();
            }

            @Override
            public void onDataNotAvailable() {

            }
        });
    }
}
