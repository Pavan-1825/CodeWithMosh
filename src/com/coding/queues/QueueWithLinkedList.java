package com.coding.queues;

public class QueueWithLinkedList {

    private Node head;
    private Node tail;
    private int count;

    private class Node {
        private int element;
        private Node next;

        public Node(int element) {
            this.element = element;
        }
    }

    public void enqueue(int item) {
        Node node = new Node(item);
        if (head == null) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        count++;
    }

    public int dequeue() {
        if (head == tail) {
            head = null;
            return head.element;
        }
        int value = head.element;
        Node second = head.next;
        head = second;
        --count;
        return value;
    }

    public int[] listOfElements() {
        Node node = head;
        int[] list = new int[count];
        int size = count;
        int i = 0;
        while (size > 0) {
            list[i++] = node.element;
            node = node.next;
            size--;
        }
        return list;
    }

    public int peek(){
        return head.element;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public int size(){
        return count;
    }
}
