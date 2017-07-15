package com.example.mvp_sample.Main.Chat;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mvp_sample.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by KiyoungLee on 2017-07-09.
 */

public class ChatFragment extends Fragment {

    @BindView(R.id.chat_list)
    RecyclerView chatList;

    private ChatAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.chat_frag, container, false);
        ButterKnife.bind(getActivity());
        return view;
    }
}
