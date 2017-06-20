package com.example.mvp_sample.DynamicList.ViewHolder;

import android.content.Context;
import android.view.View;

import com.example.mvp_sample.Common.BaseRecyclerViewHolder;
import com.example.mvp_sample.DynamicList.Data.Message;
import com.example.mvp_sample.DynamicList.DynamicContract;

/**
 * Created by KiyoungLee on 2017-06-10.
 */


public class LeftViewHolder extends BaseRecyclerViewHolder<Message, DynamicContract.Presenter> {

    public LeftViewHolder(Context context, View itemView) {
        super(context, itemView);
    }

    @Override
    public void bind(Message messageData) {

    }
}
