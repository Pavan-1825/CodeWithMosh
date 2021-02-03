package com.coding.InterviewQuestions.ArraysAndStrings;


public class IsUnique {

    public boolean isUniqueChars(String input) {
        char[] inputArray = input.toCharArray();
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = i + 1; j < inputArray.length; j++) {
                if (inputArray[i] == inputArray[j])
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        IsUnique isUnique = new IsUnique();
        String input = "abcdle";
        System.out.println(isUnique.isUniqueChars(input));
    }
}
