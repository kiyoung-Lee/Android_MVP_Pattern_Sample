package com.example.mvp_sample.Main.Feed.ViewHolder;

import android.content.Context;
import android.view.View;

import com.example.mvp_sample.Common.BaseRecyclerViewHolder;
import com.example.mvp_sample.R;

/**
 * Created by kiyoungLee on 2017-08-26.
 */

public class FeedHolderFactory {

    private static final int DEFAULT_VIEW_TYPE = 0;


    public static int getViewLayoutId(int viewType){
        int resId = -1;

        if(viewType == DEFAULT_VIEW_TYPE){
            return resId = R.layout.feed_default_holder;
        }

        return resId;
    }

    public static BaseRecyclerViewHolder getViewHolder(int viewType, Context context, View itemView){
        BaseRecyclerViewHolder holder = null;

        if(viewType == DEFAULT_VIEW_TYPE){
            holder = new DefaultFeedHolder(context,itemView);
        }

        return holder;
    }
}
