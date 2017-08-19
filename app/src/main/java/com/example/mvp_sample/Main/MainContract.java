package com.example.mvp_sample.Main;

import com.example.mvp_sample.Common.BaseAdapterContract;
import com.example.mvp_sample.Common.BasePresenter;
import com.example.mvp_sample.Common.BaseView;
import com.example.mvp_sample.Main.Chat.ChatContract;
import com.example.mvp_sample.Main.Feed.FeedContract;
import com.example.mvp_sample.Main.Map.MapContract;
import com.example.mvp_sample.Main.MyPage.MyPageContract;

/**
 * Created by kiyoung Lee on 2017-05-20.
 */

public interface MainContract {

    interface ActivityView extends BaseView<Presenter> {
        @Override
        void setPresenter(Presenter presenter);
    }

    interface Presenter extends BasePresenter {

        void setActivityView(ActivityView activityView);

        void setChatPresenter(ChatContract.Presenter chatPresenter);

        void setFeedPresenter(FeedContract.Presenter feedPresenter);

        void setMapPresenter(MapContract.Presenter mapPresenter);

        void setMyPagePresenter(MyPageContract.Presenter myPagePresenter);

        @Override
        void start();
    }
}
