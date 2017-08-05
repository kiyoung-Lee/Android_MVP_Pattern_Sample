package com.example.mvp_sample.Group;

import com.example.mvp_sample.Common.BaseAdapterContract;
import com.example.mvp_sample.Common.BasePresenter;
import com.example.mvp_sample.Common.BaseView;
import com.example.mvp_sample.Group.Data.GroupData;
import com.example.mvp_sample.Group.Data.GroupInfo;
import com.example.mvp_sample.Main.MainContract;

import java.util.List;

/**
 * Created by mapssi on 24/07/2017.
 */

public interface GroupContract {

    interface ActivityView extends BaseView<MainContract.Presenter> {

    }

    interface Presenter extends BasePresenter {
        void setActivityView(GroupContract.ActivityView activityView);

        void setAdapterModel(BaseAdapterContract.Model<List<GroupData>> adapterModel);

        void setAdapterView(BaseAdapterContract.View adapterView);
    }
}
