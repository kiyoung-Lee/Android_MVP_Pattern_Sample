package com.example.mvp_sample.DynamicList.Adapter;

import static com.google.common.base.Preconditions.checkNotNull;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;

/**
 * Created by KiyoungLee on 2017-06-10.
 */

public class DynamicPagerAdapter extends FragmentPagerAdapter {

    private Context context;

    public DynamicPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        checkNotNull(context, "Context Is Null");
        this.context = context;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Fragment getItem(int position) {
        return null;
    }
}
