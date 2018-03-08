package com.example.mvp_sample.Group;

import com.example.mvp_sample.Common.BaseAdapterContract;
import com.example.mvp_sample.Group.Data.GroupData;
import com.example.mvp_sample.Group.Data.GroupInfo;
import com.example.mvp_sample.Group.Data.GroupRepository;

import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by mapssi on 24/07/2017.
 */

public class GroupPresenterImpl implements GroupContract.Presenter {

    private GroupRepository repository;
    private GroupContract.ActivityView activityView;
    private BaseAdapterContract.Model<List<GroupData>> adapterModel;
    private BaseAdapterContract.View adapterView;

    //Unit Test: constructor_Test(), constructor_Null_Test()
    public GroupPresenterImpl(GroupRepository repository) {
        this.repository = repository;
    }

    //Unit Test: setActivityView_Test(), setActivityView_Null_Test()
    public void setActivityView(GroupContract.ActivityView activityView) {
        this.activityView = activityView;
    }

    //Unit Test: setAdapterModel_Test(), setAdapterModel_Null_Test()
    public void setAdapterModel(BaseAdapterContract.Model<List<GroupData>> adapterModel) {
        this.adapterModel = adapterModel;
    }

    //Unit Test: setAdapterView_Test(), setAdapterView_Null_Test()
    public void setAdapterView(BaseAdapterContract.View adapterView) {
        this.adapterView = adapterView;
    }

    @Override
    //Unit Test: start_Test()
    public void start() {

    }
}
