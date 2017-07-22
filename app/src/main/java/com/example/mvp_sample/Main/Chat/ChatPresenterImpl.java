package com.example.mvp_sample.Main.Chat;

import static com.google.common.base.Preconditions.checkNotNull;

import com.example.mvp_sample.Common.BaseAdapterContract;
import com.example.mvp_sample.Main.Chat.Data.ChatRepository;
import com.example.mvp_sample.Main.Chat.Data.ChatData;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.List;

/**
 * Created by KiyoungLee on 2017-07-09.
 */

public class ChatPresenterImpl implements ChatContract.Presenter {

    private ChatRepository repository;
    private ChatContract.FragmentView fragmentView;
    private BaseAdapterContract.Model<List<ChatData>> chatAdapterModel;
    private BaseAdapterContract.View chatAdapterView;

    private FirebaseDatabase firebaseDatabase;
    private DatabaseReference databaseReference;

    //Unit Test: constructor_Test(), constructor_Null_Test()
    public ChatPresenterImpl(ChatRepository repository) {
        checkNotNull(repository, "Repository Is Null");
        this.repository = repository;
    }

    //Unit Test: setFragmentView_Test(), setFragmentView_Null_Test()
    public void setFragmentView(ChatContract.FragmentView fragmentView) {
        checkNotNull(fragmentView, "FragmentView Is Null");
        this.fragmentView = fragmentView;
    }

    //Unit Test: setAdapterModel_Test(), setAdapterModel_Null_Test()
    public void setChatAdapterModel(BaseAdapterContract.Model<List<ChatData>> chatAdapterModel) {
        checkNotNull(chatAdapterModel, "ChatAdapterModel Is Null");
        this.chatAdapterModel = chatAdapterModel;
    }

    //Unit Test: setAdapterView_Test(), setAdapterView_Null_Test()
    public void setChatAdapterView(BaseAdapterContract.View chatAdapterView) {
        checkNotNull(chatAdapterView, "ChatAdapterView Is Null");
        this.chatAdapterView = chatAdapterView;
    }

    @Override
    public void start() {
        initFireBase();
    }

    private void initFireBase(){
        //FireBase Init
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference("message");
        databaseReference.child("message").addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                ChatData addItem = dataSnapshot.getValue(ChatData.class);
                List<ChatData> chatList = repository.addChatData(addItem);

                checkNotNull(chatList, "ChatListData Is Null");
                checkNotNull(chatAdapterModel, "AdapterModel Is Null");
                checkNotNull(chatAdapterView, "AdapterView Is Null");

                chatAdapterModel.replaceData(chatList);
                chatAdapterView.notifyAdapter();
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
    //Unit Test: sendMessage_Datareference_Null_Test(), sendMessage_Msg_Null_Test(), sendMessage_Msg_empty_Test()
    public void sendMessage(String msg) {
        if(msg != null && msg != "") {
            checkNotNull(databaseReference, "dataReference Is Null");
            ChatData chatData = new ChatData("Michal", msg);
            databaseReference.child("hello").push().setValue(chatData);
        }
    }
}
