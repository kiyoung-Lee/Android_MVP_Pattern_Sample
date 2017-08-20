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

    //Unit Test : Constructor_Test(), Constructor_Null_Test()
    public MainPresenterImpl(MainRepository repository) {
        checkNotNull(repository, "Repository Is Null");
        this.repository = repository;
    }

    @Override
    //Unit Test : setActivityView_Test(). setActivityView_Null_Test()
    public void setActivityView(MainContract.ActivityView activityView) {
        checkNotNull(activityView, "Activity Is Null");
        this.activityView = activityView;
    }

    //Unit Test: setChatPresenter_Test(), setChatPresenter_Null_Test()
    public void setChatPresenter(ChatContract.Presenter chatPresenter) {
        checkNotNull(chatPresenter, "ChatPresenter Is Null");
        this.chatPresenter = chatPresenter;
    }

    //Unit Test: setFeedPresenter_Test(), setFeedPresenter_Null_Test()
    public void setFeedPresenter(FeedContract.Presenter feedPresenter) {
        checkNotNull(feedPresenter, "FeedPresenter Is Null");
        this.feedPresenter = feedPresenter;
    }

    //Unit Test: setMapPresenter_Test(), setMapPresenter_Null_Test()
    public void setMapPresenter(MapContract.Presenter mapPresenter) {
        checkNotNull(mapPresenter, "MapPresenter Is Null");
        this.mapPresenter = mapPresenter;
    }

    //Unit Test: setMyPagePresenter_Test(), setMyPagePresenter_Null_Test()
    public void setMyPagePresenter(MyPageContract.Presenter myPagePresenter) {
        checkNotNull(myPagePresenter, "MyPagePresenter Is Null");
        this.myPagePresenter = myPagePresenter;
    }

    @Override
    // Unit Test: start_Test()
    public void start() {

    }
}
