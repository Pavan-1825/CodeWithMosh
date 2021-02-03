package com.coding.HashTable;

import java.util.Arrays;

public class TwoIndicesSumTest {

    public static void main(String[] args) {
        TwoIndicesSumm tsm = new TwoIndicesSumm();
        int[] list = {2, 7, 11, 15};
        int[] indices = tsm.twoSum(list, 9  );
        for(int i : indices) {
            System.out.println(i);
        }
    }
}
