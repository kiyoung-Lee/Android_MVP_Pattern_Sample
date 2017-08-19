package com.example.mvp_sample.Main.Map;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;


import com.example.mvp_sample.Main.MainContract;
import com.example.mvp_sample.Main.Map.Data.MapRepositoryImpl;
import com.example.mvp_sample.R;

import net.daum.mf.map.api.MapPoint;
import net.daum.mf.map.api.MapView;
import net.daum.mf.map.common.MapConnectionSettingManager;

import butterknife.BindView;
import butterknife.ButterKnife;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by KiyoungLee on 2017-07-08.
 */

public class MapFragment extends Fragment implements MapContract.FragmentView {

    @BindView(R.id.map_view)
    RelativeLayout mapContainer;

    private Context context;
    private MapContract.Presenter presenter;
    private MainContract.Presenter mainPresenter;

    public MapFragment() {

    }

    public MapFragment(Context context) {
        checkNotNull(context, "Context Is Null");
        this.context = context;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.map_frag, container, false);
        ButterKnife.bind(this, view);

        MapView mapView = new MapView(getActivity());
        mapContainer.addView(mapView);
        mapView.setMapCenterPointAndZoomLevel(MapPoint.mapPointWithGeoCoord(33.41, 126.52), 9, true);

        presenter = new MapPresenterImpl(new MapRepositoryImpl());
        presenter.setFragmentView(this);
        mainPresenter.setMapPresenter(presenter);

        return view;
    }

    @Override
    public void setPresenter(MapContract.Presenter presenter) {

    }

    public void setMainPresenter(MainContract.Presenter mainPresenter) {
        checkNotNull(mainPresenter, "MainPresenter Is Null");
        this.mainPresenter = mainPresenter;
    }
}
