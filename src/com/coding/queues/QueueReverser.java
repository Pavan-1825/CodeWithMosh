package com.coding.queues;

import java.util.Stack;

public class QueueReverser {

    public void reverse(int[] q, int k) {
        int count = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < k; i++) {
            stack.push(q[i]);
        }
        while (!stack.isEmpty()) {
            q[count++] = stack.pop();
        }
    }
}
