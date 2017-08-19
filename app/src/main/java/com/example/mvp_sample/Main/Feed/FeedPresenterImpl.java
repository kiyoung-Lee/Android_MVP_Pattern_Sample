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

    //Unit Test: constructor_Test(), constructor_Null_Test()
    public FeedPresenterImpl(FeedRepositoy repository) {
        checkNotNull(repository, "Repository Is Null");
        this.repository = repository;
    }

    //Unit Test: setFragmentView_Test(), setFragmentView_Null_Test()
    public void setFragmentView(FeedContract.FragmentView fragmentView) {
        checkNotNull(fragmentView, "FragmentView Is Null");
        this.fragmentView = fragmentView;
    }

    public void setFeedAdapterModel(BaseAdapterContract.Model<List<FeedData>> feedAdapterModel) {
        checkNotNull(feedAdapterModel, "FeedAdapterModel Is Null");
        this.feedAdapterModel = feedAdapterModel;
    }

    public void setFeedAdapterView(BaseAdapterContract.View feedAdapterView) {
        checkNotNull(feedAdapterView, "FeedAdapterView Is Null");
        this.feedAdapterView = feedAdapterView;
    }

    @Override
    public void start() {

    }
}
