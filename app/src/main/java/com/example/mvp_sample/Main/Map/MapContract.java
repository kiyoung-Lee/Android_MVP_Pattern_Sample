package com.example.mvp_sample.Main.Map;

import com.example.mvp_sample.Common.BasePresenter;
import com.example.mvp_sample.Common.BaseView;

/**
 * Created by KiyoungLee on 2017-07-08.
 */

public interface MapContract {

    interface FragmentView extends BaseView<Presenter> {

    }

    interface Presenter extends BasePresenter{
        @Override
        void start();

        void setFragmentView(MapContract.FragmentView fragmentView);    }
}
