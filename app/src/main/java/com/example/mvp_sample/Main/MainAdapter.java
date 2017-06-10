package com.example.mvp_sample.Main;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mvp_sample.Main.Data.MainData;
import com.example.mvp_sample.R;

import java.util.List;

import butterknife.ButterKnife;
import de.hdodenhof.circleimageview.CircleImageView;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by kiyoung Lee on 2017-05-27.
 */

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainListViewHolder>
                            implements MainAdapterContract.Model<List<MainData>>, MainAdapterContract.View{

    private Context context;
    private MainContract.Presenter presenter;
    private List<MainData> alramList;

    //UI Test: constructor_Null_Test()
    public MainAdapter(Context context) {
        checkNotNull(context, "Context Is Null");
        this.context = context;
    }

    @Override
    public int getItemCount() {
        if(alramList != null)
            return alramList.size();
        else
            return 0;
    }

    @Override
    //UI Test: setPresenter_Test(), setPresenter_Null_Test()
    public void setPresenter(MainContract.Presenter presenter) {
        checkNotNull(presenter, "Presenter Is Null");
        this.presenter = presenter;
    }

    @Override
    //UI Test: dataClear_Test(), dataClear_Null_Test()
    public void dataClear() {
        checkNotNull(alramList, "AlramList Is Null");
        alramList.clear();
    }

    @Override
    //UI Test : replaceData_Test(), replaceData_Null_Test()
    public void replaceData(List<MainData> alramList) {
        checkNotNull(alramList, "AlramList Is Null");
        this.alramList = alramList;
    }

    @Override
    //UI Test: notifyAdapter_Test()
    public void notifyAdapter() {
        notifyDataSetChanged();
    }

    @Override
    public MainListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.main_list_holder, parent, false);
        return new MainListViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MainListViewHolder holder, int position) {
        checkNotNull(alramList, "AlramList Is Null");
        if(alramList.size() > 0){
            MainData alramData = alramList.get(position);
            holder.txtComment.setText(alramData.getMsg());
            holder.txtTime.setText(alramData.getDate());
        }
    }

    public class MainListViewHolder extends RecyclerView.ViewHolder{

        TextView txtComment;
        TextView txtTime;
        CircleImageView imgProfile;

        public MainListViewHolder(View itemView) {
            super(itemView);
            this.txtComment = ButterKnife.findById(itemView, R.id.txt_content);
            this.txtTime = ButterKnife.findById(itemView, R.id.txt_newsDate);
            this.imgProfile = ButterKnife.findById(itemView, R.id.img_userprofile);
        }
    }
}
