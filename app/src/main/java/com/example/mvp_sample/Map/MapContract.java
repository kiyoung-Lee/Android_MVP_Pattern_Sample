package com.example.mvp_sample.Map;

import com.example.mvp_sample.Common.BasePresenter;
import com.example.mvp_sample.Common.BaseView;

/**
 * Created by KiyoungLee on 2017-07-08.
 */

public interface MapContract {

    interface ActivityView extends BaseView<Presenter> {

    }

    interface Presenter extends BasePresenter{
        @Override
        void start();
    }
}
