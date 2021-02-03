package com.coding.HashTable;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeated {

    public Character firstNonRepeatedCharInString(String input) {
        char[] inputInChar = input.toCharArray();
        boolean isRepeated = false;
        char repeatedChar = 0;
        for (int i = 0; i < inputInChar.length; i++) {
            for (int j = i + 1; j < inputInChar.length; j++) {
                if (inputInChar[i] == inputInChar[j]) {
                    isRepeated = true;
                    break;
                }
                if (inputInChar[i] != inputInChar[j]) {
                    isRepeated = false;
                }
            }
            if (!isRepeated) {
                repeatedChar = inputInChar[i];
                break;
            }
        }
        return repeatedChar;
    }

    public Character findChar(String input) {
        Map<Character, Integer> map = new HashMap<>();
        for (Character ch : input.toCharArray()) {
            int count = map.containsKey(ch) ? map.get(ch) : 0;
            map.put(ch, count + 1);
        }
        for (Character ch : input.toCharArray()) {
            if (map.get(ch) == 1) {
                return ch;
            }
        }
        // MIN.Value is a nothing, non existing charter
        return Character.MIN_VALUE;
    }
}
