package com.coding.queues;

import java.util.Arrays;

public class PreriotyQueue {

    private int[] list = new int[5];
    private int count = 0;

    public void add(int element) {
        if (isFull()) {
            throw new IllegalStateException();
        }
        int i = shiftItemsToInsert(element);
        list[i] = element;
        count++;
    }

    public int remove() {
        if (isEmpty()) {
            throw new IllegalStateException();
        }
        return list[--count];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public int peek() {
        int listCount = count;
        return list[--listCount];
    }

    @Override
    public String toString() {
        return Arrays.toString(list);
    }

    private int shiftItemsToInsert(int element) {
        int i;
        for (i = count - 1; i >= 0; i--) {
            if (list[i] > element) {
                list[i + 1] = list[i];
            } else {
                break;
            }
        }
        return ++i;
    }

    public boolean isFull(){
        return count == list.length;
    }

}
