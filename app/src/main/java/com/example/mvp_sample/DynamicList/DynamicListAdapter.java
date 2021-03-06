package com.example.mvp_sample.DynamicList;

import static com.google.common.base.Preconditions.checkNotNull;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mvp_sample.Common.BaseAdapterContract;
import com.example.mvp_sample.Common.BasePresenter;
import com.example.mvp_sample.Common.BaseRecyclerViewHolder;
import com.example.mvp_sample.DynamicList.ViewHolder.DynamicViewHolderFactory;
import com.example.mvp_sample.DynamicList.Data.Message;

import java.util.List;

/**
 * Created by KiyoungLee on 2017-06-10.
 */

public class DynamicListAdapter extends RecyclerView.Adapter<BaseRecyclerViewHolder>
                                implements BaseAdapterContract.Model<List<Message>>, BaseAdapterContract.View{

    private DynamicContract.Presenter presenter;
    private List<Message> messageList;

    @Override
    public int getItemCount() {
        if(messageList != null){
            return messageList.size();
        }
        return 0;
    }

    @Override
    public void setPresenter(BasePresenter presenter) {
        this.presenter = (DynamicContract.Presenter) presenter;
    }

    @Override
    public void notifyAdapter() {
        notifyDataSetChanged();
    }

    @Override
    public void replaceData(List<Message> data) {
        this.messageList = data;
    }

    @Override
    public int getItemViewType(int position) {
        return messageList.get(position).getViewType();
    }

    @Override
    public BaseRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        int resId = DynamicViewHolderFactory.getViewLayoutId(viewType);
        View v = LayoutInflater.from(parent.getContext()).inflate(resId, parent);
        BaseRecyclerViewHolder holder = DynamicViewHolderFactory.getViewHolder(viewType, parent.getContext(), v);
        holder.setPresenter(presenter);
        return holder;
    }

    @Override
    public void onBindViewHolder(BaseRecyclerViewHolder holder, int position) {
        holder.bind(messageList.get(position));
    }
}
