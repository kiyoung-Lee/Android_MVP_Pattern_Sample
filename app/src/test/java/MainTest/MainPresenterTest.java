package MainTest;

import com.example.mvp_sample.Common.BaseAdapterContract;
import com.example.mvp_sample.Main.Chat.ChatContract;
import com.example.mvp_sample.Main.Data.MainRepositoryImp;
import com.example.mvp_sample.Main.Data.MainRepository;
import com.example.mvp_sample.Main.Feed.FeedContract;
import com.example.mvp_sample.Main.MainActivity;
import com.example.mvp_sample.Main.MainContract;
import com.example.mvp_sample.Main.MainPresenterImpl;
import com.example.mvp_sample.Main.Map.MapContract;
import com.example.mvp_sample.Main.MyPage.MyPageContract;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockingDetails;

/**
 * Created by kiyoung Lee on 2017-05-20.
 */

public class MainPresenterTest {
    @Test
    public void constructor_Test(){
        MainRepository dataSource = mock(MainRepositoryImp.class);
        MainContract.Presenter presenter = new MainPresenterImpl(dataSource);
    }

    @Test (expected = NullPointerException.class)
    public void constructor_Null_Test(){
        MainContract.Presenter presenter = new MainPresenterImpl(null);
    }

    @Test
    public void setActivityView_Test(){
        MainRepository dataSource = mock(MainRepositoryImp.class);
        MainContract.Presenter presenter = new MainPresenterImpl(dataSource);
        MainContract.ActivityView ActivityView = mock(MainActivity.class);
        presenter.setActivityView(ActivityView);
    }

    @Test (expected = NullPointerException.class)
    public void setActivityView_Null_Test(){
        MainRepository dataSource = mock(MainRepositoryImp.class);
        MainContract.Presenter presenter = new MainPresenterImpl(dataSource);
        presenter.setActivityView(null);
    }

    @Test
    public void setChatPresenter_Test() throws Exception {
        MainRepository dataSource = mock(MainRepositoryImp.class);
        MainContract.Presenter presenter = new MainPresenterImpl(dataSource);
        presenter.setChatPresenter(mock(ChatContract.Presenter.class));
    }

    @Test (expected = NullPointerException.class)
    public void setChatPresenter_Null_Test() throws Exception {
        MainRepository dataSource = mock(MainRepositoryImp.class);
        MainContract.Presenter presenter = new MainPresenterImpl(dataSource);
        presenter.setChatPresenter(null);
    }

    @Test
    public void setFeedPresenter_Test() throws Exception {
        MainRepository dataSource = mock(MainRepositoryImp.class);
        MainContract.Presenter presenter = new MainPresenterImpl(dataSource);
        presenter.setFeedPresenter(mock(FeedContract.Presenter.class));
    }

    @Test (expected = NullPointerException.class)
    public void setFeedPresenter_Null_Test() throws Exception {
        MainRepository dataSource = mock(MainRepositoryImp.class);
        MainContract.Presenter presenter = new MainPresenterImpl(dataSource);
        presenter.setFeedPresenter(null);
    }

    @Test
    public void setMapPresenter_Test() throws Exception {
        MainRepository dataSource = mock(MainRepositoryImp.class);
        MainContract.Presenter presenter = new MainPresenterImpl(dataSource);
        presenter.setMapPresenter(mock(MapContract.Presenter.class));
    }

    @Test (expected = NullPointerException.class)
    public void setMapPresenter_Null_Test() throws Exception {
        MainRepository dataSource = mock(MainRepositoryImp.class);
        MainContract.Presenter presenter = new MainPresenterImpl(dataSource);
        presenter.setMapPresenter(null);
    }

    @Test
    public void setMyPagePresenter_Test() throws Exception {
        MainRepository dataSource = mock(MainRepositoryImp.class);
        MainContract.Presenter presenter = new MainPresenterImpl(dataSource);
        presenter.setMyPagePresenter(mock(MyPageContract.Presenter.class));
    }

    @Test (expected = NullPointerException.class)
    public void setMyPagePresenter_Null_Test() throws Exception {
        MainRepository dataSource = mock(MainRepositoryImp.class);
        MainContract.Presenter presenter = new MainPresenterImpl(dataSource);
        presenter.setMyPagePresenter(null);
    }

    @Test
    public void start_Test() throws Exception {
        MainRepository dataSource = mock(MainRepositoryImp.class);
        MainContract.Presenter presenter = new MainPresenterImpl(dataSource);
        presenter.start();
    }
}
