package com.example.mvp_sample.Main;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.mvp_sample.Main.Chat.ChatFragment;
import com.example.mvp_sample.Main.Feed.FeedFragment;
import com.example.mvp_sample.Main.Map.MapFragment;
import com.example.mvp_sample.Main.MyPage.MyPageFragment;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by KiyoungLee on 2017-07-09.
 */

public class MainPagerAdapter extends FragmentPagerAdapter {

    private Context context;

    public MainPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        checkNotNull(context, "Context Is Null");
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment resultFragment = null;
        switch (position){
            case 0:
                resultFragment = new ChatFragment(context);
                break;
            case 1:
                resultFragment = new FeedFragment(context);
                break;

            case 2:
                resultFragment = new MapFragment(context);
                break;
            case 3:
                resultFragment = new MyPageFragment(context);
                break;
        }
        return resultFragment;
    }

    @Override
    public int getCount() {
        return 4;
    }
}
