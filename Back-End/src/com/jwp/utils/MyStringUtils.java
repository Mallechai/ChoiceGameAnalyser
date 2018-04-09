package com.jwp.utils;

public class MyStringUtils {

    public int trimInput(String orig){
        String input = orig.trim();

        int difference = orig.length() - input.length();
        return difference;
    }
}
