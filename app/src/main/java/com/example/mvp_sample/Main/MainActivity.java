package com.example.mvp_sample.Main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.mvp_sample.Main.Data.MainDataRepository;
import com.example.mvp_sample.R;

public class MainActivity extends AppCompatActivity implements MainContract.ActivityView {

    MainContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new MainPresenter(new MainDataRepository());
        presenter.setActivityView(this);
    }

    @Override
    public void setPresenter(MainContract.Presenter presenter) {

    }
}
