package com.coding.HashTable;

public class CountPair {

    public int countPairWithDiff(int[] list, int diff) {
        int count = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (Math.abs(list[j] - list[i]) == diff) {
                    count++;
                }
            }
        }
        return count;
    }
}
