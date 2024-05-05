package com.example.imad_assignment2

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class Code2ActivityTest {

    @Before
    fun setUp() {
        ActivityScenario.launch(Code2::class.java)
    }

    @Test
    fun testFeedButton() {
        onView(withId(R.id.feedButton)).perform(click())
        onView(withId(R.id.hungerCount)).check(matches(withText("Feed count: 1")))
    }

    @Test
    fun testCleanButton() {
        onView(withId(R.id.cleanButton)).perform(click())
        onView(withId(R.id.cleanCount)).check(matches(withText("Clean count: 1")))
    }

    @Test
    fun testPlayButton() {
        onView(withId(R.id.playButton)).perform(click())
        onView(withId(R.id.happyCount)).check(matches(withText("Play count: 1")))
    }

    @Test
    fun testMultipleFeedButton() {
        onView(withId(R.id.feedButton)).perform(click())
        onView(withId(R.id.feedButton)).perform(click())
        onView(withId(R.id.hungerCount)).check(matches(withText("Feed count: 2")))
    }

    // Add more tests as needed
}
