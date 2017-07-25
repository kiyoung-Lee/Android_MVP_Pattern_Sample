package GroupTest;

import com.example.mvp_sample.Group.Data.GroupRepository;
import com.example.mvp_sample.Group.Data.GroupRepositoryImpl;
import com.example.mvp_sample.Group.GroupActivity;
import com.example.mvp_sample.Group.GroupContract;
import com.example.mvp_sample.Group.GroupPresenterImpl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;

/**
 * Created by kiyoungLee on 2017-07-25.
 */

public class GroupPresenterTest {

    @Test
    public void constructor_Test(){
        try {
            GroupRepository dataSource = mock(GroupRepositoryImpl.class);
            GroupContract.Presenter presenter = new GroupPresenterImpl(dataSource);
        }catch (Exception ex){
            fail();
        }
    }

    @Test
    public void constructor_Null_Test(){
        try{
            GroupContract.Presenter presenter = new GroupPresenterImpl(null);
        }catch (NullPointerException ex){
            assertEquals(ex.getMessage(), "Repository Is Null");
        }catch (Exception ex){
            fail();
        }
    }

    @Test
    public void setActivityView_Test(){
        try {
            GroupRepository dataSource = mock(GroupRepositoryImpl.class);
            GroupContract.Presenter presenter = new GroupPresenterImpl(dataSource);
            GroupContract.ActivityView ActivityView = mock(GroupActivity.class);
            presenter.setActivityView(ActivityView);
        }catch (Exception ex){
            fail();
        }
    }

    @Test
    public void setActivityView_Null_Test(){
        try {
            GroupRepository dataSource = mock(GroupRepositoryImpl.class);
            GroupContract.Presenter presenter = new GroupPresenterImpl(dataSource);
            presenter.setActivityView(null);
        }catch (NullPointerException e){
            assertEquals(e.getMessage(), "ActivityView Is Null");
        }catch (Exception ex){
            fail();
        }
    }
}
