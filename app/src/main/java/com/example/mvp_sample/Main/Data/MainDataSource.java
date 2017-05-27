package com.example.mvp_sample.Main.Data;

import java.util.List;

/**
 * Created by kiyoung Lee on 2017-05-20.
 */

public interface MainDataSource {

    interface LoadListCallBack{
        void onListLoaded(List<MainData> alramList);

        void onDataNotAvailable();
    }

    void getList(LoadListCallBack callBack);
}
