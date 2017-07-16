package com.example.mvp_sample.Main;

import com.example.mvp_sample.Common.BaseAdapterContract;
import com.example.mvp_sample.Main.Chat.Data.ChatData;
import com.example.mvp_sample.Main.Data.MainRepository;
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

    @Override
    public void start() {

    }
}
