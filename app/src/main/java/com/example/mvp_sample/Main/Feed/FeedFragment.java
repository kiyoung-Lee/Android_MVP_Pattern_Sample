package com.example.mvp_sample.Main.Feed;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mvp_sample.Main.Feed.Data.FeedRepositoryImpl;
import com.example.mvp_sample.Main.MainContract;
import com.example.mvp_sample.R;

import butterknife.BindView;
import butterknife.ButterKnife;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by KiyoungLee on 2017-06-21.
 */

public class FeedFragment extends Fragment implements FeedContract.FragmentView {

    @BindView(R.id.feed_list)
    RecyclerView feedList;

    private Context context;
    private FeedAdapter adapter;
    private FeedContract.Presenter presenter;
    private MainContract.Presenter mainPresenter;

    public FeedFragment() {
    }

    @SuppressLint("ValidFragment")
    public FeedFragment(Context context) {
        this.context = context;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.feed_frag, container, false);
        ButterKnife.bind(this, view);

        adapter = new FeedAdapter(context);
        feedList.setLayoutManager(new LinearLayoutManager(context));
        feedList.setAdapter(adapter);

        presenter = new FeedPresenterImpl(new FeedRepositoryImpl());
        presenter.setFragmentView(this);
        mainPresenter.setFeedPresenter(presenter);

        presenter.setFeedAdapterModel(adapter);
        presenter.setFeedAdapterView(adapter);

        return view;
    }

    @Override
    public void setPresenter(FeedContract.Presenter presenter) {

    }

    public void setMainPresenter(MainContract.Presenter mainPresenter) {
        checkNotNull(mainPresenter, "MainPresenter Is Null");
        this.mainPresenter = mainPresenter;
    }
}
