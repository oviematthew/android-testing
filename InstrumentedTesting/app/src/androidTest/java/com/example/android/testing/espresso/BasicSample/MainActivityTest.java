package com.example.android.testing.espresso.BasicSample;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.clearText;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isRoot;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import androidx.test.espresso.action.ViewActions;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith( AndroidJUnit4.class )
@LargeTest
public class MainActivityTest {

    @Rule
    public ActivityScenarioRule< MainActivity> activityScenarioRule
            = new ActivityScenarioRule<>(MainActivity.class);

    private void clearTexts() {

        onView(withId(R.id.editTextUserInput)).perform(clearText());

    }

    @Test
    public void  validateTextView() {
        // Verifies that the initial text in the TextView is "Hello Espresso!"
        onView(withId(R.id.textToBeChanged)).check(matches(withText("Hello Espresso!")));
    }

    @Test
    public void validateEditText() {

        /*
        * Enters "123" into EditText, clicks changeTextBt, checks if TextView displays "123", then clears EditText.
        * Enters "123" into EditText, clicks activityChangeTextBtn, checks if TextView displays "123", presses back, then clears EditText.
        */
        onView(withId(R.id.editTextUserInput)).perform(typeText("123"), closeSoftKeyboard());
        onView(withId(R.id.changeTextBt)).perform(click());
        onView(withId(R.id.textToBeChanged)).check(matches(withText("123")));
        clearTexts();

        onView(withId(R.id.editTextUserInput)).perform(typeText("123"), closeSoftKeyboard());
        onView(withId(R.id.activityChangeTextBtn)).perform(click());
        onView(withId(R.id.show_text_view)).check(matches(withText("123")));
        onView(isRoot()).perform(ViewActions.pressBack());
        clearTexts();

        /*
        * Enters an empty string into EditText, clicks changeTextBt, checks if TextView displays empty string, then clears EditText.
        * Enters an empty string into EditText, clicks activityChangeTextBtn, checks if TextView displays empty string,  presses back, then clears EditText.
        */
        onView(withId(R.id.editTextUserInput)).perform(typeText(""), closeSoftKeyboard());
        onView(withId(R.id.changeTextBt)).perform(click());
        onView(withId(R.id.textToBeChanged)).check(matches(withText("")));
        clearTexts();

        onView(withId(R.id.editTextUserInput)).perform(typeText(""), closeSoftKeyboard());
        onView(withId(R.id.activityChangeTextBtn)).perform(click());
        onView(withId(R.id.show_text_view)).check(matches(withText("")));
        onView(isRoot()).perform(ViewActions.pressBack());
        clearTexts();

        /*
        * Enters "GroupNine" into EditText, clicks changeTextBt, checks if TextView displays "GroupNine", then clears EditText.
        * Enters "GroupNine" into EditText, clicks activityChangeTextBtn, checks if TextView displays "GroupNine", presses back, then clears EditText.
        */
        onView(withId(R.id.editTextUserInput)).perform(typeText("GroupNine"), closeSoftKeyboard());
        onView(withId(R.id.changeTextBt)).perform(click());
        onView(withId(R.id.textToBeChanged)).check(matches(withText("GroupNine")));
        clearTexts();

        onView(withId(R.id.editTextUserInput)).perform(typeText("GroupNine"), closeSoftKeyboard());
        onView(withId(R.id.activityChangeTextBtn)).perform(click());
        onView(withId(R.id.show_text_view)).check(matches(withText("GroupNine")));
        onView(isRoot()).perform(ViewActions.pressBack());
        clearTexts();



    }



}
