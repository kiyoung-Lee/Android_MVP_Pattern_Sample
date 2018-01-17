package com.example.mvp_sample.Main.Data;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by kiyoungLee on 2018-01-17.
 */
public class MainRepositoryImpTest {

    private MainRepository repository;

    @Before
    public void setUp(){
        repository = new MainRepositoryImp();
    }

    @Test
    public void getDataList_Test(){
        repository.getDataList(new MainRepository.LoadListCallBack() {
            @Override
            public void onListLoaded(List<MainData> dataList) {
                assertNotNull(dataList);
                assertEquals(dataList.size() > 0 , true);
            }

            @Override
            public void onDataNotAvailable() {

            }
        });
    }

    @Test (expected = NullPointerException.class)
    public void getDataList_Null_Test(){
        repository.getDataList(null);
    }

}