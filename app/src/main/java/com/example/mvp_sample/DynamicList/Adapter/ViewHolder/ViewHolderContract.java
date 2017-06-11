package com.example.mvp_sample.DynamicList.Adapter.ViewHolder;

import static com.google.common.base.Preconditions.checkNotNull;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.mvp_sample.DynamicList.DynamicContract;


/**
 * Created by KiyoungLee on 2017-06-10.
 */

public abstract class ViewHolderContract extends RecyclerView.ViewHolder {

    public Context context;
    public DynamicContract.Presenter presenter;

    public ViewHolderContract(Context context, View itemView) {
        super(itemView);
        checkNotNull(context, "Context Is Null");
        this.context = context;
    }

    public void setPresenter(DynamicContract.Presenter presenter) {
        checkNotNull(presenter, "Presenter Is Null");
        this.presenter = presenter;
    }

}
