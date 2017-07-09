package com.example.mvp_sample.Main.Chat;

import static com.google.common.base.Preconditions.checkNotNull;

import com.example.mvp_sample.Main.Chat.Data.ChatRepository;

/**
 * Created by KiyoungLee on 2017-07-09.
 */

public class ChatPresenter implements ChatContract.Presenter {

    private ChatRepository repository;
    private ChatContract.FragmentView fragmentView;

    public ChatPresenter(ChatRepository repository) {
        checkNotNull(repository, "Repository Is Null");
        this.repository = repository;
    }

    public void setFragmentView(ChatContract.FragmentView fragmentView) {
        checkNotNull(fragmentView, "FragmentView Is Null");
        this.fragmentView = fragmentView;
    }

    @Override
    public void start() {

    }
}
