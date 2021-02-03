package com.coding.InterviewQuestions.ArraysAndStrings;

public class OneAway {

    public static boolean isOneEditAway(String str1, String str2){

        char[] firstStringChar = str1.toCharArray();
        char[] secondStringChar = str2.toCharArray();
        int i = 0;
        int j = 0;
        boolean oneEdit = true;
        while(oneEdit){

            if(firstStringChar[i++] != secondStringChar[j++]){
                oneEdit = false;
            }
        }
        return oneEdit;
    }
}
