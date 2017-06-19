package com.example.mvp_sample.DynamicList;

import com.example.mvp_sample.Common.BasePresenter;
import com.example.mvp_sample.Common.BaseView;

/**
 * Created by KiyoungLee on 2017-06-10.
 */

public interface DynamicContract {

    interface ActivityView extends BaseView<Presenter> {

    }

    interface Presenter extends BasePresenter {

    }
}
