package com.example.mvp_sample.DynamicList.Data;

/**
 * Created by KiyoungLee on 2017-06-17.
 */

public class Message {

    private final int viewType;
    private final String profileUrl;
    private final String date;
    private final String comment;

    public Message(int viewType, String profileUrl, String date, String comment) {
        this.viewType = viewType;
        this.profileUrl = profileUrl;
        this.date = date;
        this.comment = comment;
    }

    public int getViewType() {
        return viewType;
    }

    public String getProfileUrl() {
        return profileUrl;
    }

    public String getDate() {
        return date;
    }

    public String getComment() {
        return comment;
    }
}
