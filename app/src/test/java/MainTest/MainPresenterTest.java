package MainTest;

import com.example.mvp_sample.Main.Data.MainDataRepository;
import com.example.mvp_sample.Main.Data.MainDataSource;
import com.example.mvp_sample.Main.MainActivity;
import com.example.mvp_sample.Main.MainAdapter;
import com.example.mvp_sample.Main.MainAdapterContract;
import com.example.mvp_sample.Main.MainContract;
import com.example.mvp_sample.Main.MainPresenterImp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.calls;
import static org.mockito.Mockito.mock;

/**
 * Created by kiyoung Lee on 2017-05-20.
 */

public class MainPresenterTest {
    @Test
    public void constructor_Test(){
        try {
            MainDataSource dataSource = mock(MainDataRepository.class);
            MainContract.Presenter presenter = new MainPresenterImp(dataSource);
        }catch (Exception ex){
            fail();
        }
    }

    @Test
    public void constructor_Null_Test(){
        try{
            MainContract.Presenter presenter = new MainPresenterImp(null);
        }catch (NullPointerException ex){
            assertEquals(ex.getMessage(), "Repository Is Null");
        }catch (Exception ex){
            fail();
        }
    }

    @Test
    public void setActivityView_Test(){
        try {
            MainDataSource dataSource = mock(MainDataRepository.class);
            MainContract.Presenter presenter = new MainPresenterImp(dataSource);
            MainContract.ActivityView ActivityView = mock(MainActivity.class);
            presenter.setActivityView(ActivityView);
        }catch (Exception ex){
            fail();
        }
    }

    @Test
    public void setActivityView_Null_Test(){
        try {
            MainDataSource dataSource = mock(MainDataRepository.class);
            MainContract.Presenter presenter = new MainPresenterImp(dataSource);
            presenter.setActivityView(null);
        }catch (NullPointerException e){
            assertEquals(e.getMessage(), "Activity Is Null");
        }catch (Exception ex){
            fail();
        }
    }

    @Test
    public void setAdapterModel_Test(){
        try {
            MainDataSource dataSource = mock(MainDataRepository.class);
            MainContract.Presenter presenter = new MainPresenterImp(dataSource);
            MainAdapterContract.Model adapterModel = mock(MainAdapterContract.Model.class);
            presenter.setAdapterModel(adapterModel);
        }catch (Exception e){
            fail();
        }
    }

    @Test
    public void setAdapterModel_Null_Test(){
        try {
            MainDataSource dataSource = mock(MainDataRepository.class);
            MainContract.Presenter presenter = new MainPresenterImp(dataSource);
            presenter.setAdapterModel(null);
        }catch (NullPointerException e){
            assertEquals(e.getMessage(), "AdapterModel Is Null");
        }catch (Exception e){
            fail();
        }
    }

    @Test
    public void setAdapterView_Test(){
        try {
            MainDataSource dataSource = mock(MainDataRepository.class);
            MainContract.Presenter presenter = new MainPresenterImp(dataSource);
            MainAdapterContract.View adapterView = mock(MainAdapterContract.View.class);
            presenter.setAdapaterView(adapterView);
        }catch (Exception e){
            fail();
        }
    }

    @Test
    public void setAdapterView_Null_Test(){
        try {
            MainDataSource dataSource = mock(MainDataRepository.class);
            MainContract.Presenter presenter = new MainPresenterImp(dataSource);
            presenter.setAdapaterView(null);
        }catch (NullPointerException e){
            assertEquals(e.getMessage(), "AdapterView Is Null");
        }catch (Exception e){
            fail();
        }
    }
}
