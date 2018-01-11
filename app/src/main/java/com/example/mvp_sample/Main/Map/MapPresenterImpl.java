package com.example.mvp_sample.Main.Map;

import static com.google.common.base.Preconditions.checkNotNull;

import com.example.mvp_sample.Main.Map.Data.MapRepository;

/**
 * Created by KiyoungLee on 2017-07-08.
 */

public class MapPresenterImpl implements MapContract.Presenter {

    private MapRepository repository;
    private MapContract.FragmentView fragmentView;

    public MapPresenterImpl(MapRepository repository) {
        this.repository = repository;
    }

    public void setFragmentView(MapContract.FragmentView fragmentView) {
        this.fragmentView = fragmentView;
    }

    @Override
    public void start() {

    }
}
