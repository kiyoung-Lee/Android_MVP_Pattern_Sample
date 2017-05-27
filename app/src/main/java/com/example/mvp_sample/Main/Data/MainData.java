package com.example.mvp_sample.Main.Data;

/**
 * Created by kiyoung Lee on 2017-05-27.
 */

public class MainData {

    private final String img_profile;
    private final String msg;
    private final String date;

    public MainData(String img_profile, String msg, String date) {
        this.img_profile = img_profile;
        this.msg = msg;
        this.date = date;
    }

    public String getImg_profile() {
        return img_profile;
    }

    public String getMsg() {
        return msg;
    }

    public String getDate() {
        return date;
    }
}
