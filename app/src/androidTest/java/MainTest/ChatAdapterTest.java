package MainTest;

import android.content.Context;
import android.support.test.InstrumentationRegistry;

import com.example.mvp_sample.Common.BaseAdapterContract;
import com.example.mvp_sample.Main.Data.MainData;
import com.example.mvp_sample.Main.Chat.ChatAdapter;
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

public class ChatAdapterTest {

    private ChatAdapter adapter;
    private Context appContext;
    private BaseAdapterContract.Model adapterModel;
    private BaseAdapterContract.View adapterView;

    @Before
    public void setUp(){
        appContext = InstrumentationRegistry.getTargetContext();
    }

    @Test
    public void constructor_Test(){
        try{
            adapter = new ChatAdapter(appContext);
        }catch (Exception e){
            fail();
        }
    }

    @Test
    public void constructor_Null_Test(){
        try{
            ChatAdapter adapter = new ChatAdapter(null);
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
            adapter = new ChatAdapter(appContext);
            adapterView = adapter;
            adapterView.setPresenter(presenter);
        }catch (Exception e){
            fail();
        }
    }

    @Test
    public void getItemCount_Test() {
        try {
            // given
            List<MainData> dataList = new ArrayList<>();
            dataList.add(mock(MainData.class));
            dataList.add(mock(MainData.class));
            adapter = new ChatAdapter(appContext);
            adapterModel = adapter;

            //when
            adapterModel.replaceData(dataList);

            //then
            assertEquals(adapter.getItemCount(), 2);
        }catch (Exception e){
            fail();
        }
    }

    @Test
    public void getItemCount_ItemList_Null_Test() {
        try {
            adapter = new ChatAdapter(appContext);
            assertEquals(adapter.getItemCount(), 0);
        }catch (Exception e){
            fail();
        }
    }

    @Test
    public void setPresenter_Null_Test(){
        try {
            adapter = new ChatAdapter(appContext);
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
            adapter = new ChatAdapter(appContext);
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
            adapter = new ChatAdapter(appContext);
            adapterModel = adapter;
            adapterModel.replaceData(emptyList);
        }catch (Exception e){
            fail();
        }
    }

    @Test
    public void replaceData_Null_Test(){
        try {
            adapter = new ChatAdapter(appContext);
            adapterModel = adapter;
            adapterModel.replaceData(null);
        }catch (NullPointerException e){
            assertEquals(e.getMessage(), "AlramList Is Null");
        }catch (Exception e){
            fail();
        }
    }
}
