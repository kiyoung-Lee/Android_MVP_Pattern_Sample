package com.example.mvp_sample.Main;

import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.example.mvp_sample.Common.BackPressClose;
import com.example.mvp_sample.Main.Chat.ChatAdapter;
import com.example.mvp_sample.Main.Data.MainRepositoryImp;
import com.example.mvp_sample.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, MainContract.ActivityView {

    @BindView(R.id.main_tab)
    TabLayout mainTab;
    @BindView(R.id.main_toolbar)
    Toolbar toolbar;
    @BindView(R.id.main_viewpager)
    ViewPager mainPager;
    @BindView(R.id.main_nestedscrollview)
    NestedScrollView nestedScrollView;


    private MainContract.Presenter presenter;
    private MainPagerAdapter mainPagerAdapter;
    private BackPressClose backPressCloseHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_act);
        ButterKnife.bind(this);

        backPressCloseHandler = new BackPressClose(this);
        setSupportActionBar(toolbar);
        nestedScrollView.setFillViewport(true);

        mainTab.addTab(mainTab.newTab().setText("채팅"));
        mainTab.addTab(mainTab.newTab().setText("피드"));
        mainTab.addTab(mainTab.newTab().setText("지도"));
        mainTab.addTab(mainTab.newTab().setText("MY"));
        mainTab.setTabGravity(TabLayout.GRAVITY_FILL);

        mainPagerAdapter = new MainPagerAdapter(getSupportFragmentManager());
        mainPager.setAdapter(mainPagerAdapter);
        mainPager.setCurrentItem(0);

        presenter = new MainPresenterImpl(new MainRepositoryImp());
        presenter.setActivityView(this);
        presenter.start();
    }

    @OnClick(R.id.send_msg)
    public void clickSendMsg(){

    }

    @Override
    public void setPresenter(MainContract.Presenter presenter) {

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            backPressCloseHandler.onBackPressed(getString(R.string.msg_exit));
        }
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
