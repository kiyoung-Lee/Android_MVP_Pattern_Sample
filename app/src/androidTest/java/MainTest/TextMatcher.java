package MainTest;

import android.content.res.Resources;
import android.support.annotation.NonNull;
import android.support.test.espresso.matcher.BoundedMatcher;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

import static android.support.test.espresso.core.deps.guava.base.Preconditions.checkArgument;
import static android.support.test.espresso.core.deps.guava.base.Preconditions.checkNotNull;
import static android.support.test.espresso.core.deps.guava.base.Predicates.equalTo;

/**
 * Created by kiyoung Lee on 2017-05-22.
 */

public class TextMatcher {
    public static Matcher<Object> withItemText(String itemText) {
        // use preconditions to fail fast when a test is creating an invalid matcher.
        checkArgument(!(itemText.equals(null)));
        return withItemText((Matcher<String>) equalTo(itemText));
    }

    public static Matcher<Object> withItemText(final Matcher<String> matcherText) {
        // use preconditions to fail fast when a test is creating an invalid matcher.
        checkNotNull(matcherText);
        return new TypeSafeMatcher<Object>() {

            @Override
            public void describeTo(Description description) {
                description.appendText("expected text: " + matcherText);
            }

            @Override
            public void describeMismatchSafely(Object item, Description mismatchDescription) {
                mismatchDescription.appendText("actual text: " + item.toString());
            }

            @Override
            public boolean matchesSafely(Object item) {
                return matcherText.equals(item);
            }
        };
    }

    public static Matcher<View> atPosition(final int position, @NonNull final Matcher<View> itemMatcher) {
        checkNotNull(itemMatcher);
        return new BoundedMatcher<View, RecyclerView>(RecyclerView.class) {
            @Override
            public void describeTo(Description description) {
                description.appendText("has item at position " + position + ": ");
                itemMatcher.describeTo(description);
            }

            @Override
            protected boolean matchesSafely(final RecyclerView view) {
                RecyclerView.ViewHolder viewHolder = view.findViewHolderForAdapterPosition(position);
                if (viewHolder == null) {
                    // has no item on such position
                    return false;
                }
                return itemMatcher.matches(viewHolder.itemView);
            }
        };
    }

    public static Matcher<View> withText(final int resourceId) {

        return new BoundedMatcher<View, TextView>(TextView.class) {
            private String resourceName = null;
            private String expectedText = null;

            @Override
            public void describeTo(Description description) {
                description.appendText("with string from resource id: ");
                description.appendValue(resourceId);
                if (null != this.resourceName) {
                    description.appendText("[");
                    description.appendText(this.resourceName);
                    description.appendText("]");
                }
                if (null != this.expectedText) {
                    description.appendText(" value: ");
                    description.appendText(this.expectedText);
                }
            }

            @Override
            public boolean matchesSafely(TextView textView) {
                if (null == this.expectedText) {
                    try {
                        this.expectedText = textView.getResources().getString(
                                resourceId);
                        this.resourceName = textView.getResources()
                                .getResourceEntryName(resourceId);
                    } catch (Resources.NotFoundException ignored) {
                    /*
                     * view could be from a context unaware of the resource
                     * id.
                     */
                    }
                }
                if (null != this.expectedText) {
                    return this.expectedText.equals(textView.getText()
                            .toString());
                } else {
                    return false;
                }
            }
        };
    }

    public static RecyclerViewMatcher withRecyclerView(final int recyclerViewId) {
        return new RecyclerViewMatcher(recyclerViewId);
    }
}
