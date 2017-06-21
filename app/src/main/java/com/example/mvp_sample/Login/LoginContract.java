package com.example.mvp_sample.Login;

import com.example.mvp_sample.Common.BasePresenter;
import com.example.mvp_sample.Common.BaseView;

/**
 * Created by KiyoungLee on 2017-06-21.
 */

public interface LoginContract {

    interface ActivityView extends BaseView<Presenter> {

    }

    interface Presenter extends BasePresenter {
        void setActivityView(LoginContract.ActivityView activityView);
    }
}
