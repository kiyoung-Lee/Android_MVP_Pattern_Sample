package CommonTest;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.example.mvp_sample.Common.BackPressClose;
import com.example.mvp_sample.Login.LoginActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.InstrumentationRegistry.getInstrumentation;

/**
 * Created by kiyoung Lee on 2017-05-16.
 */

@RunWith(AndroidJUnit4.class)
public class BackPressCloseTest {

    @Rule
    public ActivityTestRule<LoginActivity> testRule = new ActivityTestRule<LoginActivity>(LoginActivity.class);

    @Test
    public void onBackPressTest(){
        getInstrumentation().runOnMainSync(new Runnable() {
            @Override
            public void run() {
                BackPressClose handler = new BackPressClose(testRule.getActivity());
                handler.onBackPressed("TestMsg");
            }
        });
    }

    @Test
    public void onBackPress_MsgNull_Test(){
        getInstrumentation().runOnMainSync(new Runnable() {
            @Override
            public void run() {
                BackPressClose handler = new BackPressClose(testRule.getActivity());
                handler.onBackPressed(null);
            }
        });
    }
}
