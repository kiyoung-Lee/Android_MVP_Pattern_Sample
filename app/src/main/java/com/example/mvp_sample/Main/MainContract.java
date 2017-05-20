package com.example.mvp_sample.Main;

import com.example.mvp_sample.IBasePresenter;
import com.example.mvp_sample.IBaseView;

/**
 * Created by kiyoung Lee on 2017-05-20.
 */

public interface MainContract {

    interface ActivityView extends IBaseView<Presenter> {
        @Override
        void setPresenter(Presenter presenter);
    }

    interface Presenter extends IBasePresenter {

        void setActivityView(ActivityView activityView);

        @Override
        void start();
    }
}
