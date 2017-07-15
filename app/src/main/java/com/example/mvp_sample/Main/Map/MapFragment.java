package com.example.mvp_sample.Main.Map;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.mvp_sample.R;

import butterknife.ButterKnife;

/**
 * Created by KiyoungLee on 2017-07-08.
 */

public class MapFragment extends Fragment implements MapContract.FragmentView {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.map_frag, container, false);
        ButterKnife.bind(getActivity());
        return view;
    }

    @Override
    public void setPresenter(MapContract.Presenter presenter) {

    }
}
