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
        ChatRepository dataSource = mock(ChatRepositoryImpl.class);
        ChatContract.Presenter presenter = new ChatPresenterImpl(dataSource);
    }

    @Test (expected = NullPointerException.class)
    public void constructor_Null_Test(){
        ChatContract.Presenter presenter = new ChatPresenterImpl(null);
    }

    @Test
    public void setFragmentView_Test(){
        ChatRepository dataSource = mock(ChatRepositoryImpl.class);
        ChatContract.Presenter presenter = new ChatPresenterImpl(dataSource);
        ChatContract.FragmentView fragmentView = mock(ChatFragment.class);
        presenter.setFragmentView(fragmentView);
    }

    @Test (expected = NullPointerException.class)
    public void setFragmentView_Null_Test(){
        ChatRepository dataSource = mock(ChatRepositoryImpl.class);
        ChatContract.Presenter presenter = new ChatPresenterImpl(dataSource);
        presenter.setFragmentView(null);
    }

    @Test
    public void setAdapterModel_Test(){
        ChatRepository dataSource = mock(ChatRepositoryImpl.class);
        ChatContract.Presenter presenter = new ChatPresenterImpl(dataSource);
        BaseAdapterContract.Model adapterModel = mock(BaseAdapterContract.Model.class);
        presenter.setChatAdapterModel(adapterModel);
    }

    @Test (expected = NullPointerException.class)
    public void setAdapterModel_Null_Test(){
        ChatRepository dataSource = mock(ChatRepositoryImpl.class);
        ChatContract.Presenter presenter = new ChatPresenterImpl(dataSource);
        presenter.setChatAdapterModel(null);
    }

    @Test
    public void setAdapterView_Test(){
        ChatRepository dataSource = mock(ChatRepositoryImpl.class);
        ChatContract.Presenter presenter = new ChatPresenterImpl(dataSource);
        BaseAdapterContract.View adapterView = mock(BaseAdapterContract.View.class);
        presenter.setChatAdapterView(adapterView);
    }

    @Test (expected = NullPointerException.class)
    public void setAdapterView_Null_Test(){
        ChatRepository dataSource = mock(ChatRepositoryImpl.class);
        ChatContract.Presenter presenter = new ChatPresenterImpl(dataSource);
        presenter.setChatAdapterView(null);
    }

    @Test (expected = NullPointerException.class)
    public void sendMessage_Datareference_Null_Test() {
        ChatRepository dataSource = mock(ChatRepositoryImpl.class);
        ChatContract.Presenter presenter = new ChatPresenterImpl(dataSource);
        presenter.sendMessage("hi");
    }

    @Test 
    public void sendMessage_Msg_Null_Test() {
        ChatRepository dataSource = mock(ChatRepositoryImpl.class);
        ChatContract.Presenter presenter = new ChatPresenterImpl(dataSource);
        presenter.sendMessage(null);
    }

    @Test
    public void sendMessage_Msg_empty_Test() {
        ChatRepository dataSource = mock(ChatRepositoryImpl.class);
        ChatContract.Presenter presenter = new ChatPresenterImpl(dataSource);
        presenter.sendMessage("");
    }
}
