package com.example.mvp_sample.Main.Chat;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.mvp_sample.Main.Chat.Data.ChatRepositoryImpl;
import com.example.mvp_sample.Main.MainContract;
import com.example.mvp_sample.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by KiyoungLee on 2017-07-09.
 */

public class ChatFragment extends Fragment implements ChatContract.FragmentView {

    @BindView(R.id.chat_list)
    RecyclerView chatList;
    @BindView(R.id.edit_chat)
    EditText editText;

    private Context context;
    private ChatAdapter adapter;
    private ChatContract.Presenter presenter;
    private MainContract.Presenter mainPresenter;

    public ChatFragment() {
    }

    public ChatFragment(Context context) {
        checkNotNull(context, "Context Is Null");
        this.context = context;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.chat_frag, container, false);
        ButterKnife.bind(this, view);

        presenter = new ChatPresenterImpl(new ChatRepositoryImpl());
        presenter.setFragmentView(this);
        mainPresenter.setChatPresenter(presenter);

        chatList.setLayoutManager(new LinearLayoutManager(context));
        adapter = new ChatAdapter(context);
        presenter.setChatAdapterModel(adapter);
        presenter.setChatAdapterView(adapter);

        adapter.setPresenter(presenter);
        chatList.setAdapter(adapter);

        presenter.start();
        return view;
    }

    @Override
    public void setPresenter(ChatContract.Presenter presenter) {

    }

    public void setMainPresenter(MainContract.Presenter mainPresenter) {
        this.mainPresenter = mainPresenter;
    }

    @OnClick(R.id.txt_send)
    public void sendMessage(){
        presenter.sendMessage(editText.getText().toString());
        editText.setText("");
    }
}
