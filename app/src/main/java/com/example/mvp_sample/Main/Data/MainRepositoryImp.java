package com.example.mvp_sample.Main.Data;

import java.util.ArrayList;
import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by kiyoung Lee on 2017-05-20.
 */

public class MainRepositoryImp implements MainRepository {

    private List<MainData> mainDataList;

    public MainRepositoryImp() {
    }

    @Override
    //Unit Test: getDataList_Test(), getDataList_Null_Test()
    public void getDataList(LoadListCallBack callBack) {
        checkNotNull(callBack, "CallBack Is Null");
        mainDataList = new ArrayList<>();
        MainData addItem1 = new MainData("test1", "test1", "test1");
        MainData addItem2 = new MainData("test2", "test2", "test2");
        MainData addItem3 = new MainData("test3", "test3",  "test3");
        MainData addItem4 = new MainData("test4", "test4",  "test4");
        MainData addItem5 = new MainData("test5", "test5",  "test5");

        mainDataList.add(addItem1);
        mainDataList.add(addItem2);
        mainDataList.add(addItem3);
        mainDataList.add(addItem4);
        mainDataList.add(addItem5);

        callBack.onListLoaded(mainDataList);
    }
}
