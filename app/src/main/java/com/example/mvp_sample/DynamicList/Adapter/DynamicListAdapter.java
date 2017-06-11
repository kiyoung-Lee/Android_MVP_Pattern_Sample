package com.example.mvp_sample.DynamicList.Adapter;

import static com.google.common.base.Preconditions.checkNotNull;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.example.mvp_sample.DynamicList.Adapter.ViewHolder.ViewHolderContract;
import com.example.mvp_sample.DynamicList.Data.DynamicData;
import com.example.mvp_sample.DynamicList.DynamicAdapterContract;
import com.example.mvp_sample.DynamicList.DynamicContract;

/**
 * Created by KiyoungLee on 2017-06-10.
 */

public class DynamicListAdapter extends RecyclerView.Adapter<ViewHolderContract>
                                implements DynamicAdapterContract.Model<DynamicData>,
                                            DynamicAdapterContract.View{

    private Context context;
    private DynamicContract.Presenter presenter;
    private DynamicData data;

    public DynamicListAdapter(Context context) {
        checkNotNull(context, "Context Is Null");
        this.context = context;
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    @Override
    public void setPresenter(DynamicContract.Presenter presenter) {
        checkNotNull(presenter, "Presenter Is Null");
        this.presenter = presenter;
    }

    @Override
    public void notifyAdapter() {
        notifyDataSetChanged();
    }

    @Override
    public void replaceData(DynamicData data) {
        checkNotNull(data, "DynamicData Is Null");
        this.data = data;
    }

    @Override
    public ViewHolderContract onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(ViewHolderContract holder, int position) {

    }
}
