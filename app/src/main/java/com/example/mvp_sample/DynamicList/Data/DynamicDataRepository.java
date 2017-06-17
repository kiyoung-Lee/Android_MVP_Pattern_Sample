package com.example.mvp_sample.DynamicList.Data;

import java.util.List;

/**
 * Created by KiyoungLee on 2017-06-10.
 */

public interface DynamicDataRepository {

    interface onMessageLoadedCallBack{
        void onMessageListLoaded(DynamicData dynamicData);
    }

    void getDynamicData(onMessageLoadedCallBack callBack);
}
