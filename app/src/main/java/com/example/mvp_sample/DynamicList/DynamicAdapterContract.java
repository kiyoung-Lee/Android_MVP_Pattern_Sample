package com.example.mvp_sample.DynamicList;

import com.example.mvp_sample.IBaseView;

/**
 * Created by KiyoungLee on 2017-06-10.
 */

public interface DynamicAdapterContract {

    interface View extends IBaseView<DynamicContract.Presenter>{
        void notifyAdapter();
    }

    interface Model<T>{
        void replaceData(T data);
    }
}
