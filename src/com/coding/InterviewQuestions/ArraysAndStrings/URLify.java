package com.coding.InterviewQuestions.ArraysAndStrings;

public class URLify {

    public static String replaceSpaceWithURL(String str) {
        char[] chars = str.toCharArray();
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                count++;
            }
        }
        StringBuilder sb = new StringBuilder();
        while (count >= 3) {
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == ' ' && chars[i + 1] != ' ') {
                    sb.append('%');
                    sb.append('2');
                    sb.append('0');
                } else {
                    sb.append(chars[i]);
                    count--;
                }
                if (count < 3) {
                    break;
                }
            }
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        String str = "Hi my pavan  ";
        String x = replaceSpaceWithURL(str);
        System.out.println(x);
    }
}
