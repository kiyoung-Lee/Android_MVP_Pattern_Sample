package com.example.mvp_sample.Group;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.example.mvp_sample.Common.BaseAdapterContract;
import com.example.mvp_sample.Common.BasePresenter;
import com.example.mvp_sample.Common.BaseRecyclerViewHolder;
import com.example.mvp_sample.Group.Data.GroupInfo;

import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by kiyoungLee on 2017-07-31.
 */

public class GroupAdapter extends RecyclerView.Adapter<BaseRecyclerViewHolder>
                            implements BaseAdapterContract.Model<List<GroupInfo>>, BaseAdapterContract.View {

    private Context context;
    private GroupContract.Presenter presenter;
    private List<GroupInfo> groupList;

    public GroupAdapter(Context context) {
        checkNotNull(context, "Context Is Null");
        this.context = context;
    }

    @Override
    public int getItemCount() {
        if (groupList != null){
            return groupList.size();
        }
        return 0;
    }

    @Override
    public void replaceData(List<GroupInfo> data) {
        checkNotNull(data, "GroupList Is Null");
        this.groupList = data;
    }

    @Override
    public void setPresenter(BasePresenter presenter) {
        checkNotNull(presenter, "Presenter Is Null");
        this.presenter = (GroupContract.Presenter) presenter;
    }

    @Override
    public void notifyAdapter() {
        notifyDataSetChanged();
    }

    @Override
    public BaseRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(BaseRecyclerViewHolder holder, int position) {

    }
}
