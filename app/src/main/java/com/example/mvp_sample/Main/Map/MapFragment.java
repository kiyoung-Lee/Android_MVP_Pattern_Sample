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
import com.nhn.android.maps.NMapContext;
import com.nhn.android.maps.NMapView;

import butterknife.BindView;
import butterknife.ButterKnife;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by KiyoungLee on 2017-07-08.
 */

public class MapFragment extends Fragment implements MapContract.FragmentView {

    private Context context;
    private MapContract.Presenter presenter;
    private MainContract.Presenter mainPresenter;

    private NMapContext mMapContext;
    private static final String CLIENT_ID = "Mur1AkWhOxikPmbxQGfY";// 애플리케이션 클라이언트 아이디 값

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

        presenter = new MapPresenterImpl(new MapRepositoryImpl());
        presenter.setFragmentView(this);
        mainPresenter.setMapPresenter(presenter);

        return view;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mMapContext =  new NMapContext(super.getActivity());
        mMapContext.onCreate();
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        NMapView mapView = (NMapView)getView().findViewById(R.id.mapView);
        mapView.setClientId(CLIENT_ID);// 클라이언트 아이디 설정
        mMapContext.setupMapView(mapView);
    }

    @Override
    public void onStart(){
        super.onStart();
        mMapContext.onStart();
    }
    @Override
    public void onResume() {
        super.onResume();
        mMapContext.onResume();
    }
    @Override
    public void onPause() {
        super.onPause();
        mMapContext.onPause();
    }
    @Override
    public void onStop() {
        mMapContext.onStop();
        super.onStop();
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
    @Override
    public void onDestroy() {
        mMapContext.onDestroy();
        super.onDestroy();
    }

    public void setMainPresenter(MainContract.Presenter mainPresenter) {
        this.mainPresenter = mainPresenter;
    }
}
