package com.example.mvp_sample.Main.Feed;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mvp_sample.Main.Feed.Data.FeedRepositoryImpl;
import com.example.mvp_sample.R;

/**
 * Created by KiyoungLee on 2017-06-21.
 */

public class FeedFragment extends Fragment implements FeedContract.FragmentView {

    private FeedContract.Presenter presenter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {

        presenter = new FeedPresenterImpl(new FeedRepositoryImpl());
        presenter.setFragmentView(this);

        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void setPresenter(FeedContract.Presenter presenter) {

    }
}
