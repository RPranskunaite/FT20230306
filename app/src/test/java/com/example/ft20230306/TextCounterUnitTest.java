package com.example.ft20230306;

import org.junit.Test;

import static org.junit.Assert.*;

import com.example.ft20230306.utils.TextCounter;

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
    @Test
    public void getWordsCount_Given_EmptyString_Result_Zero() {
        String givenValue = "";
        String expectedValue = "0";
        String actualValue = TextCounter.getWordsCount(givenValue);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getWordsCount_Given_SpacesString_Result_Four() {
        String givenValue = "    ";
        String expectedValue = "0";
        String actualValue = TextCounter.getWordsCount(givenValue);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getWordsCount_Given_NormalString_Result_Fifteen() {
        String givenValue = "Testing program";
        String expectedValue = "2";
        String actualValue = TextCounter.getWordsCount(givenValue);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getWordsCount_Given_NumberString_Result_Ten() {
        String givenValue = "0123456789";
        String expectedValue = "0";
        String actualValue = TextCounter.getWordsCount(givenValue);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getWordsCount_Given_SymbolString_Result_Five() {
        String givenValue = "/*-+.";
        String expectedValue = "0";
        String actualValue = TextCounter.getWordsCount(givenValue);
        assertEquals(expectedValue, actualValue);
    }
}


