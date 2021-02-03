package com.coding.HashTable;

public class TwoIndicesSumm {

    public int[] twoSum(int[] list, int target){
        int[] index = new int[list.length];
        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if ((list[i] + list[j]) == target) {
                    index[i] = i;
                    index[j] = j;
                }
            }
        }
        return index;
    }
}
