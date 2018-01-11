package com.example.mvp_sample.Main.MyPage;

import com.example.mvp_sample.Main.MyPage.Data.MyPageRepository;
import com.example.mvp_sample.Main.MyPage.Data.MyPageRepositoryImpl;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

/**
 * Created by kiyoungLee on 2018-01-11.
 */
public class MyPagePresenterImplTest {
    @Test
    public void constructor_Test(){
        MyPageRepository dataSource = mock(MyPageRepositoryImpl.class);
        MyPageContract.Presenter presenter = new MyPagePresenterImpl(dataSource);
    }

    @Test
    public void setFragmentView_Test(){
        MyPageRepository dataSource = mock(MyPageRepositoryImpl.class);
        MyPageContract.Presenter presenter = new MyPagePresenterImpl(dataSource);
        MyPageContract.FragmentView fragmentView = mock(MyPageFragment.class);
        presenter.setFragmentView(fragmentView);
    }


}