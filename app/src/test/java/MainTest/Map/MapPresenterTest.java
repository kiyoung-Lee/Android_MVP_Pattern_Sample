package MainTest.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;

import com.example.mvp_sample.Main.Map.Data.MapRepository;
import com.example.mvp_sample.Main.Map.Data.MapRepositoryImpl;
import com.example.mvp_sample.Main.Map.MapContract;
import com.example.mvp_sample.Main.Map.MapFragment;
import com.example.mvp_sample.Main.Map.MapPresenterImpl;

import org.junit.Test;

/**
 * Created by KiyoungLee on 2017-07-22.
 */

public class MapPresenterTest {

    @Test
    public void constructor_Test(){
        MapRepository dataSource = mock(MapRepositoryImpl.class);
        MapContract.Presenter presenter = new MapPresenterImpl(dataSource);
    }

    @Test (expected = NullPointerException.class)
    public void constructor_Null_Test(){
        MapContract.Presenter presenter = new MapPresenterImpl(null);
    }

    @Test
    public void setFragmentView_Test(){
        try {
            MapRepository dataSource = mock(MapRepositoryImpl.class);
            MapContract.Presenter presenter = new MapPresenterImpl(dataSource);
            MapContract.FragmentView fragmentView = mock(MapFragment.class);
            presenter.setFragmentView(fragmentView);
        }catch (Exception ex){
            fail();
        }
    }

    @Test (expected = NullPointerException.class)
    public void setFragmentView_Null_Test(){
        MapRepository dataSource = mock(MapRepositoryImpl.class);
        MapContract.Presenter presenter = new MapPresenterImpl(dataSource);
        presenter.setFragmentView(null);
    }
}
