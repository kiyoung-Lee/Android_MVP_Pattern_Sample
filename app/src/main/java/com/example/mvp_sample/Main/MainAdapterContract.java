package com.example.mvp_sample.Main;

import com.example.mvp_sample.Common.BaseView;

/**
 * Created by kiyoung Lee on 2017-05-27.
 */

public interface MainAdapterContract {

    interface Model<T> {
        void dataClear();

        void replaceData(T data);
    }

    interface View extends BaseView<MainContract.Presenter> {
        void notifyAdapter();
    }
}
