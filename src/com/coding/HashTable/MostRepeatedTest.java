package com.coding.HashTable;

public class MostRepeatedTest {

    public static void main(String[] args) {
        MostRepeated mr = new MostRepeated();
        int[] list = {1, 2, 2, 3, 3, 3, 4,4,4,4,4};
        System.out.println("most repeated number: " +mr.mostFrequent(list));
    }
}
