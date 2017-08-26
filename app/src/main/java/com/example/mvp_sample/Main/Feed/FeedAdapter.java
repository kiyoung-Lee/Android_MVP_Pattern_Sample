package com.example.mvp_sample.Main.Feed;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mvp_sample.Common.BaseAdapterContract;
import com.example.mvp_sample.Common.BasePresenter;
import com.example.mvp_sample.Common.BaseRecyclerViewHolder;
import com.example.mvp_sample.Common.BaseView;
import com.example.mvp_sample.Main.Feed.Data.FeedData;
import com.example.mvp_sample.Main.Feed.ViewHolder.FeedHolderFactory;

import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by kiyoungLee on 2017-08-14.
 */

public class FeedAdapter extends RecyclerView.Adapter<BaseRecyclerViewHolder>
                        implements BaseAdapterContract.Model<List<FeedData>>, BaseAdapterContract.View{

    private Context context;
    private FeedContract.Presenter presenter;
    private List<FeedData> feedDataList;

    public FeedAdapter(Context context) {
        checkNotNull(context, "Context Is Null");
        this.context = context;
    }

    @Override
    public int getItemCount() {
        if(feedDataList != null){
            return feedDataList.size();
        }
        return 0;
    }

    @Override
    public void setPresenter(BasePresenter presenter) {
        checkNotNull(presenter, "Presenter Is Null");
        this.presenter = (FeedContract.Presenter) presenter;
    }

    @Override
    public void notifyAdapter() {
        notifyDataSetChanged();
    }

    @Override
    public void replaceData(List<FeedData> data) {
        checkNotNull(data, "FeedDataList Is Null");
        this.feedDataList = data;
    }

    @Override
    public BaseRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        int resId = FeedHolderFactory.getViewLayoutId(viewType);
        View v = LayoutInflater.from(context).inflate(resId, parent);
        BaseRecyclerViewHolder holder = FeedHolderFactory.getViewHolder(viewType, context, v);
        holder.setPresenter(presenter);
        return holder;
    }

    @Override
    public void onBindViewHolder(BaseRecyclerViewHolder holder, int position) {

    }
}
