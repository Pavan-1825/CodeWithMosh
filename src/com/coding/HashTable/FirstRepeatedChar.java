package com.coding.HashTable;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatedChar {

    public Character repeatedChar(String input){
        Set<Character> set = new HashSet<>();
        for(Character ch: input.toCharArray()){
            if(set.contains(ch)){
                return ch;
            }
            set.add(ch);
        }
        return Character.MIN_VALUE;
    }
}
