package com.example.mvp_sample.Login;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.mvp_sample.Login.Data.LoginRepositoryImpl;
import com.example.mvp_sample.R;

/**
 * Created by KiyoungLee on 2017-06-21.
 */

public class LoginActivity extends AppCompatActivity implements LoginContract.ActivityView {

    private LoginContract.Presenter presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_act);

        presenter = new LoginPresenterImpl(new LoginRepositoryImpl());
        presenter.setActivityView(this);                
    }

    @Override
    public void setPresenter(LoginContract.Presenter presenter) {

    }
}
