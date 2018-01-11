package com.example.mvp_sample.Main.Map;

import com.example.mvp_sample.Main.Map.Data.MapRepository;
import com.example.mvp_sample.Main.Map.Data.MapRepositoryImpl;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

/**
 * Created by kiyoungLee on 2018-01-11.
 */
public class MapPresenterImplTest {
    @Test
    public void constructor_Test(){
        MapRepository dataSource = mock(MapRepositoryImpl.class);
        MapContract.Presenter presenter = new MapPresenterImpl(dataSource);
    }

    @Test
    public void setFragmentView_Test(){
        MapRepository dataSource = mock(MapRepositoryImpl.class);
        MapContract.Presenter presenter = new MapPresenterImpl(dataSource);
        MapContract.FragmentView fragmentView = mock(MapFragment.class);
        presenter.setFragmentView(fragmentView);
    }
}