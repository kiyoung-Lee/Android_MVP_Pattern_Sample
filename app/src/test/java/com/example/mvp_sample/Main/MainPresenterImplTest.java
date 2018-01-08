package com.example.mvp_sample.Main;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

import com.example.mvp_sample.Main.Chat.ChatContract;
import com.example.mvp_sample.Main.Data.MainRepository;
import com.example.mvp_sample.Main.Data.MainRepositoryImp;
import com.example.mvp_sample.Main.Feed.FeedContract;
import com.example.mvp_sample.Main.Map.MapContract;
import com.example.mvp_sample.Main.MyPage.MyPageContract;

import org.junit.Test;

/**
 * Created by KiyoungLee on 2018-01-08.
 */
public class MainPresenterImplTest {
    @Test
    public void constructor_Test(){
        MainRepository dataSource = mock(MainRepositoryImp.class);
        MainContract.Presenter presenter = new MainPresenterImpl(dataSource);
    }

    @Test
    public void setActivityView_Test(){
        MainRepository dataSource = mock(MainRepositoryImp.class);
        MainContract.Presenter presenter = new MainPresenterImpl(dataSource);
        MainContract.ActivityView ActivityView = mock(MainActivity.class);
        presenter.setActivityView(ActivityView);
    }

    @Test
    public void setChatPresenter_Test() throws Exception {
        MainRepository dataSource = mock(MainRepositoryImp.class);
        MainContract.Presenter presenter = new MainPresenterImpl(dataSource);
        presenter.setChatPresenter(mock(ChatContract.Presenter.class));
    }

    @Test
    public void setFeedPresenter_Test() throws Exception {
        MainRepository dataSource = mock(MainRepositoryImp.class);
        MainContract.Presenter presenter = new MainPresenterImpl(dataSource);
        presenter.setFeedPresenter(mock(FeedContract.Presenter.class));
    }


    @Test
    public void setMapPresenter_Test() throws Exception {
        MainRepository dataSource = mock(MainRepositoryImp.class);
        MainContract.Presenter presenter = new MainPresenterImpl(dataSource);
        presenter.setMapPresenter(mock(MapContract.Presenter.class));
    }

    @Test
    public void setMyPagePresenter_Test() throws Exception {
        MainRepository dataSource = mock(MainRepositoryImp.class);
        MainContract.Presenter presenter = new MainPresenterImpl(dataSource);
        presenter.setMyPagePresenter(mock(MyPageContract.Presenter.class));
    }
}