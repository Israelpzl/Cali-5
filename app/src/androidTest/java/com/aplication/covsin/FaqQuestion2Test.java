package com.aplication.covsin;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import com.aplication.covsin.app.ui.faq.Faq2Activity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class FaqQuestion2Test {
    @Rule
    public ActivityTestRule<Faq2Activity> mActivityRule =
            new ActivityTestRule<>(Faq2Activity.class);

    @Test
    public void testSwitch1() {
        onView(withId(R.id.faqPregunta1))
               .perform(click());
        onView(withId(R.id.button2))
                .perform(click());
        onView((withId(R.id.faqRespuesta3))).check(matches(withText(R.string.textoPreguntaMenu1)));
    }

    @Test
    public void testSwitch2() {
        onView(withId(R.id.faqPregunta2))
                .perform(click());
        onView(withId(R.id.button2))
                .perform(click());
        onView((withId(R.id.faqRespuesta3))).check(matches(withText(R.string.textoPreguntaMenu2)));
    }
    @Test
    public void testSwitch3() {
        onView(withId(R.id.faqPregunta3))
                .perform(click());
        onView(withId(R.id.button2))
                .perform(click());
        onView((withId(R.id.faqRespuesta3))).check(matches(withText(R.string.textoPreguntaMenu3)));
    }
    @Test
    public void testSwitch4() {
        onView(withId(R.id.faqPregunta4))
                .perform(click());
        onView(withId(R.id.button2))
                .perform(click());
        onView((withId(R.id.faqRespuesta3))).check(matches(withText(R.string.textoPreguntaMenu4)));
    }
    @Test
    public void testSwitch5() {
        onView(withId(R.id.faqPregunta5))
                .perform(click());
        onView(withId(R.id.button2))
                .perform(click());
        onView((withId(R.id.faqRespuesta3))).check(matches(withText(R.string.textoPreguntaMenu5)));
    }
    @Test
    public void testSwitch6() {
        onView(withId(R.id.faqPregunta6))
                .perform(click());
        onView(withId(R.id.button2))
                .perform(click());
        onView((withId(R.id.faqRespuesta3))).check(matches(withText(R.string.textoPreguntaMenu6)));
    }

    @Test
    public void testSwitch61() {
        onView(withId(R.id.faqPregunta6))
                .perform(click());
        onView(withId(R.id.faqPregunta1))
                .perform(click());
        onView(withId(R.id.button2))
                .perform(click());
        onView((withId(R.id.faqRespuesta3))).check(matches(withText(R.string.textoPreguntaMenu1)));
    }
}
