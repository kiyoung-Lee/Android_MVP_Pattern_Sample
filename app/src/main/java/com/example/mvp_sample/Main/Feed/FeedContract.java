package com.example.mvp_sample.Main.Feed;

import com.example.mvp_sample.Common.BaseAdapterContract;
import com.example.mvp_sample.Common.BasePresenter;
import com.example.mvp_sample.Common.BaseView;
import com.example.mvp_sample.Main.Feed.Data.FeedData;
import com.example.mvp_sample.Main.MainContract;

import java.util.List;

/**
 * Created by KiyoungLee on 2017-06-21.
 */

public interface FeedContract {

    interface FragmentView extends BaseView<Presenter> {
        void setMainPresenter(MainContract.Presenter mainPresenter);
    }

    interface Presenter extends BasePresenter {

        void setFragmentView(FragmentView fragmentView);

        void setFeedAdapterModel(BaseAdapterContract.Model<List<FeedData>> feedAdapterModel);

        void setFeedAdapterView(BaseAdapterContract.View feedAdapterView);
    }
}
