package com.example.mvp_sample.Main.MyPage;

import com.example.mvp_sample.Common.BasePresenter;
import com.example.mvp_sample.Common.BaseView;

/**
 * Created by KiyoungLee on 2017-07-08.
 */

public interface MyPageContract {

    interface FragmentView extends BaseView<Presenter> {

    }

    interface Presenter extends BasePresenter{

    }
}
