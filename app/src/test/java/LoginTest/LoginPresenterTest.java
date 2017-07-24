package LoginTest;

import com.example.mvp_sample.Login.Data.LoginRepository;
import com.example.mvp_sample.Login.Data.LoginRepositoryImpl;
import com.example.mvp_sample.Login.LoginActivity;
import com.example.mvp_sample.Login.LoginContract;
import com.example.mvp_sample.Login.LoginPresenterImpl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;

/**
 * Created by mapssi on 24/07/2017.
 */

public class LoginPresenterTest {

    @Test
    public void constructor_Test(){
        try {
            LoginRepository dataSource = mock(LoginRepositoryImpl.class);
            LoginContract.Presenter presenter = new LoginPresenterImpl(dataSource);
        }catch (Exception ex){
            fail();
        }
    }

    @Test
    public void constructor_Null_Test(){
        try{
            LoginContract.Presenter presenter = new LoginPresenterImpl(null);
        }catch (NullPointerException ex){
            assertEquals(ex.getMessage(), "Repository Is Null");
        }catch (Exception ex){
            fail();
        }
    }

    @Test
    public void setActivityView_Test(){
        try {
            LoginRepository dataSource = mock(LoginRepositoryImpl.class);
            LoginContract.Presenter presenter = new LoginPresenterImpl(dataSource);
            LoginContract.ActivityView ActivityView = mock(LoginActivity.class);
            presenter.setActivityView(ActivityView);
        }catch (Exception ex){
            fail();
        }
    }

    @Test
    public void setActivityView_Null_Test(){
        try {
            LoginRepository dataSource = mock(LoginRepositoryImpl.class);
            LoginContract.Presenter presenter = new LoginPresenterImpl(dataSource);
            presenter.setActivityView(null);
        }catch (NullPointerException e){
            assertEquals(e.getMessage(), "ActivityView Is Null");
        }catch (Exception ex){
            fail();
        }
    }
}
