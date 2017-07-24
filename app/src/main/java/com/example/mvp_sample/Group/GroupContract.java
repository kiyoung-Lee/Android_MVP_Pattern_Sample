package com.example.mvp_sample.Group;

import com.example.mvp_sample.Common.BasePresenter;
import com.example.mvp_sample.Common.BaseView;
import com.example.mvp_sample.Main.MainContract;

/**
 * Created by mapssi on 24/07/2017.
 */

public interface GroupContract {

    interface ActivityView extends BaseView<MainContract.Presenter> {

    }

    interface Presenter extends BasePresenter {
        void setActivityView(GroupContract.ActivityView activityView);
    }
}
