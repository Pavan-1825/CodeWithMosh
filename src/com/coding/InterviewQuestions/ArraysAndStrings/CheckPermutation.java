package com.coding.InterviewQuestions.ArraysAndStrings;

import java.util.Arrays;

public class CheckPermutation {

    public static boolean isTwoStringsPermutation(String one, String two) {
        if(one.length() != two.length()){
            return false;
        }
        return sort(one).equals(sort(two));
    }

    private static String sort(String s){
        if(s.isEmpty()){
            throw new IllegalStateException();
        }
        char[] content = s.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }
    public static void main(String[] args) {
        boolean trueValue = isTwoStringsPermutation("abc", "bca");
        boolean falseValue = isTwoStringsPermutation("abc", "bcd");

        System.out.println(trueValue);
        System.out.println(falseValue);
    }
}
