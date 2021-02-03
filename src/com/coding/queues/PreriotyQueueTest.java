package com.coding.queues;

import java.util.Arrays;

public class PreriotyQueueTest {

    public static void main(String[] args) {
        PreriotyQueue pq = new PreriotyQueue();
        pq.add(5);
        pq.add(1);
        pq.add(3);
        pq.add(4);
        pq.add(2);
        System.out.println(pq.toString());

        System.out.println(pq.peek());
        System.out.println(pq.toString());
        System.out.println(pq.isEmpty());
    }
}
