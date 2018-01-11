package com.example.mvp_sample.Main.Map;

import com.example.mvp_sample.Common.BasePresenter;
import com.example.mvp_sample.Common.BaseView;
import com.example.mvp_sample.Main.MainContract;

/**
 * Created by KiyoungLee on 2017-07-08.
 */

public interface MapContract {

    interface FragmentView {

    }

    interface Presenter extends BasePresenter{
        @Override
        void start();

        void setFragmentView(MapContract.FragmentView fragmentView);    }
}
