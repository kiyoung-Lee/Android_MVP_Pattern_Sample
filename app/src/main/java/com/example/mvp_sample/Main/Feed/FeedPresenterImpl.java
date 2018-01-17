package com.example.mvp_sample.Main.Feed;

import static com.google.common.base.Preconditions.checkNotNull;

import com.example.mvp_sample.Common.BaseAdapterContract;
import com.example.mvp_sample.Main.Feed.Data.FeedData;
import com.example.mvp_sample.Main.Feed.Data.FeedRepositoy;

import java.util.List;

/**
 * Created by KiyoungLee on 2017-06-21.
 */

public class FeedPresenterImpl implements FeedContract.Presenter {

    private FeedRepositoy repository;
    private FeedContract.FragmentView fragmentView;
    private BaseAdapterContract.Model<List<FeedData>> feedAdapterModel;
    private BaseAdapterContract.View feedAdapterView;

    public FeedPresenterImpl(FeedRepositoy repository) {
        this.repository = repository;
    }

    public void setFragmentView(FeedContract.FragmentView fragmentView) {
        this.fragmentView = fragmentView;
    }

    public void setFeedAdapterModel(BaseAdapterContract.Model<List<FeedData>> feedAdapterModel) {
        this.feedAdapterModel = feedAdapterModel;
    }

    public void setFeedAdapterView(BaseAdapterContract.View feedAdapterView) {
        this.feedAdapterView = feedAdapterView;
    }

    @Override
    public void start() {

    }
}
