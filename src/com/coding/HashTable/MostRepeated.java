package com.coding.HashTable;

public class MostRepeated {

    public int mostFrequent(int[] list) {
        int count2 = 0;
        int repeatedNumber = 0;
        for (int i = 0; i < list.length; i++) {
            int count1 = 0;
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] == list[j]) {
                    count1++;
                }
            }
            if (count1 > count2) {
                count2 = count1;
                repeatedNumber = list[i];
            }
        }
        return repeatedNumber;
    }
}
