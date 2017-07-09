package com.example.mvp_sample.Main.Map;

import static com.google.common.base.Preconditions.checkNotNull;

import com.example.mvp_sample.Main.Map.Data.MapRepository;

/**
 * Created by KiyoungLee on 2017-07-08.
 */

public class MapPresenter implements MapContract.Presenter {

    private MapRepository repository;
    private MapContract.FragmentView fragmentView;

    public MapPresenter(MapRepository repository) {
        checkNotNull(repository, "Repository Is Null");
        this.repository = repository;
    }

    public void setFragmentView(MapContract.FragmentView fragmentView) {
        checkNotNull(fragmentView, "FragmentView Is Null");
        this.fragmentView = fragmentView;
    }

    @Override
    public void start() {

    }
}
