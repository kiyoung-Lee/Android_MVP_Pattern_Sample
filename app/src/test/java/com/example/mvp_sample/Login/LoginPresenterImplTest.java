package com.example.mvp_sample.Login;

import com.example.mvp_sample.Login.Data.LoginRepository;
import com.example.mvp_sample.Login.Data.LoginRepositoryImpl;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

/**
 * Created by kiyoungLee on 2018-01-17.
 */
public class LoginPresenterImplTest {

    @Test
    public void constructor_Test(){
        LoginRepository dataSource = mock(LoginRepositoryImpl.class);
        LoginContract.Presenter presenter = new LoginPresenterImpl(dataSource);
    }

    @Test
    public void setActivityView_Test(){
        LoginRepository dataSource = mock(LoginRepositoryImpl.class);
        LoginContract.Presenter presenter = new LoginPresenterImpl(dataSource);
        LoginContract.ActivityView ActivityView = mock(LoginActivity.class);
        presenter.setActivityView(ActivityView);
    }

}