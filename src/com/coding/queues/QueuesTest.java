package com.coding.queues;

import javax.swing.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class QueuesTest {

    public static void main(String[] args) {
        Queue<Integer> integers = new ArrayDeque<>();
        integers.add(10);
        integers.add(20);
        integers.add(30);

        ArrayQueue aq = new ArrayQueue();
        aq.enqueue(10);
        aq.enqueue(20);
        aq.enqueue(30);
        aq.enqueue(40);
        aq.enqueue(50);

        //System.out.println("peek:" +aq.peek());
        //System.out.println(aq.isEmpty());
        aq.dequeue();
        aq.dequeue();

        System.out.println(aq.toString());
        aq.enqueue(60);
        aq.enqueue(70);
        System.out.println(aq.toString());

        System.out.println(aq.peek());
        System.out.println(aq.toString());
        //System.out.println(reverse(integers).toString());
    }

    //Interview question
    public static Queue<Integer> reverse(Queue<Integer> queue){
        if (queue.isEmpty()) {
            throw new IllegalStateException();
        }
        Queue<Integer> reversed = new ArrayDeque<>();
        Stack<Integer> stack  = new Stack<>();
        while(!queue.isEmpty()){
            stack.add(queue.remove());
        }
        while (!stack.empty()){
            reversed.add(stack.pop());
        }
        return reversed;
    }
}
