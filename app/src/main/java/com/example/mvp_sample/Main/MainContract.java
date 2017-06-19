package com.example.mvp_sample.Main;

import com.example.mvp_sample.Common.BaseAdapter;
import com.example.mvp_sample.Common.BasePresenter;
import com.example.mvp_sample.Common.BaseView;

/**
 * Created by kiyoung Lee on 2017-05-20.
 */

public interface MainContract {

    interface ActivityView extends BaseView<Presenter> {
        @Override
        void setPresenter(Presenter presenter);
    }

    interface Presenter extends BasePresenter {

        void setActivityView(ActivityView activityView);

        void setAdapterModel(BaseAdapter.Model adapterModel);

        void setAdapaterView(BaseAdapter.View adapaterView);

        @Override
        void start();
    }
}
