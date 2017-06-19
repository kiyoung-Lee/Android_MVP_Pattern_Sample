package com.example.mvp_sample.Main;

import com.example.mvp_sample.Common.BaseAdapter;
import com.example.mvp_sample.Main.Data.MainData;
import com.example.mvp_sample.Main.Data.MainRepository;

import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by kiyoung Lee on 2017-05-20.
 */

public class MainPresenterImpl implements MainContract.Presenter {

    private MainRepository repository;
    private MainContract.ActivityView activityView;
    private BaseAdapter.Model adapterModel;
    private BaseAdapter.View adapterView;

    //Unit Test : Constructor_Test(), Constructor_Null_Test()
    public MainPresenterImpl(MainRepository repository) {
        checkNotNull(repository, "Repository Is Null");
        this.repository = repository;
    }

    @Override
    //Unit Test : setActivityView_Test(). setActivityView_Null_Test()
    public void setActivityView(MainContract.ActivityView activityView) {
        checkNotNull(activityView, "Activity Is Null");
        this.activityView = activityView;
    }

    @Override
    //Unit Test: void setAdapterModel_Test(), setAdapterModel_Null_Test()
    public void setAdapterModel(BaseAdapter.Model adapterModel) {
        checkNotNull(adapterModel, "AdapterModel Is Null");
        this.adapterModel = adapterModel;
    }

    @Override
    //Unit Test: setAdapterView_Test(), setAdapterView_Null_Test()
    public void setAdapaterView(BaseAdapter.View adapaterView) {
        checkNotNull(adapaterView, "AdapterView Is Null");
        this.adapterView = adapaterView;
    }

    @Override
    public void start() {
        repository.getDataList(new MainRepository.LoadListCallBack() {
            @Override
            public void onListLoaded(List<MainData> dataList) {
                checkNotNull(adapterModel, "AdapterModel Is Null");
                checkNotNull(adapterView, "AdapterView Is Null");
                adapterModel.replaceData(dataList);
                adapterView.notifyAdapter();
            }

            @Override
            public void onDataNotAvailable() {

            }
        });
    }
}
