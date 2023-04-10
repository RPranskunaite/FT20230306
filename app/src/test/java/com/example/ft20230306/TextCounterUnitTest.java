package com.example.ft20230306;

import org.junit.Test;

import static org.junit.Assert.*;

import com.example.ft20230306.utils.TextCounter;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class TextCounterUnitTest {
    @Test
    public void getCharsCount_WhenEmptyString_IsGiven_ResultZero() {
        String givenValue = "";
        String expectedValue = "0";
        String actualValue = TextCounter.getCharsCount(givenValue);
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void getCharsCount_WhenNullString_IsGiven_ResultZero() {
        String givenValue = null;
        String expectedValue = "0";
        String actualValue = TextCounter.getCharsCount(givenValue);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getCharsCount_WhenFiveCharsString_IsGiven_ResultFive() {
        String givenValue = "12345";
        String expectedValue = "5";
        String actualValue = TextCounter.getCharsCount(givenValue);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getWordsCount_WhenEmptyString_IsGiven_ResultZero() throws Exception {
        String givenValue = "";
        String expectedValue = "0";
        String actualValue = TextCounter.getWordsCount(givenValue);
        assertEquals(expectedValue, actualValue);
    }
}

