package com.example.mvp_sample.Main.Chat;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.mvp_sample.Common.BaseAdapterContract;
import com.example.mvp_sample.Common.BasePresenter;
import com.example.mvp_sample.Common.BaseRecyclerViewHolder;
import com.example.mvp_sample.Main.Chat.Data.ChatData;
import com.example.mvp_sample.R;

import java.util.List;

import butterknife.ButterKnife;
import de.hdodenhof.circleimageview.CircleImageView;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by kiyoung Lee on 2017-05-27.
 */

public class ChatAdapter extends RecyclerView.Adapter<BaseRecyclerViewHolder>
                            implements BaseAdapterContract.Model<List<ChatData>>, BaseAdapterContract.View{

    private Context context;
    private ChatContract.Presenter presenter;
    private List<ChatData> chatList;

    //UI Test: constructor_Null_Test()
    public ChatAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getItemCount() {
        if(chatList != null)
            return chatList.size();
        else
            return 0;
    }

    @Override
    //UI Test: setPresenter_Test(), setPresenter_Null_Test()
    public void setPresenter(BasePresenter presenter) {
        this.presenter = (ChatContract.Presenter) presenter;
    }

    @Override
    //UI Test : replaceData_Test(), replaceData_Null_Test()
    public void replaceData(List<ChatData> chatList) {
        this.chatList = chatList;
    }

    @Override
    //UI Test: notifyAdapter_Test()
    public void notifyAdapter() {
        notifyDataSetChanged();
    }

    @Override
    public BaseRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.chat_holder, parent, false);
        BaseRecyclerViewHolder holder = new ChatViewHolder(context, v);
        holder.setPresenter(presenter);
        return holder;
    }

    @Override
    public void onBindViewHolder(BaseRecyclerViewHolder holder, int position) {
        holder.bind(chatList.get(position));
    }

    public class ChatViewHolder extends BaseRecyclerViewHolder<ChatData, ChatContract.Presenter>{

        TextView txtComment;
        TextView txtTime;
        CircleImageView imgProfile;

        public ChatViewHolder(Context context, View itemView) {
            super(context, itemView);
            this.txtComment = ButterKnife.findById(itemView, R.id.txt_content);
            this.txtTime = ButterKnife.findById(itemView, R.id.txt_newsDate);
            this.imgProfile = ButterKnife.findById(itemView, R.id.img_userprofile);
        }

        @Override
        public void bind(ChatData alramData) {
            txtComment.setText(alramData.getMessage());
            txtTime.setText(alramData.getUserName());
        }
    }
}
