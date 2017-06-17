package com.example.mvp_sample.DynamicList.Data;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by KiyoungLee on 2017-06-10.
 */

public class DynamicDataRepositoryImpl implements DynamicDataRepository {

    @Override
    public void getDynamicData(onMessageLoadedCallBack callBack) {
        checkNotNull(callBack, "CallBack Is Null");
        DynamicData dynamicData = new DynamicData(1, "Success", getMessageList());
    }

    private List<Message> getMessageList(){
        List<Message> messageList = new ArrayList<>();
        messageList.add(new Message(0, "url", "3/2", "hello?"));
        messageList.add(new Message(1, "url", "3/2", "Hi, Welcome"));
        messageList.add(new Message(0, "url", "3/2", "My name is YoungHee."));
        messageList.add(new Message(1, "url", "3/2", "My name is kuku."));
        messageList.add(new Message(0, "url", "3/2", "My Job is Desinger"));
        messageList.add(new Message(1, "url", "3/2", "I am Engineer"));
        messageList.add(new Message(0, "url", "3/2", "Good to see you"));
        return messageList;
    }
}
