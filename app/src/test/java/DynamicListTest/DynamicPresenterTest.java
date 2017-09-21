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
        DynamicDataRepository dataSource = mock(DynamicDataRepositoryImpl.class);
        DynamicContract.Presenter presenter = new DynamicPresenterImpl(dataSource);
    }

    @Test (expected = NullPointerException.class)
    public void constructor_Null_Test(){
        DynamicContract.Presenter presenter = new DynamicPresenterImpl(null);
    }

    @Test
    public void setActivityView_Test(){
        DynamicDataRepository dataSource = mock(DynamicDataRepositoryImpl.class);
        DynamicContract.Presenter presenter = new DynamicPresenterImpl(dataSource);
        DynamicContract.ActivityView ActivityView = mock(DynamicActivity.class);
        presenter.setActivityView(ActivityView);
    }

    @Test (expected = NullPointerException.class)
    public void setActivityView_Null_Test(){
        DynamicDataRepository dataSource = mock(DynamicDataRepositoryImpl.class);
        DynamicContract.Presenter presenter = new DynamicPresenterImpl(dataSource);
        presenter.setActivityView(null);
    }
}
