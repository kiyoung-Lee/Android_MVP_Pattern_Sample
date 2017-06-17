package com.example.mvp_sample.DynamicList.Data;

import java.util.List;

/**
 * Created by KiyoungLee on 2017-06-10.
 */

public class DynamicData {

    private final int success;
    private final String message;
    private final List<Message> messageList;

    public DynamicData(int success, String message,
            List<Message> messageList) {
        this.success = success;
        this.message = message;
        this.messageList = messageList;
    }

    public int getSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }

    public List<Message> getMessageList() {
        return messageList;
    }
}
