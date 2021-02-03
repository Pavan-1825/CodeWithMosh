package com.coding.stacks;

import java.util.Arrays;

public class Stacks {

    private int[] stack = new int[10];
    private int count = 0;
    private int minValue = 0;

    public void push(int elment) {
        if (count != stack.length) {
            if (count == 0 || elment < minValue) {
                minValue = elment;
            }
            stack[count++] = elment;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public int pop() {
        if (count == 0) {
            throw new IllegalStateException();
        }
        int removed = stack[--count];
        stack[count] = 0;
        if (removed == minValue) {
            minValue = stack[0];
            for (int min : stack) {
                if (min < minValue && min != 0) {
                    minValue = min;
                }
            }
        }
        return removed;
    }

    public int peek() {
        int last = count;
        return stack[--last];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public String toString() {
        return "Stacks{" +
                "stack=" + Arrays.toString(stack) +
                '}';
    }

    public int min() {
        return minValue;
    }

    public boolean isFull(){
        return count == stack.length;
    }
}
