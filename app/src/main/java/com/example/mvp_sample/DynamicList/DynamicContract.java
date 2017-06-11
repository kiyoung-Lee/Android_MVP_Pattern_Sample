package com.example.mvp_sample.DynamicList;

import com.example.mvp_sample.IBasePresenter;
import com.example.mvp_sample.IBaseView;

/**
 * Created by KiyoungLee on 2017-06-10.
 */

public interface DynamicContract {

    interface ActivityView extends IBaseView<Presenter>{

    }

    interface Presenter extends IBasePresenter{

    }
}
