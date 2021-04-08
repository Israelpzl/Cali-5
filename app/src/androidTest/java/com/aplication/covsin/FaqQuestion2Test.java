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
        onView((withId(R.id.faqRespuesta3))).check(matches(withText("Evitan que contagies, pero te puedes contagiar tu.")));
    }

    @Test
    public void testSwitch2() {
        onView(withId(R.id.faqPregunta2))
                .perform(click());
        onView(withId(R.id.button2))
                .perform(click());
        onView((withId(R.id.faqRespuesta3))).check(matches(withText("Manténgase aislada 14 días a espera de los resultados de la pcr o en " +
                "caso de no poder hacérsela espere por síntomas.")));
    }
    @Test
    public void testSwitch3() {
        onView(withId(R.id.faqPregunta3))
                .perform(click());
        onView(withId(R.id.button2))
                .perform(click());
        onView((withId(R.id.faqRespuesta3))).check(matches(withText("Las investigaciones indican que los niños y los adolescentes tienen las mismas " +
                "probabilidades de infectarse que cualquier otro grupo de edad y pueden " +
                "propagar la enfermedad.")));
    }
    @Test
    public void testSwitch4() {
        onView(withId(R.id.faqPregunta4))
                .perform(click());
        onView(withId(R.id.button2))
                .perform(click());
        onView((withId(R.id.faqRespuesta3))).check(matches(withText("No, pero es cierto que si coincides en diversos sintomas podria ser un indicativo de que padeces covid.")));
    }
    @Test
    public void testSwitch5() {
        onView(withId(R.id.faqPregunta5))
                .perform(click());
        onView(withId(R.id.button2))
                .perform(click());
        onView((withId(R.id.faqRespuesta3))).check(matches(withText("las mascarillas N95,KN95,KF94 o Kf95 son una buena opcion " +
                "las FFP2 tambien pero las FFP3 estan reservadas para personal sanitario.")));
    }
    @Test
    public void testSwitch6() {
        onView(withId(R.id.faqPregunta6))
                .perform(click());
        onView(withId(R.id.button2))
                .perform(click());
        onView((withId(R.id.faqRespuesta3))).check(matches(withText("Si te indentificas con alguno de estos grupos perteneces a la poblacion de " +
                "riesgo personas que tienen más de 60 años, enfermedades cardiovasculares e hipertensión arterial, " +
                "diabetes, enfermedades pulmonares crónicas, cáncer, inmunodepresión, embarazo.")));
    }

    @Test
    public void testSwitch61() {
        onView(withId(R.id.faqPregunta6))
                .perform(click());
        onView(withId(R.id.faqPregunta1))
                .perform(click());
        onView(withId(R.id.button2))
                .perform(click());
        onView((withId(R.id.faqRespuesta3))).check(matches(withText("Evitan que contagies, pero te puedes contagiar tu.")));
    }

    @Test
    public void testClearTextBox() {
        onView(withId(R.id.faqPregunta1))
                .perform(click());
        onView(withId(R.id.button2))
                .perform(click());
        onView((withId(R.id.faqRespuesta3))).check(matches(withText("")));
    }
}
