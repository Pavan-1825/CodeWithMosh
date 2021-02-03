package com.coding.queues;

import java.util.Arrays;

public class QueueWithLinkedListTest {

    public static void main(String[] args) {
        QueueWithLinkedList list = new QueueWithLinkedList();
        list.enqueue(10);
        list.enqueue(20);
        list.enqueue(30);
        list.enqueue(40);
        System.out.println(Arrays.toString(list.listOfElements()));
        System.out.println(list.dequeue());
        System.out.println(Arrays.toString(list.listOfElements()));
    }
}
