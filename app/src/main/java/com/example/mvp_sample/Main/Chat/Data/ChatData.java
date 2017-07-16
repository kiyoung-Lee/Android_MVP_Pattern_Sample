package com.example.mvp_sample.Main.Chat.Data;

/**
 * Created by KiyoungLee on 2017-06-24.
 */

public class ChatData {

    private String userName;
    private String message;

    public ChatData() {
    }

    public ChatData(String userName, String message) {
        this.userName = userName;
        this.message = message;
    }

    public String getUserName() {
        return userName;
    }

    public String getMessage() {
        return message;
    }
}
