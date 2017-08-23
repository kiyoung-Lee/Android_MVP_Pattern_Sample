package MainTest.Feed;

import android.widget.BaseAdapter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;

import com.example.mvp_sample.Common.BaseAdapterContract;
import com.example.mvp_sample.Main.Feed.Data.FeedRepositoryImpl;
import com.example.mvp_sample.Main.Feed.Data.FeedRepositoy;
import com.example.mvp_sample.Main.Feed.FeedContract;
import com.example.mvp_sample.Main.Feed.FeedFragment;
import com.example.mvp_sample.Main.Feed.FeedPresenterImpl;

import org.junit.Test;

/**
 * Created by KiyoungLee on 2017-07-22.
 */

public class FeedPresenterTest {

    @Test
    public void constructor_Test(){
        FeedRepositoy dataSource = mock(FeedRepositoryImpl.class);
        FeedContract.Presenter presenter = new FeedPresenterImpl(dataSource);
    }

    @Test (expected = NullPointerException.class)
    public void constructor_Null_Test(){
        FeedContract.Presenter presenter = new FeedPresenterImpl(null);
    }

    @Test
    public void setFragmentView_Test(){
        FeedRepositoy dataSource = mock(FeedRepositoryImpl.class);
        FeedContract.Presenter presenter = new FeedPresenterImpl(dataSource);
        FeedContract.FragmentView fragmentView = mock(FeedFragment.class);
        presenter.setFragmentView(fragmentView);
    }

    @Test (expected = NullPointerException.class)
    public void setFragmentView_Null_Test(){
        FeedRepositoy dataSource = mock(FeedRepositoryImpl.class);
        FeedContract.Presenter presenter = new FeedPresenterImpl(dataSource);
        presenter.setFragmentView(null);
    }

    @Test
    public void setFeedAdapterModel_Test() {
        FeedRepositoy dataSource = mock(FeedRepositoryImpl.class);
        FeedContract.Presenter presenter = new FeedPresenterImpl(dataSource);
        presenter.setFeedAdapterModel(mock(BaseAdapterContract.Model.class));
    }

    @Test (expected = NullPointerException.class)
    public void setFeedAdapterModel_Null_Test() {
        FeedRepositoy dataSource = mock(FeedRepositoryImpl.class);
        FeedContract.Presenter presenter = new FeedPresenterImpl(dataSource);
        presenter.setFeedAdapterModel(null);
    }

    @Test
    public void setFeedAdapterView_Test() {
        FeedRepositoy dataSource = mock(FeedRepositoryImpl.class);
        FeedContract.Presenter presenter = new FeedPresenterImpl(dataSource);
        presenter.setFeedAdapterView(mock(BaseAdapterContract.View.class));
    }

    @Test (expected = NullPointerException.class)
    public void setFeedAdapterView_Null_Test() {
        FeedRepositoy dataSource = mock(FeedRepositoryImpl.class);
        FeedContract.Presenter presenter = new FeedPresenterImpl(dataSource);
        presenter.setFeedAdapterView(null);
    }
}
