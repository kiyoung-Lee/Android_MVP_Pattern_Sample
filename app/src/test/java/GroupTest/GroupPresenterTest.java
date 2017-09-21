package GroupTest;

import com.example.mvp_sample.Common.BaseAdapterContract;
import com.example.mvp_sample.Group.Data.GroupData;
import com.example.mvp_sample.Group.Data.GroupRepository;
import com.example.mvp_sample.Group.Data.GroupRepositoryImpl;
import com.example.mvp_sample.Group.GroupActivity;
import com.example.mvp_sample.Group.GroupAdatper;
import com.example.mvp_sample.Group.GroupContract;
import com.example.mvp_sample.Group.GroupPresenterImpl;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;

/**
 * Created by kiyoungLee on 2017-07-25.
 */

public class GroupPresenterTest {

    @Test
    public void constructor_Test(){
        GroupRepository dataSource = mock(GroupRepositoryImpl.class);
        GroupContract.Presenter presenter = new GroupPresenterImpl(dataSource);
    }

    @Test (expected = NullPointerException.class)
    public void constructor_Null_Test(){
        GroupContract.Presenter presenter = new GroupPresenterImpl(null);
    }

    @Test
    public void setActivityView_Test(){
        GroupRepository dataSource = mock(GroupRepositoryImpl.class);
        GroupContract.Presenter presenter = new GroupPresenterImpl(dataSource);
        GroupContract.ActivityView ActivityView = mock(GroupActivity.class);
        presenter.setActivityView(ActivityView);
    }

    @Test (expected = NullPointerException.class)
    public void setActivityView_Null_Test(){
        GroupRepository dataSource = mock(GroupRepositoryImpl.class);
        GroupContract.Presenter presenter = new GroupPresenterImpl(dataSource);
        presenter.setActivityView(null);
    }

    @Test
    public void setAdapterModel_Test() {
        GroupRepository dataSource = mock(GroupRepositoryImpl.class);
        GroupContract.Presenter presenter = new GroupPresenterImpl(dataSource);
        BaseAdapterContract.Model<List<GroupData>> adapterModel = mock(BaseAdapterContract.Model.class);
        presenter.setAdapterModel(adapterModel);
    }

    @Test (expected = NullPointerException.class)
    public void setAdapterModel_Null_Test() {
        GroupRepository dataSource = mock(GroupRepositoryImpl.class);
        GroupContract.Presenter presenter = new GroupPresenterImpl(dataSource);
        presenter.setAdapterModel(null);
    }

    @Test
    public void setAdapterView_Test() {
        GroupRepository dataSource = mock(GroupRepositoryImpl.class);
        GroupContract.Presenter presenter = new GroupPresenterImpl(dataSource);
        BaseAdapterContract.View adapterView = mock(BaseAdapterContract.View.class);
        presenter.setAdapterView(adapterView);
    }

    @Test (expected = NullPointerException.class)
    public void setAdapterView_Null_Test() {
        GroupRepository dataSource = mock(GroupRepositoryImpl.class);
        GroupContract.Presenter presenter = new GroupPresenterImpl(dataSource);
        presenter.setAdapterView(null);
    }

    @Test
    public void start_Test() {
        GroupRepository dataSource = mock(GroupRepositoryImpl.class);
        GroupContract.Presenter presenter = new GroupPresenterImpl(dataSource);
        presenter.start();
    }
}
