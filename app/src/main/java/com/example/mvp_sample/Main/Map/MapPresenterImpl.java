package com.example.mvp_sample.Main.Map;

import static com.google.common.base.Preconditions.checkNotNull;

import com.example.mvp_sample.Main.Map.Data.MapRepository;

/**
 * Created by KiyoungLee on 2017-07-08.
 */

public class MapPresenterImpl implements MapContract.Presenter {

    private MapRepository repository;
    private MapContract.FragmentView fragmentView;

    //Unit Test: constructor_Test(), constructor_Null_Test()
    public MapPresenterImpl(MapRepository repository) {
        checkNotNull(repository, "Repository Is Null");
        this.repository = repository;
    }

    //Unit Test: setFragmentView_Test(), setFragmentView_Null_Test()
    public void setFragmentView(MapContract.FragmentView fragmentView) {
        checkNotNull(fragmentView, "FragmentView Is Null");
        this.fragmentView = fragmentView;
    }

    @Override
    public void start() {

    }
}
