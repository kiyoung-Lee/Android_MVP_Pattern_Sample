package com.example.mvp_sample.Main;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.mvp_sample.Main.Chat.ChatContract;
import com.example.mvp_sample.Main.Chat.ChatFragment;
import com.example.mvp_sample.Main.Feed.FeedContract;
import com.example.mvp_sample.Main.Feed.FeedFragment;
import com.example.mvp_sample.Main.Map.MapContract;
import com.example.mvp_sample.Main.Map.MapFragment;
import com.example.mvp_sample.Main.MyPage.MyPageContract;
import com.example.mvp_sample.Main.MyPage.MyPageFragment;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by KiyoungLee on 2017-07-09.
 */

public class MainPagerAdapter extends FragmentPagerAdapter {

    private Context context;
    private MainContract.Presenter mainPresenter;

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
                ChatContract.FragmentView chatFragment = new ChatFragment(context);
                chatFragment.setMainPresenter(mainPresenter);
                return (Fragment) chatFragment;
            case 1:
                FeedContract.FragmentView feedFragment = new FeedFragment(context);
                feedFragment.setMainPresenter(mainPresenter);
                return (Fragment) feedFragment;

            case 2:
                MapContract.FragmentView mapFragment = new MapFragment(context);
                mapFragment.setMainPresenter(mainPresenter);
                return (Fragment) mapFragment;
            case 3:
                MyPageContract.FragmentView myPageFragment = new MyPageFragment(context);
                myPageFragment.setMainPresenter(mainPresenter);
                return (Fragment) myPageFragment;
        }
        return resultFragment;
    }

    @Override
    public int getCount() {
        return 4;
    }

    public void setMainPresenter(MainContract.Presenter mainPresenter) {
        checkNotNull(mainPresenter, "MainPresenter Is Null");
        this.mainPresenter = mainPresenter;
    }
}
