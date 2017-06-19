package com.example.mvp_sample.DynamicList.ViewHolder;

import android.content.Context;
import android.view.View;

import com.example.mvp_sample.R;

/**
 * Created by KiyoungLee on 2017-06-11.
 */

public class DynamicViewHolderFactory {

    private static final int LEFT_VIEW_TYPE = 0;
    private static final int RIGHT_VIEW_TYPE = 1;

    public static int getViewLayoutId(int viewType){
        int resId = -1;

        if(viewType == LEFT_VIEW_TYPE){
            return resId = R.layout.dynamic_left_holder;
        }else if(viewType == RIGHT_VIEW_TYPE){
            return resId = R.layout.dynamic_right_holder;
        }

        return resId;
    }

    public static ViewHolderContract getViewHolder(int viewType, Context context, View itemView){
        ViewHolderContract holder = null;

        if(viewType == LEFT_VIEW_TYPE){
            holder = new LeftViewHolder(context,itemView);
        }else if (viewType == RIGHT_VIEW_TYPE){
            holder = new RightViewholder(context,itemView);
        }

        return holder;
    }

}
