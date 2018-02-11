package com.example.mvp_sample.Main.MyPage;

import com.example.mvp_sample.Common.BasePresenter;
import com.example.mvp_sample.Common.BaseView;
import com.example.mvp_sample.Main.MainContract;

/**
 * Created by KiyoungLee on 2017-07-08.
 */

public interface MyPageContract {

    interface FragmentView  {
        void setMainPresenter(MainContract.Presenter mainPresenter);
    }

    interface Presenter extends BasePresenter{
        void setFragmentView(MyPageContract.FragmentView fragmentView);
    }
}
