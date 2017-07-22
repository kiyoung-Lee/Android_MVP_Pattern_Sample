package MainTest.MyPage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;

import com.example.mvp_sample.Main.MyPage.Data.MyPageRepository;
import com.example.mvp_sample.Main.MyPage.Data.MyPageRepositoryImpl;
import com.example.mvp_sample.Main.MyPage.MyPageContract;
import com.example.mvp_sample.Main.MyPage.MyPageFragment;
import com.example.mvp_sample.Main.MyPage.MyPagePresenterImpl;

import org.junit.Test;

/**
 * Created by KiyoungLee on 2017-07-22.
 */

public class MyPagePresenterTest {

    @Test
    public void constructor_Test(){
        try {
            MyPageRepository dataSource = mock(MyPageRepositoryImpl.class);
            MyPageContract.Presenter presenter = new MyPagePresenterImpl(dataSource);
        }catch (Exception ex){
            fail();
        }
    }

    @Test
    public void constructor_Null_Test(){
        try{
            MyPageContract.Presenter presenter = new MyPagePresenterImpl(null);
        }catch (NullPointerException ex){
            assertEquals(ex.getMessage(), "Repository Is Null");
        }catch (Exception ex){
            fail();
        }
    }

    @Test
    public void setFragmentView_Test(){
        try {
            MyPageRepository dataSource = mock(MyPageRepositoryImpl.class);
            MyPageContract.Presenter presenter = new MyPagePresenterImpl(dataSource);
            MyPageContract.FragmentView fragmentView = mock(MyPageFragment.class);
            presenter.setFragmentView(fragmentView);
        }catch (Exception ex){
            fail();
        }
    }

    @Test
    public void setFragmentView_Null_Test(){
        try {
            MyPageRepository dataSource = mock(MyPageRepositoryImpl.class);
            MyPageContract.Presenter presenter = new MyPagePresenterImpl(dataSource);
            presenter.setFragmentView(null);
        }catch (NullPointerException e){
            assertEquals(e.getMessage(), "FragmentView Is Null");
        }catch (Exception ex){
            fail();
        }
    }
}