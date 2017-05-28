package com.example.mvp_sample.Main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.mvp_sample.Main.Data.MainRepositoryImp;
import com.example.mvp_sample.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements MainContract.ActivityView {

    @BindView(R.id.main_list)
    RecyclerView mainList;

    private MainContract.Presenter presenter;
    private MainAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        adapter = new MainAdapter(getApplicationContext());
        mainList.setLayoutManager(new LinearLayoutManager(this));
        mainList.setAdapter(adapter);

        presenter = new MainPresenterImp(new MainRepositoryImp());
        presenter.setActivityView(this);
        presenter.setAdapterModel(adapter);
        presenter.setAdapaterView(adapter);
        adapter.setPresenter(presenter);
        presenter.start();
    }

    @Override
    public void setPresenter(MainContract.Presenter presenter) {

    }
}
