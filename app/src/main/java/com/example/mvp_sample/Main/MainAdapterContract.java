package com.example.mvp_sample.Main;

import com.example.mvp_sample.IBaseView;
import com.example.mvp_sample.Main.Data.MainData;

import java.util.List;

/**
 * Created by kiyoung Lee on 2017-05-27.
 */

public interface MainAdapterContract {

    interface Model<T> {
        void dataClear();

        void replaceData(T data);
    }

    interface View extends IBaseView<MainContract.Presenter> {
        void notifyAdapter();
    }
}
