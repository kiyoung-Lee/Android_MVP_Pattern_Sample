package com.example.mvp_sample.Main.MyPage;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mvp_sample.Main.MainContract;
import com.example.mvp_sample.Main.MyPage.Data.MyPageRepositoryImpl;
import com.example.mvp_sample.R;
import com.nhn.android.maps.NMapContext;
import com.nhn.android.maps.NMapView;

import butterknife.ButterKnife;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by KiyoungLee on 2017-07-08.
 */

public class MyPageFragment extends Fragment implements MyPageContract.FragmentView {

    private Context context;
    private MyPageContract.Presenter presenter;
    private MainContract.Presenter mainPresenter;

    public MyPageFragment(){

    }

    public MyPageFragment(Context context) {
        checkNotNull(context, "Context Is Null");
        this.context = context;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.mypage_frag, container, false);
        ButterKnife.bind(this, view);

        presenter = new MyPagePresenterImpl(new MyPageRepositoryImpl());
        presenter.setFragmentView(this);
        mainPresenter.setMyPagePresenter(presenter);
        return view;
    }

    public void setMainPresenter(MainContract.Presenter mainPresenter) {
        checkNotNull(mainPresenter, "MainPresenter Is Null");
        this.mainPresenter = mainPresenter;
    }
}
