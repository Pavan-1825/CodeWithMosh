package com.coding.InterviewQuestions.ArraysAndStrings;

import java.util.Arrays;

/*
 * a Palindrome is a string that is the same forward and backwards
 *Permutation is number of ways it can be arranged
 *
 * eg: Input: "Tact coa"
 *     OutPut: True("Taco act") because it is a palindrome
 * */
public class PalindromePermutation {

    public static boolean isPalindromePermutation(String str) {
        int[] table = buildCharFrequencyTable(str);
        return checkMaxOneOdd(table);
    }

    public static int[] buildCharFrequencyTable(String phrase) {
        int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
        for (char c : phrase.toCharArray()) {
            int x = getCharNumber(c);
            if (x != -1) {
                table[x]++;
            }
        }
        return table;
    }

    public static int getCharNumber(char c) {
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int val = Character.getNumericValue(c);
        if (a <= val && val <= z) {
            return val - a;
        }
        return -1;
    }

    public static boolean checkMaxOneOdd(int[] table) {
        boolean foundOdd = false;
        for (int count : table) {
            if (count % 2 == 1) {
                if (foundOdd) {
                    return false;
                }
                foundOdd = true;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "tatat aba";
        System.out.println(isPalindromePermutation(str));
    }
}
