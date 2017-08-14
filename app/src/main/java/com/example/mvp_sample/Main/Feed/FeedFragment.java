package com.example.mvp_sample.Main.Feed;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mvp_sample.Main.Feed.Data.FeedRepositoryImpl;
import com.example.mvp_sample.R;

import butterknife.ButterKnife;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by KiyoungLee on 2017-06-21.
 */

public class FeedFragment extends Fragment implements FeedContract.FragmentView {

    private Context context;
    private FeedContract.Presenter presenter;
    private FeedAdapter adapter;

    public FeedFragment() {
    }

    public FeedFragment(Context context) {
        checkNotNull(context, "Context Is Null");
        this.context = context;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.feed_frag, container, false);
        ButterKnife.bind(getActivity());

        adapter = new FeedAdapter(context);

        presenter = new FeedPresenterImpl(new FeedRepositoryImpl());
        presenter.setFragmentView(this);

        return view;
    }

    @Override
    public void setPresenter(FeedContract.Presenter presenter) {

    }
}
