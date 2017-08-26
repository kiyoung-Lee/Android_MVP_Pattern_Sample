package com.example.mvp_sample.Main.Feed.ViewHolder;

import android.content.Context;
import android.view.View;

import com.example.mvp_sample.Common.BaseRecyclerViewHolder;
import com.example.mvp_sample.Main.Feed.Data.FeedData;
import com.example.mvp_sample.Main.Feed.FeedContract;

/**
 * Created by kiyoungLee on 2017-08-26.
 */

public class DefaultFeedHolder extends BaseRecyclerViewHolder<FeedData, FeedContract.Presenter> {

    public DefaultFeedHolder(Context context, View itemView) {
        super(context, itemView);
    }


}
