package com.example.mvp_sample.Common;

/**
 * Created by KiyoungLee on 2017-06-19.
 */

public interface BaseAdapter {

    interface View extends BaseView<BasePresenter> {
        void notifyAdapter();
    }

    interface Model<T>{
        void replaceData(T data);
    }
}
