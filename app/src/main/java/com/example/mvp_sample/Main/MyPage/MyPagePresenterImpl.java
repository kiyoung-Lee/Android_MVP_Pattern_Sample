package com.example.mvp_sample.Main.MyPage;

import static com.google.common.base.Preconditions.checkNotNull;

import com.example.mvp_sample.Main.MyPage.Data.MyPageRepository;

/**
 * Created by KiyoungLee on 2017-07-08.
 */

public class MyPagePresenterImpl implements MyPageContract.Presenter {

    private MyPageRepository repository;
    private MyPageContract.FragmentView fragmentView;

    //Unit Test: constructor_Test(), constructor_Null_Test()
    public MyPagePresenterImpl(MyPageRepository repository) {
        checkNotNull(repository, "Repository Is Null");
        this.repository = repository;
    }

    //Unit Test: setFragmentView_Test(), setFragmentView_Null_Test()
    public void setFragmentView(MyPageContract.FragmentView fragmentView) {
        checkNotNull(fragmentView, "FragmentView Is Null");
        this.fragmentView = fragmentView;
    }

    @Override
    public void start() {

    }
}
