package com.example.mvp_sample.Join;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.mvp_sample.Join.Data.JoinRepositoryImpl;
import com.example.mvp_sample.R;

/**
 * Created by KiyoungLee on 2017-06-21.
 */

public class JoinActivity extends AppCompatActivity implements JoinContract.ActivityView {

    private JoinContract.Presenter presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.join_act);

        presenter = new JoinPresenterImpl(new JoinRepositoryImpl());
        presenter.setActivityView(this);
    }

    @Override
    public void setPresenter(JoinContract.Presenter presenter) {

    }
}
