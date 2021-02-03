package com.coding.queues;

import java.util.Arrays;
import java.util.Stack;

public class QueueWithTwoStacks {

    private Stack<Integer> item1 = new Stack<>();
    private Stack<Integer> item2 = new Stack<>();

    //O(1)
    public void enqueue(int element) {
        item1.push(element);
    }

    //O(n)
    public int dequeue() {
        transferItems();
        return item2.pop();
    }

    public boolean isEmpty() {
        return item1.isEmpty() && item2.isEmpty();
    }

    public int peek() {
        transferItems();
        return item2.peek();
    }

    @Override
    public String toString() {
        return item2.toString();
    }

    private void transferItems(){
        if (item1.isEmpty() && item2.isEmpty()) {
            throw new IllegalStateException();
        }
        while (!item1.isEmpty()) {
            item2.push(item1.pop());
        }
    }
}
