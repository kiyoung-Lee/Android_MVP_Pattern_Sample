package com.example.mvp_sample.Main.MyPage;

import static com.google.common.base.Preconditions.checkNotNull;

import com.example.mvp_sample.Main.MyPage.Data.MyPageRepository;

/**
 * Created by KiyoungLee on 2017-07-08.
 */

public class MyPagePresenterImpl implements MyPageContract.Presenter {

    private MyPageRepository repository;
    private MyPageContract.FragmentView fragmentView;

    public MyPagePresenterImpl(MyPageRepository repository) {
        this.repository = repository;
    }

    public void setFragmentView(MyPageContract.FragmentView fragmentView) {
        this.fragmentView = fragmentView;
    }

    @Override
    public void start() {

    }
}
