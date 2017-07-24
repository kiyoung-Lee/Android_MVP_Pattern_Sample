package com.example.mvp_sample.Group;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.mvp_sample.Group.Data.GroupRepositoryImpl;
import com.example.mvp_sample.Main.MainContract;

/**
 * Created by mapssi on 24/07/2017.
 */

public class GroupActivity extends AppCompatActivity implements GroupContract.ActivityView {

    private GroupContract.Presenter presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        presenter = new GroupPresenterImpl(new GroupRepositoryImpl());
        presenter.setActivityView(this);
        presenter.start();
    }

    @Override
    public void setPresenter(MainContract.Presenter presenter) {

    }
}
