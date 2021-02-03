package com.coding.HashTable;

public class CountPairTest {

    public static void main(String[] args) {
        CountPair cp = new CountPair();
        int[] list = {1, 7, 5, 9, 2, 12, 3};
        System.out.println(cp.countPairWithDiff(list, 2));
    }
}
