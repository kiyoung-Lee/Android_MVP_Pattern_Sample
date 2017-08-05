package DynamicListTest;

import com.example.mvp_sample.DynamicList.Data.DynamicDataRepository;
import com.example.mvp_sample.DynamicList.Data.DynamicDataRepositoryImpl;
import com.example.mvp_sample.DynamicList.DynamicActivity;
import com.example.mvp_sample.DynamicList.DynamicContract;
import com.example.mvp_sample.DynamicList.DynamicPresenterImpl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;

/**
 * Created by kiyoungLee on 2017-07-31.
 */

public class DynamicPresenterTest {

    @Test
    public void constructor_Test(){
        try {
            DynamicDataRepository dataSource = mock(DynamicDataRepositoryImpl.class);
            DynamicContract.Presenter presenter = new DynamicPresenterImpl(dataSource);
        }catch (Exception ex){
            fail();
        }
    }

    @Test
    public void constructor_Null_Test(){
        try{
            DynamicContract.Presenter presenter = new DynamicPresenterImpl(null);
        }catch (NullPointerException ex){
            assertEquals(ex.getMessage(), "Repository Is Null");
        }catch (Exception ex){
            fail();
        }
    }

    @Test
    public void setActivityView_Test(){
        try {
            DynamicDataRepository dataSource = mock(DynamicDataRepositoryImpl.class);
            DynamicContract.Presenter presenter = new DynamicPresenterImpl(dataSource);
            DynamicContract.ActivityView ActivityView = mock(DynamicActivity.class);
            presenter.setActivityView(ActivityView);
        }catch (Exception ex){
            fail();
        }
    }

    @Test
    public void setActivityView_Null_Test(){
        try {
            DynamicDataRepository dataSource = mock(DynamicDataRepositoryImpl.class);
            DynamicContract.Presenter presenter = new DynamicPresenterImpl(dataSource);
            presenter.setActivityView(null);
        }catch (NullPointerException e){
            assertEquals(e.getMessage(), "ActivityView Is Null");
        }catch (Exception ex){
            fail();
        }
    }
}
