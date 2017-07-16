package MainTest;

import com.example.mvp_sample.Common.BaseAdapterContract;
import com.example.mvp_sample.Main.Data.MainRepositoryImp;
import com.example.mvp_sample.Main.Data.MainRepository;
import com.example.mvp_sample.Main.MainActivity;
import com.example.mvp_sample.Main.MainContract;
import com.example.mvp_sample.Main.MainPresenterImpl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;

/**
 * Created by kiyoung Lee on 2017-05-20.
 */

public class MainPresenterTest {
    @Test
    public void constructor_Test(){
        try {
            MainRepository dataSource = mock(MainRepositoryImp.class);
            MainContract.Presenter presenter = new MainPresenterImpl(dataSource);
        }catch (Exception ex){
            fail();
        }
    }

    @Test
    public void constructor_Null_Test(){
        try{
            MainContract.Presenter presenter = new MainPresenterImpl(null);
        }catch (NullPointerException ex){
            assertEquals(ex.getMessage(), "Repository Is Null");
        }catch (Exception ex){
            fail();
        }
    }

    @Test
    public void setActivityView_Test(){
        try {
            MainRepository dataSource = mock(MainRepositoryImp.class);
            MainContract.Presenter presenter = new MainPresenterImpl(dataSource);
            MainContract.ActivityView ActivityView = mock(MainActivity.class);
            presenter.setActivityView(ActivityView);
        }catch (Exception ex){
            fail();
        }
    }

    @Test
    public void setActivityView_Null_Test(){
        try {
            MainRepository dataSource = mock(MainRepositoryImp.class);
            MainContract.Presenter presenter = new MainPresenterImpl(dataSource);
            presenter.setActivityView(null);
        }catch (NullPointerException e){
            assertEquals(e.getMessage(), "Activity Is Null");
        }catch (Exception ex){
            fail();
        }
    }
}
