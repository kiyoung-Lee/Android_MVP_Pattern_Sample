package com.example.mvp_sample.Main;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.mvp_sample.Main.Chat.ChatFragment;
import com.example.mvp_sample.Main.Feed.FeedFragment;
import com.example.mvp_sample.Main.Map.MapFragment;
import com.example.mvp_sample.Main.MyPage.MyPageFragment;

/**
 * Created by KiyoungLee on 2017-07-09.
 */

public class MainPagerAdapter extends FragmentPagerAdapter {

    public MainPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment resultFragment = null;
        switch (position){
            case 0:
                resultFragment = new ChatFragment();
                break;
            case 1:
                resultFragment = new FeedFragment();
                break;

            case 2:
                resultFragment = new MapFragment();
                break;
            case 3:
                resultFragment = new MyPageFragment();
                break;
        }
        return resultFragment;
    }

    @Override
    public int getCount() {
        return 4;
    }
}
