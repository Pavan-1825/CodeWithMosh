package com.coding.stacks;

public class StacksTest {

    public static void main(String[] args) {
        Stacks stacks = new Stacks();
        Stacks stacks2 = new Stacks();
        stacks.push(10);
        stacks.push(20);
        stacks.push(30);
        stacks.push(5);
        stacks.push(220);
        stacks.push(420);
        stacks.push(2420);
        stacks.push(2230);
        stacks.push(1230);
        stacks.push(132230);
        System.out.println(stacks.isFull());

        stacks.pop();
        stacks.pop();
        System.out.println(stacks.min());
    }
}
