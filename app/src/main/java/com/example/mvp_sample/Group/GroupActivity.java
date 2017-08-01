package com.example.mvp_sample.Group;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.mvp_sample.Group.Data.GroupRepositoryImpl;
import com.example.mvp_sample.Main.MainContract;
import com.example.mvp_sample.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by mapssi on 24/07/2017.
 */

public class GroupActivity extends AppCompatActivity implements GroupContract.ActivityView {

    @BindView(R.id.recyclerView)
    RecyclerView groupGridView;

    private GroupContract.Presenter presenter;
    private GroupAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.group_act);
        ButterKnife.bind(this);

        adapter = new GroupAdapter(getApplicationContext());
        GridLayoutManager manager = new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false);
        groupGridView.setLayoutManager(manager);
        groupGridView.setAdapter(adapter);

        presenter = new GroupPresenterImpl(new GroupRepositoryImpl());
        presenter.setActivityView(this);
        presenter.setAdapterModel(adapter);
        presenter.setAdapterView(adapter);
        presenter.start();
    }

    @Override
    public void setPresenter(MainContract.Presenter presenter) {

    }
}
