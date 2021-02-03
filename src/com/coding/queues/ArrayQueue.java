package com.coding.queues;

import java.util.Arrays;

/*Queues follows first In first out(FIFO)*/
public class ArrayQueue {

    private int[] list = new int[5];
    int count = 0;
    int front = 0;
    int rear = 0;

    public void enqueue(int element) {
        if (count == list.length) {
            throw new IllegalStateException();
        }
        list[rear] = element;
        //this reminder connect the rear to begining if the list have space
        // this is called circular Array(connecting rear index of the array to begining)
        rear = (rear + 1) % list.length;
        count++;
    }

    public int dequeue() {
        int item = list[front];
        list[front] = 0;
        // we move the pointer when
        //->dequeue called and inserted(enqueue) and element
        front = (front +1) % list.length;
        count--;
        return item;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public int peek() {
        return list[--rear];
    }

    @Override
    public String toString() {
        return Arrays.toString(list);
    }
}
