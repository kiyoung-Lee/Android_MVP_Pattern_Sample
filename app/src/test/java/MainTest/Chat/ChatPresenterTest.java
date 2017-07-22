package MainTest.Chat;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;

import com.example.mvp_sample.Common.BaseAdapterContract;
import com.example.mvp_sample.Main.Chat.ChatContract;
import com.example.mvp_sample.Main.Chat.ChatFragment;
import com.example.mvp_sample.Main.Chat.ChatPresenterImpl;
import com.example.mvp_sample.Main.Chat.Data.ChatRepository;
import com.example.mvp_sample.Main.Chat.Data.ChatRepositoryImpl;

import org.junit.Test;

/**
 * Created by KiyoungLee on 2017-07-16.
 */

public class ChatPresenterTest {

    @Test
    public void constructor_Test(){
        try {
            ChatRepository dataSource = mock(ChatRepositoryImpl.class);
            ChatContract.Presenter presenter = new ChatPresenterImpl(dataSource);
        }catch (Exception ex){
            fail();
        }
    }

    @Test
    public void constructor_Null_Test(){
        try{
            ChatContract.Presenter presenter = new ChatPresenterImpl(null);
        }catch (NullPointerException ex){
            assertEquals(ex.getMessage(), "Repository Is Null");
        }catch (Exception ex){
            fail();
        }
    }

    @Test
    public void setFragmentView_Test(){
        try {
            ChatRepository dataSource = mock(ChatRepositoryImpl.class);
            ChatContract.Presenter presenter = new ChatPresenterImpl(dataSource);
            ChatContract.FragmentView fragmentView = mock(ChatFragment.class);
            presenter.setFragmentView(fragmentView);
        }catch (Exception ex){
            fail();
        }
    }

    @Test
    public void setFragmentView_Null_Test(){
        try {
            ChatRepository dataSource = mock(ChatRepositoryImpl.class);
            ChatContract.Presenter presenter = new ChatPresenterImpl(dataSource);
            presenter.setFragmentView(null);
        }catch (NullPointerException e){
            assertEquals(e.getMessage(), "FragmentView Is Null");
        }catch (Exception ex){
            fail();
        }
    }

    @Test
    public void setAdapterModel_Test(){
        try {
            ChatRepository dataSource = mock(ChatRepositoryImpl.class);
            ChatContract.Presenter presenter = new ChatPresenterImpl(dataSource);
            BaseAdapterContract.Model adapterModel = mock(BaseAdapterContract.Model.class);
            presenter.setChatAdapterModel(adapterModel);
        }catch (Exception e){
            fail();
        }
    }

    @Test
    public void setAdapterModel_Null_Test(){
        try {
            ChatRepository dataSource = mock(ChatRepositoryImpl.class);
            ChatContract.Presenter presenter = new ChatPresenterImpl(dataSource);
            presenter.setChatAdapterModel(null);
        }catch (NullPointerException e){
            assertEquals(e.getMessage(), "ChatAdapterModel Is Null");
        }catch (Exception e){
            fail();
        }
    }

    @Test
    public void setAdapterView_Test(){
        try {
            ChatRepository dataSource = mock(ChatRepositoryImpl.class);
            ChatContract.Presenter presenter = new ChatPresenterImpl(dataSource);
            BaseAdapterContract.View adapterView = mock(BaseAdapterContract.View.class);
            presenter.setChatAdapterView(adapterView);
        }catch (Exception e){
            fail();
        }
    }

    @Test
    public void setAdapterView_Null_Test(){
        try {
            ChatRepository dataSource = mock(ChatRepositoryImpl.class);
            ChatContract.Presenter presenter = new ChatPresenterImpl(dataSource);
            presenter.setChatAdapterView(null);
        }catch (NullPointerException e){
            assertEquals(e.getMessage(), "ChatAdapterView Is Null");
        }catch (Exception e){
            fail();
        }
    }

    @Test
    public void sendMessage_Datareference_Null_Test() {
        try {
            ChatRepository dataSource = mock(ChatRepositoryImpl.class);
            ChatContract.Presenter presenter = new ChatPresenterImpl(dataSource);
            presenter.sendMessage("hi");
        }catch (NullPointerException e){
            assertEquals(e.getMessage(), "dataReference Is Null");
        }
        catch (Exception e){
            fail();
        }
    }

    @Test
    public void sendMessage_Msg_Null_Test() {
        try {
            ChatRepository dataSource = mock(ChatRepositoryImpl.class);
            ChatContract.Presenter presenter = new ChatPresenterImpl(dataSource);
            presenter.sendMessage(null);
        }catch (Exception e){
            fail();
        }
    }

    @Test
    public void sendMessage_Msg_empty_Test() {
        try {
            ChatRepository dataSource = mock(ChatRepositoryImpl.class);
            ChatContract.Presenter presenter = new ChatPresenterImpl(dataSource);
            presenter.sendMessage("");
        }catch (Exception e){
            fail();
        }
    }
}
