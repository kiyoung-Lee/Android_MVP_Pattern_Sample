package com.example.mvp_sample.Main.Feed;

import com.example.mvp_sample.Common.BaseAdapterContract;
import com.example.mvp_sample.Main.Feed.Data.FeedRepositoryImpl;
import com.example.mvp_sample.Main.Feed.Data.FeedRepositoy;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

/**
 * Created by kiyoungLee on 2018-01-17.
 */
public class FeedPresenterImplTest {
    @Test
    public void constructor_Test(){
        FeedRepositoy dataSource = mock(FeedRepositoryImpl.class);
        FeedContract.Presenter presenter = new FeedPresenterImpl(dataSource);
    }

    @Test
    public void setFragmentView_Test(){
        FeedRepositoy dataSource = mock(FeedRepositoryImpl.class);
        FeedContract.Presenter presenter = new FeedPresenterImpl(dataSource);
        FeedContract.FragmentView fragmentView = mock(FeedFragment.class);
        presenter.setFragmentView(fragmentView);
    }

    @Test
    public void setFeedAdapterModel_Test() {
        FeedRepositoy dataSource = mock(FeedRepositoryImpl.class);
        FeedContract.Presenter presenter = new FeedPresenterImpl(dataSource);
        presenter.setFeedAdapterModel(mock(BaseAdapterContract.Model.class));
    }

    @Test
    public void setFeedAdapterView_Test() {
        FeedRepositoy dataSource = mock(FeedRepositoryImpl.class);
        FeedContract.Presenter presenter = new FeedPresenterImpl(dataSource);
        presenter.setFeedAdapterView(mock(BaseAdapterContract.View.class));
    }
}