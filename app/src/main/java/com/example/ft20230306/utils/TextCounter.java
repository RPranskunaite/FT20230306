package com.example.ft20230306.utils;

public class TextCounter {
    public static String getCharsCount(String inputSting) {
        if(inputSting != null) {
            return String.valueOf(inputSting.length());
        }
        return "0";
    }

    public static String getWordCount(String inputString) throws Exception {
        throw new Exception("NotImplemented!!!");
    }
    public static String getWordsCount(String inputSting) {
        if (inputSting != null) {
            return String.valueOf(inputSting.length());
        }
        return "0";
    }
}
