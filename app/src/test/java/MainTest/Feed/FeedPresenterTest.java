package MainTest.Feed;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;

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
        try {
            FeedRepositoy dataSource = mock(FeedRepositoryImpl.class);
            FeedContract.Presenter presenter = new FeedPresenterImpl(dataSource);
        }catch (Exception ex){
            fail();
        }
    }

    @Test
    public void constructor_Null_Test(){
        try{
            FeedContract.Presenter presenter = new FeedPresenterImpl(null);
        }catch (NullPointerException ex){
            assertEquals(ex.getMessage(), "Repository Is Null");
        }catch (Exception ex){
            fail();
        }
    }

    @Test
    public void setFragmentView_Test(){
        try {
            FeedRepositoy dataSource = mock(FeedRepositoryImpl.class);
            FeedContract.Presenter presenter = new FeedPresenterImpl(dataSource);
            FeedContract.FragmentView fragmentView = mock(FeedFragment.class);
            presenter.setFragmentView(fragmentView);
        }catch (Exception ex){
            fail();
        }
    }

    @Test
    public void setFragmentView_Null_Test(){
        try {
            FeedRepositoy dataSource = mock(FeedRepositoryImpl.class);
            FeedContract.Presenter presenter = new FeedPresenterImpl(dataSource);
            presenter.setFragmentView(null);
        }catch (NullPointerException e){
            assertEquals(e.getMessage(), "FragmentView Is Null");
        }catch (Exception ex){
            fail();
        }
    }
}
