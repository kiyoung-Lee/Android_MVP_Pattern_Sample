package com.example.mvp_sample.Main.Chat;

import com.example.mvp_sample.Common.BasePresenter;
import com.example.mvp_sample.Common.BaseView;

/**
 * Created by KiyoungLee on 2017-07-09.
 */

public interface ChatContract {

    interface FragmentView extends BaseView<Presenter> {

    }

    interface Presenter extends BasePresenter{

    }
}
