package com.example.mvp_sample.Main;

import com.example.mvp_sample.Common.BaseAdapterContract;
import com.example.mvp_sample.Main.Chat.ChatContract;
import com.example.mvp_sample.Main.Chat.Data.ChatData;
import com.example.mvp_sample.Main.Data.MainRepository;
import com.example.mvp_sample.Main.Feed.FeedContract;
import com.example.mvp_sample.Main.Map.MapContract;
import com.example.mvp_sample.Main.MyPage.MyPageContract;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by kiyoung Lee on 2017-05-20.
 */

public class MainPresenterImpl implements MainContract.Presenter {

    private MainRepository repository;
    private MainContract.ActivityView activityView;
    private ChatContract.Presenter chatPresenter;
    private FeedContract.Presenter feedPresenter;
    private MapContract.Presenter mapPresenter;
    private MyPageContract.Presenter myPagePresenter;

    public MainPresenterImpl(MainRepository repository) {
        this.repository = repository;
    }

    @Override
    public void setActivityView(MainContract.ActivityView activityView) {
        this.activityView = activityView;
    }

    public void setChatPresenter(ChatContract.Presenter chatPresenter) {
        this.chatPresenter = chatPresenter;
    }

    public void setFeedPresenter(FeedContract.Presenter feedPresenter) {
        this.feedPresenter = feedPresenter;
    }

    public void setMapPresenter(MapContract.Presenter mapPresenter) {
        this.mapPresenter = mapPresenter;
    }

    public void setMyPagePresenter(MyPageContract.Presenter myPagePresenter) {
        this.myPagePresenter = myPagePresenter;
    }
}
