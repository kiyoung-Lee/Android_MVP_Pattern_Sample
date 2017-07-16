package com.example.mvp_sample.Main.Data;

import com.example.mvp_sample.Main.Chat.Data.ChatData;

import java.util.List;

/**
 * Created by kiyoung Lee on 2017-05-20.
 */

public interface MainRepository {

    interface LoadListCallBack{
        void onListLoaded(List<MainData> dataList);

        void onDataNotAvailable();
    }

    void getDataList(LoadListCallBack callBack);
}
