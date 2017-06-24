package com.example.mvp_sample.Main;

import com.example.mvp_sample.Common.BaseAdapterContract;
import com.example.mvp_sample.Main.Data.ChatData;
import com.example.mvp_sample.Main.Data.MainData;
import com.example.mvp_sample.Main.Data.MainRepository;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by kiyoung Lee on 2017-05-20.
 */

public class MainPresenterImpl implements MainContract.Presenter {

    private MainRepository repository;
    private MainContract.ActivityView activityView;
    private BaseAdapterContract.Model adapterModel;
    private BaseAdapterContract.View adapterView;

    private FirebaseDatabase firebaseDatabase;
    private DatabaseReference databaseReference;

    //Unit Test : Constructor_Test(), Constructor_Null_Test()
    public MainPresenterImpl(MainRepository repository) {
        checkNotNull(repository, "Repository Is Null");
        this.repository = repository;
    }

    @Override
    //Unit Test : setActivityView_Test(). setActivityView_Null_Test()
    public void setActivityView(MainContract.ActivityView activityView) {
        checkNotNull(activityView, "Activity Is Null");
        this.activityView = activityView;
    }

    @Override
    //Unit Test: void setAdapterModel_Test(), setAdapterModel_Null_Test()
    public void setAdapterModel(BaseAdapterContract.Model adapterModel) {
        checkNotNull(adapterModel, "AdapterModel Is Null");
        this.adapterModel = adapterModel;
    }

    @Override
    //Unit Test: setAdapterView_Test(), setAdapterView_Null_Test()
    public void setAdapaterView(BaseAdapterContract.View adapaterView) {
        checkNotNull(adapaterView, "AdapterView Is Null");
        this.adapterView = adapaterView;
    }

    @Override
    public void start() {
        initFireBase();

//        repository.getDataList(new MainRepository.LoadListCallBack() {
//            @Override
//            public void onListLoaded(List<MainData> dataList) {
//                checkNotNull(adapterModel, "AdapterModel Is Null");
//                checkNotNull(adapterView, "AdapterView Is Null");
//                adapterModel.replaceData(dataList);
//                adapterView.notifyAdapter();
//            }
//
//            @Override
//            public void onDataNotAvailable() {
//
//            }
//        });
    }

    private void initFireBase(){
        //FireBase Init
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference("message");
        databaseReference.child("message").addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                ChatData addItem = dataSnapshot.getValue(ChatData.class);
                repository.addChatData(addItem, new MainRepository.ChatListLoadCallBack() {
                    @Override
                    public void onChatListLoaded(List<ChatData> chatList) {
                        checkNotNull(chatList, "ChatList Is Null");
                        checkNotNull(adapterModel, "AdapterModel Is Null");
                        checkNotNull(adapterView, "AdapterView Is Null");

                        adapterModel.replaceData(chatList);
                        adapterView.notifyAdapter();
                    }
                });
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }

    @Override
    public void sendMessage(String msg) {
        ChatData chatData = new ChatData("Michal", msg);
        databaseReference.child("message").push().setValue(chatData);
    }
}
