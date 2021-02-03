package com.coding.queues;

public class QueueWithTwoStacksTest {

    public static void main(String[] args) {
        QueueWithTwoStacks sq = new QueueWithTwoStacks();
        sq.enqueue(10);
        sq.enqueue(20);
        sq.enqueue(30);
        sq.dequeue();
        sq.dequeue();
        System.out.println(sq.isEmpty());
        System.out.println(sq.toString());
    }
}
