package com.coding.queues;

import java.util.Arrays;

public class QueueReverserTest {

    public static void main(String[] args) {
        QueueReverser reverser = new QueueReverser();
        int[] list = new int[5];
        list[0] = 10;
        list[1] = 20;
        list[2] = 30;
        list[3] = 40;
        list[4] = 50;
        System.out.println(Arrays.toString(list));
        reverser.reverse(list, 3);
        System.out.println(Arrays.toString(list));
    }
}
