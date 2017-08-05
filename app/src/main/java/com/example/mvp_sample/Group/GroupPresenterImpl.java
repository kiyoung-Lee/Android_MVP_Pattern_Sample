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
        checkNotNull(repository, "Repository Is Null");
        this.repository = repository;
    }

    //Unit Test: setActivityView_Test(), setActivityView_Null_Test()
    public void setActivityView(GroupContract.ActivityView activityView) {
        checkNotNull(activityView, "ActivityView Is Null");
        this.activityView = activityView;
    }

    public void setAdapterModel(BaseAdapterContract.Model<List<GroupData>> adapterModel) {
        checkNotNull(adapterModel, "AdapterModel Is Null");
        this.adapterModel = adapterModel;
    }

    public void setAdapterView(BaseAdapterContract.View adapterView) {
        checkNotNull(adapterView, "AdapterView Is Null");
        this.adapterView = adapterView;
    }

    @Override
    public void start() {

    }
}
