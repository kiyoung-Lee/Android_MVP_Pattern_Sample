package com.example.mvp_sample.Main.Chat.Data;

import static com.google.common.base.Preconditions.checkNotNull;

import com.example.mvp_sample.Main.Data.MainRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by KiyoungLee on 2017-07-09.
 */

public class ChatRepositoryImpl implements ChatRepository {

    private List<ChatData> chatList;

    public ChatRepositoryImpl() {
    }

    @Override
    public void addChatData(ChatData addItem, ChatListLoadCallBack callBack) {
        checkNotNull(callBack, "CallBack Is Null");
        if(chatList == null)
            chatList = new ArrayList<>();

        chatList.add(addItem);
        callBack.onChatListLoaded(chatList);
    }
}
