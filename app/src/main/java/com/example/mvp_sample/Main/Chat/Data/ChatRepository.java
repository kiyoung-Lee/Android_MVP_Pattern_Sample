package com.example.mvp_sample.Main.Chat.Data;

import com.example.mvp_sample.Main.Data.MainData;
import com.example.mvp_sample.Main.Data.MainRepository;

import java.util.List;

/**
 * Created by KiyoungLee on 2017-07-09.
 */

public interface ChatRepository {

    interface ChatListLoadCallBack{
        void onChatListLoaded(List<ChatData> chatList);
    }

    void addChatData(ChatData addItem, ChatListLoadCallBack callBack);
}
