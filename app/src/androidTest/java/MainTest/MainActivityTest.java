package MainTest;

import android.content.Intent;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.example.mvp_sample.Main.MainActivity;
import com.example.mvp_sample.R;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.hasDescendant;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by kiyoung Lee on 2017-05-28.
 */

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> testRule = new ActivityTestRule<MainActivity>(MainActivity.class);

    @Before
    public void setUp(){
        Intent intent = new Intent();
        testRule.launchActivity(intent);
    }

    public static RecyclerViewMatcher withRecyclerView(final int recyclerViewId) {
        return new RecyclerViewMatcher(recyclerViewId);
    }

    @Test
    public void alram_InitContents_Test() throws InterruptedException {
        onView(withId(R.id.main_list))
                .check(matches(TextMatcher.atPosition(0, hasDescendant(withText("test1")))));
        onView(withId(R.id.main_list))
                .check(matches(TextMatcher.atPosition(1, hasDescendant(withText("test2")))));
        onView(withId(R.id.main_list))
                .check(matches(TextMatcher.atPosition(2, hasDescendant(withText("test3")))));
        onView(withId(R.id.main_list))
                .check(matches(TextMatcher.atPosition(3, hasDescendant(withText("test4")))));
        onView(withId(R.id.main_list))
                .check(matches(TextMatcher.atPosition(4, hasDescendant(withText("test5")))));
    }
}
