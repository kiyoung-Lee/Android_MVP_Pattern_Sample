package com.example.mvp_sample.FlowController;

import android.content.Context;
import android.content.Intent;

import com.example.mvp_sample.Group.GroupActivity;
import com.example.mvp_sample.Login.LoginActivity;
import com.example.mvp_sample.Main.MainActivity;

/**
 * Created by KiyoungLee on 2018-02-07.
 */

public class FlowController {

    public static void launchGroupActivity(Context context){
        Intent intent = new Intent(context, GroupActivity.class);
        context.startActivity(intent);
    }

    public static void launchLoginActivity(Context context){
        Intent intent = new Intent(context, LoginActivity.class);
        context.startActivity(intent);
    }

    public static void launchMainActivity(Context context){
        Intent intent = new Intent(context, MainActivity.class);
        context.startActivity(intent);
    }
}
