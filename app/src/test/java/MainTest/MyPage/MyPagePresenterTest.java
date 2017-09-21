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
        MyPageRepository dataSource = mock(MyPageRepositoryImpl.class);
        MyPageContract.Presenter presenter = new MyPagePresenterImpl(dataSource);
    }

    @Test (expected = NullPointerException.class)
    public void constructor_Null_Test(){
        MyPageContract.Presenter presenter = new MyPagePresenterImpl(null);
    }

    @Test
    public void setFragmentView_Test(){
        MyPageRepository dataSource = mock(MyPageRepositoryImpl.class);
        MyPageContract.Presenter presenter = new MyPagePresenterImpl(dataSource);
        MyPageContract.FragmentView fragmentView = mock(MyPageFragment.class);
        presenter.setFragmentView(fragmentView);
    }

    @Test (expected = NullPointerException.class)
    public void setFragmentView_Null_Test(){
        MyPageRepository dataSource = mock(MyPageRepositoryImpl.class);
        MyPageContract.Presenter presenter = new MyPagePresenterImpl(dataSource);
        presenter.setFragmentView(null);
    }
}