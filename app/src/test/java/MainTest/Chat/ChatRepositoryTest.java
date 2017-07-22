package MainTest.Chat;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;

import com.example.mvp_sample.Main.Chat.Data.ChatData;
import com.example.mvp_sample.Main.Chat.Data.ChatRepository;
import com.example.mvp_sample.Main.Chat.Data.ChatRepositoryImpl;
import com.example.mvp_sample.Main.Data.MainRepository;
import com.example.mvp_sample.Main.Data.MainRepositoryImp;

import org.junit.Before;
import org.junit.Test;
import org.mockito.internal.exceptions.ExceptionIncludingMockitoWarnings;

import java.util.List;

/**
 * Created by KiyoungLee on 2017-07-22.
 */

public class ChatRepositoryTest {

    private ChatRepository repository;

    @Before
    public void setUp(){
        repository = new ChatRepositoryImpl();
    }

    @Test
    public void addChatData_Test() {
        try {
            List<ChatData> chatList
                    = repository.addChatData(mock(ChatData.class));

            assertNotNull(chatList);
        }catch (Exception e){
            fail();
        }
    }

    @Test
    public void addChatData_addItem_Null_Test() {
        try {
            List<ChatData> chatList
                    = repository.addChatData(null);

            assertNotNull(chatList);
        } catch (NullPointerException e){
            assertEquals(e.getMessage(), "AddItem Is Null");
        } catch (Exception e){
            fail();
        }
    }
}
