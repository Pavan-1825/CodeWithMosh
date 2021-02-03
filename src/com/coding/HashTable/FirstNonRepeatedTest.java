package com.coding.HashTable;

public class FirstNonRepeatedTest {

    public static void main(String[] args) {
        FirstNonRepeated fNR = new FirstNonRepeated();
        String apple = "a grgesen apple";
        char ch = fNR.firstNonRepeatedCharInString(apple);
        char chr = fNR.findChar(apple);
        System.out.println(chr);

    }
}

