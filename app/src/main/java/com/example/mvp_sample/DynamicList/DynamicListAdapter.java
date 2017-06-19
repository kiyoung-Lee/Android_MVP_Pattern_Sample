package com.example.mvp_sample.DynamicList;

import static com.google.common.base.Preconditions.checkNotNull;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mvp_sample.Common.BaseAdapter;
import com.example.mvp_sample.Common.BasePresenter;
import com.example.mvp_sample.DynamicList.ViewHolder.DynamicViewHolderFactory;
import com.example.mvp_sample.DynamicList.ViewHolder.ViewHolderContract;
import com.example.mvp_sample.DynamicList.Data.Message;
import com.example.mvp_sample.DynamicList.DynamicContract;

import java.util.List;

/**
 * Created by KiyoungLee on 2017-06-10.
 */

public class DynamicListAdapter extends RecyclerView.Adapter<ViewHolderContract>
                                implements BaseAdapter.Model<List<Message>>, BaseAdapter.View{

    private Context context;
    private DynamicContract.Presenter presenter;
    private List<Message> messageList;

    public DynamicListAdapter(Context context) {
        checkNotNull(context, "Context Is Null");
        this.context = context;
    }

    @Override
    public int getItemCount() {
        if(messageList != null){
            return messageList.size();
        }
        return 0;
    }

    @Override
    public void setPresenter(BasePresenter presenter) {
        checkNotNull(presenter, "Presenter Is Null");
        this.presenter = (DynamicContract.Presenter) presenter;
    }

    @Override
    public void notifyAdapter() {
        notifyDataSetChanged();
    }

    @Override
    public void replaceData(List<Message> data) {
        checkNotNull(data, "MessageList Is Null");
        this.messageList = data;
    }

    @Override
    public int getItemViewType(int position) {
        checkNotNull(messageList, "MessageList Is Null");
        return messageList.get(position).getViewType();
    }

    @Override
    public ViewHolderContract onCreateViewHolder(ViewGroup parent, int viewType) {
        int resId = DynamicViewHolderFactory.getViewLayoutId(viewType);
        View v = LayoutInflater.from(context).inflate(resId, parent);
        ViewHolderContract holder = DynamicViewHolderFactory.getViewHolder(viewType, context, v);
        holder.setPresenter(presenter);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolderContract holder, int position) {
        holder.bind(messageList.get(position));
    }
}
