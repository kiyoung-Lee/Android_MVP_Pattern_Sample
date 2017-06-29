package com.example.mvp_sample.Main;

import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

import com.example.mvp_sample.Common.BackPressClose;
import com.example.mvp_sample.Main.Data.MainRepositoryImp;
import com.example.mvp_sample.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, MainContract.ActivityView {

//    @BindView(R.id.main_list)
//    RecyclerView mainList;
//    @BindView(R.id.edit_chat)
//    EditText editText;
    @BindView(R.id.main_tab)
    TabLayout mainTab;
    @BindView(R.id.main_toolbar)
    Toolbar toolbar;



    private MainContract.Presenter presenter;
    private MainAdapter adapter;
    private BackPressClose backPressCloseHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_act);
        ButterKnife.bind(this);

        backPressCloseHandler = new BackPressClose(this);
        setSupportActionBar(toolbar);

        mainTab.addTab(mainTab.newTab().setText("채팅"));
        mainTab.addTab(mainTab.newTab().setText("피드"));
        mainTab.addTab(mainTab.newTab().setText("지도"));
        mainTab.addTab(mainTab.newTab().setText("MY"));
        mainTab.setTabGravity(TabLayout.GRAVITY_FILL);

        adapter = new MainAdapter(getApplicationContext());
//        mainList.setLayoutManager(new LinearLayoutManager(this));
//        mainList.setAdapter(adapter);

        presenter = new MainPresenterImpl(new MainRepositoryImp());
        presenter.setActivityView(this);
        presenter.setAdapterModel(adapter);
        presenter.setAdapaterView(adapter);
        adapter.setPresenter(presenter);
        presenter.start();
    }

    @OnClick(R.id.send_msg)
    public void clickSendMsg(){

    }

    @Override
    public void setPresenter(MainContract.Presenter presenter) {

    }

//    @OnClick(R.id.txt_send)
//    public void sendMessage(){
//        presenter.sendMessage(editText.getText().toString());
//        editText.setText("");
//    }

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
