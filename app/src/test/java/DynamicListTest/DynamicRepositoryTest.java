package DynamicListTest;

import com.example.mvp_sample.DynamicList.Data.DynamicData;
import com.example.mvp_sample.DynamicList.Data.DynamicDataRepository;
import com.example.mvp_sample.DynamicList.Data.DynamicDataRepositoryImpl;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

/**
 * Created by kiyoungLee on 2017-07-31.
 */

public class DynamicRepositoryTest {

    private DynamicDataRepository repository;

    @Before
    public void setUp(){
        repository = new DynamicDataRepositoryImpl();
    }

    @Test
    public void getDynamicData_Test() {
        try {
            repository.getDynamicData(new DynamicDataRepository.onMessageLoadedCallBack() {
                @Override
                public void onMessageListLoaded(DynamicData dynamicData) {
                    assertNotNull(dynamicData);
                    assertEquals(dynamicData.getSuccess(), 1);
                    assertEquals(dynamicData.getMessage(), "success");
                    assertNotNull(dynamicData.getMessageList());
                }
            });
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    public void getDynamicData_Callback_Null_Test() {
        try {
            repository.getDynamicData(null);
        } catch (NullPointerException e){
            assertEquals(e.getMessage(), "CallBack Is Null");
        } catch (Exception e) {
            fail();
        }
    }
}
