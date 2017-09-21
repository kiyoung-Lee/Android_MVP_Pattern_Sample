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
        LoginRepository dataSource = mock(LoginRepositoryImpl.class);
        LoginContract.Presenter presenter = new LoginPresenterImpl(dataSource);
    }

    @Test (expected = NullPointerException.class)
    public void constructor_Null_Test(){
        LoginContract.Presenter presenter = new LoginPresenterImpl(null);
    }

    @Test
    public void setActivityView_Test(){
        LoginRepository dataSource = mock(LoginRepositoryImpl.class);
        LoginContract.Presenter presenter = new LoginPresenterImpl(dataSource);
        LoginContract.ActivityView ActivityView = mock(LoginActivity.class);
        presenter.setActivityView(ActivityView);
    }

    @Test (expected = NullPointerException.class)
    public void setActivityView_Null_Test(){
        LoginRepository dataSource = mock(LoginRepositoryImpl.class);
        LoginContract.Presenter presenter = new LoginPresenterImpl(dataSource);
        presenter.setActivityView(null);
    }
}
