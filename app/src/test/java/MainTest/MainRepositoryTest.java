package MainTest;

import com.example.mvp_sample.Main.Data.MainData;
import com.example.mvp_sample.Main.Data.MainRepository;
import com.example.mvp_sample.Main.Data.MainRepositoryImp;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

/**
 * Created by kiyoung Lee on 2017-05-28.
 */

public class MainRepositoryTest {

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
