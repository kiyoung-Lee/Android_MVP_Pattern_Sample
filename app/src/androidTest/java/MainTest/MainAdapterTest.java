package MainTest;

import android.content.Context;
import android.support.test.InstrumentationRegistry;

import com.example.mvp_sample.Main.Data.MainData;
import com.example.mvp_sample.Main.MainAdapter;
import com.example.mvp_sample.Main.MainAdapterContract;
import com.example.mvp_sample.Main.MainContract;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;

/**
 * Created by kiyoung Lee on 2017-05-28.
 */

public class MainAdapterTest {

    private MainAdapter adapter;
    private Context appContext;
    private MainAdapterContract.Model adapterModel;
    private MainAdapterContract.View adapterView;

    @Before
    public void setUp(){
        appContext = InstrumentationRegistry.getTargetContext();
    }

    @Test
    public void constructor_Test(){
        try{
            adapter = new MainAdapter(appContext);
        }catch (Exception e){
            fail();
        }
    }

    @Test
    public void constructor_Null_Test(){
        try{
            MainAdapter adapter = new MainAdapter(null);
        }catch (NullPointerException ex){
            assertEquals(ex.getMessage(), "Context Is Null");
        }catch (Exception ex){
            fail();
        }
    }

    @Test
    public void setPresenter_Test(){
        try {
            MainContract.Presenter presenter = mock(MainContract.Presenter.class);
            adapter = new MainAdapter(appContext);
            adapterView = adapter;
            adapterView.setPresenter(presenter);
        }catch (Exception e){
            fail();
        }
    }

    @Test
    public void setPresenter_Null_Test(){
        try {
            adapter = new MainAdapter(appContext);
            adapterView = adapter;
            adapterView.setPresenter(null);
        }catch (NullPointerException e){
            assertEquals(e.getMessage(), "Presenter Is Null");
        }catch (Exception e){
            fail();
        }
    }

    @Test
    public void notifyAdapter_Test(){
        try {
            adapter = new MainAdapter(appContext);
            adapterView = adapter;
            adapterView.notifyAdapter();
        }catch (Exception e){
            fail();
        }
    }

    @Test
    public void replaceData_Test(){
        try {
            List<MainData> emptyList = new ArrayList<>();
            adapter = new MainAdapter(appContext);
            adapterModel = adapter;
            adapterModel.replaceData(emptyList);
        }catch (Exception e){
            fail();
        }
    }

    @Test
    public void replaceData_Null_Test(){
        try {
            adapter = new MainAdapter(appContext);
            adapterModel = adapter;
            adapterModel.replaceData(null);
        }catch (NullPointerException e){
            assertEquals(e.getMessage(), "AlramList Is Null");
        }catch (Exception e){
            fail();
        }
    }

    @Test
    public void dataClear_Test(){
        try {
            List<MainData> emptyList = new ArrayList<>();
            adapter = new MainAdapter(appContext);
            adapterModel = adapter;
            adapterModel.replaceData(emptyList);
            adapterModel.dataClear();
        }catch (Exception e){
            fail();
        }
    }

    @Test
    public void dataClear_Null_Test(){
        try {
            //new Object Assign for null AlramList
            adapter = new MainAdapter(appContext);
            adapterModel = adapter;
            adapterModel.dataClear();
        }catch (NullPointerException e){
            assertEquals(e.getMessage(), "AlramList Is Null");
        }catch (Exception e){
            fail();
        }
    }
}
