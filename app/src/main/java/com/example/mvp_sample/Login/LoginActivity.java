package com.example.mvp_sample.Login;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.mvp_sample.Login.Data.LoginRepositoryImpl;
import com.example.mvp_sample.R;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;

import butterknife.ButterKnife;

/**
 * Created by KiyoungLee on 2017-06-21.
 */

public class LoginActivity extends AppCompatActivity implements LoginContract.ActivityView {

    private LoginContract.Presenter presenter;
    private CallbackManager callbackManager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_act);
        ButterKnife.bind(this);

        presenter = new LoginPresenterImpl(new LoginRepositoryImpl());
        presenter.setActivityView(this);

        callbackManager = CallbackManager.Factory.create();
        LoginButton loginButton = (LoginButton) ButterKnife.findById(this, R.id.login_button);
        loginButton.setReadPermissions("email");


        // Callback registration
        loginButton.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {
                // App code
            }

            @Override
            public void onCancel() {
                // App code
            }

            @Override
            public void onError(FacebookException exception) {
                // App code
            }
        });
    }

    @Override
    public void setPresenter(LoginContract.Presenter presenter) {

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        callbackManager.onActivityResult(requestCode, resultCode, data);
    }
}
