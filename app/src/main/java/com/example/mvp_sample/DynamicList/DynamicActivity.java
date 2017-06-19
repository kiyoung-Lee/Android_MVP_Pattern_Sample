package com.example.mvp_sample.DynamicList;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.mvp_sample.DynamicList.Data.DynamicDataRepositoryImpl;
import com.example.mvp_sample.R;

/**
 * Created by KiyoungLee on 2017-06-10.
 */

public class DynamicActivity extends AppCompatActivity {

    DynamicContract.Presenter presenter;
    DynamicPagerAdapter pagerAdapter;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dynamic_act);

        presenter = new DynamicPresenterImpl(new DynamicDataRepositoryImpl());
    }
}
