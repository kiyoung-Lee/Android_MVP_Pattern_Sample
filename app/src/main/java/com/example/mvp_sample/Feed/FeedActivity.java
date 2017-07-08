package com.example.mvp_sample.Feed;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.mvp_sample.Feed.Data.FeedRepositoryImpl;
import com.example.mvp_sample.R;

/**
 * Created by KiyoungLee on 2017-06-21.
 */

public class FeedActivity extends AppCompatActivity implements FeedContract.ActivityView {

    private FeedContract.Presenter presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.feed_act);

        presenter = new FeedPresenterImpl(new FeedRepositoryImpl());
        presenter.setActivityView(this);
    }

    @Override
    public void setPresenter(FeedContract.Presenter presenter) {

    }
}
