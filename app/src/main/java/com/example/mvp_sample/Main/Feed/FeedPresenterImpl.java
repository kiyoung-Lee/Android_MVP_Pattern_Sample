package com.example.mvp_sample.Main.Feed;

import static com.google.common.base.Preconditions.checkNotNull;

import com.example.mvp_sample.Main.Feed.Data.FeedRepositoy;

/**
 * Created by KiyoungLee on 2017-06-21.
 */

public class FeedPresenterImpl implements FeedContract.Presenter {

    private FeedRepositoy repository;
    private FeedContract.FragmentView fragmentView;

    public FeedPresenterImpl(FeedRepositoy repository) {
        checkNotNull(repository, "Repository Is Null");
        this.repository = repository;
    }

    public void setFragmentView(FeedContract.FragmentView fragmentView) {
        checkNotNull(fragmentView, "FragmentView Is Null");
        this.fragmentView = fragmentView;
    }

    @Override
    public void start() {

    }
}
