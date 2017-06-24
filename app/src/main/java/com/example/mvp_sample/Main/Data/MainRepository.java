package com.example.mvp_sample.Main.Data;

import java.util.List;

/**
 * Created by kiyoung Lee on 2017-05-20.
 */

public interface MainRepository {

    interface LoadListCallBack{
        void onListLoaded(List<MainData> dataList);

        void onDataNotAvailable();
    }

    interface ChatListLoadCallBack{
        void onChatListLoaded(List<ChatData> chatList);
    }

    void getDataList(LoadListCallBack callBack);

    void addChatData(ChatData addItem, ChatListLoadCallBack callBack);
}
