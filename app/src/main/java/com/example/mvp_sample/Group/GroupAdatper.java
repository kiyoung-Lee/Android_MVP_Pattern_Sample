package com.example.mvp_sample.Group;

import static com.google.common.base.Preconditions.checkNotNull;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mvp_sample.Common.BaseAdapterContract;
import com.example.mvp_sample.Common.BasePresenter;
import com.example.mvp_sample.Common.BaseRecyclerViewHolder;
import com.example.mvp_sample.Group.Data.GroupData;
import com.example.mvp_sample.R;

import java.util.List;

/**
 * Created by KiyoungLee on 2017-08-05.
 */

public class GroupAdatper extends RecyclerView.Adapter<BaseRecyclerViewHolder>
                            implements BaseAdapterContract.Model<List<GroupData>>, BaseAdapterContract.View{

    private Context context;
    private GroupContract.Presenter presenter;
    private List<GroupData> groupList;

    public GroupAdatper(Context context) {
        this.context = context;
    }

    @Override
    public int getItemCount() {
        if(groupList != null){
            return groupList.size();
        }
        return 0;
    }

    @Override
    public void setPresenter(BasePresenter presenter) {
        this.presenter = (GroupContract.Presenter) presenter;
    }

    @Override
    public void notifyAdapter() {
        notifyDataSetChanged();
    }

    @Override
    public void replaceData(List<GroupData> data) {
        this.groupList = data;
    }

    @Override
    public BaseRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.group_holder_view, parent);
        BaseRecyclerViewHolder holder = new GroupViewHoler(context, v);
        holder.setPresenter(presenter);
        return holder;
    }

    @Override
    public void onBindViewHolder(BaseRecyclerViewHolder holder, int position) {
        holder.bind(groupList.get(position));
    }

    public class GroupViewHoler extends BaseRecyclerViewHolder<GroupData, GroupContract.Presenter>{

        public GroupViewHoler(Context context, View itemView) {
            super(context, itemView);
        }

        @Override
        public void bind(GroupData data) {
            super.bind(data);

        }
    }
}
