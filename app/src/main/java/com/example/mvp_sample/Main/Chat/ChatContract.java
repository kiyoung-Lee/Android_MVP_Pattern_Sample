package com.example.mvp_sample.Main.Chat;

import com.example.mvp_sample.Common.BaseAdapterContract;
import com.example.mvp_sample.Common.BasePresenter;
import com.example.mvp_sample.Common.BaseView;
import com.example.mvp_sample.Main.Chat.Data.ChatData;

import java.util.List;

/**
 * Created by KiyoungLee on 2017-07-09.
 */

public interface ChatContract {

    interface FragmentView extends BaseView<Presenter> {

    }

    interface Presenter extends BasePresenter{

        void setFragmentView(ChatContract.FragmentView fragmentView);

        void setChatAdapterModel(BaseAdapterContract.Model<List<ChatData>> chatAdapterModel);

        void setChatAdapterView(BaseAdapterContract.View chatAdapterView);

        void sendMessage(String msg);
    }
}
