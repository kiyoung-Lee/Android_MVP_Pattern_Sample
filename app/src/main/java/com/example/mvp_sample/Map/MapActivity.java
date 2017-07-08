package com.example.mvp_sample.Map;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.mvp_sample.R;

/**
 * Created by KiyoungLee on 2017-07-08.
 */

public class MapActivity extends AppCompatActivity implements MapContract.ActivityView {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map_act);
    }

    @Override
    public void setPresenter(MapContract.Presenter presenter) {

    }
}
