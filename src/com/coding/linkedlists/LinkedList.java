package com.coding.linkedlists;

import java.util.NoSuchElementException;

public class LinkedList<E> {

    private Node first;
    private Node last;
    private Node reverse;
    private int size;

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public void addFrist(int value) {
        Node node = new Node(value);
        if (isEmpty()) {
            first = last = node;
        } else {
            node.next = first;
            first = node;
        }
        size++;
    }

    private boolean isEmpty() {
        return first == null;
    }

    public void addLast(int value) {
        Node node = new Node(value);
        if (isEmpty()) {
            first = last = node;
        } else {
            last.next = node;
            last = node;
        }
        size++;
    }

    public int indexOf(int value) {
        int index = 0;
        // check is the list empty
        if (isEmpty()) {
            throw new NoSuchElementException();
        } else {
            // loop until find index of the value
            Node current = first;
            while (current != null) {
                if (current.value == value) {
                    return index;
                }
                current = current.next;
                index++;
            }
        }
        // if no value present return -1;
        return -1;
    }

    public boolean contains(int value) {
        return indexOf(value) != -1;
    }

    public void removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        if (first == last) {
            first = last = null;
        } else {
            Node node = first.next;
            first.next = null;
            first = node;
        }
        size--;
    }

    public void removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        if (first == last) {
            first = last = null;
        } else {
            Node previousLastNode = getlastNode(last);
            last = previousLastNode;
            last.next = null;
        }
        size--;
    }

    private Node getlastNode(Node lastNode) {
        Node current = first;
        while (current != null) {
            if (current.next == lastNode) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    // with this approch the time complexity is O(1)
    // if we go traversing list time complexity goes to O(n)
    public int size() {
        return size;
    }

    public int[] toArray() {
        int[] array = new int[size];
        Node current = first;
        int index = 0;
        while (current != null) {
            // index++ will increament same time
            array[index++] = current.value;
            current = current.next;
        }
        return array;
    }

    public void reverse() {
        if (isEmpty()) {
            return;
        }
        // f          l
        // 10 -> 20 ->30   10<-20 <-30     10 <- 20 <- 30
        // P     C    N         p   c   n               p    c   n  // loop until current becomes null;
        // after reverse first becomes last and last becomes first
        // l          f
        // 10 <- 20 <- 30
        Node previous = first;
        Node current  = first.next;
        while(current != null){
            Node next = current.next;
            current = previous;
            previous = current;
            current = next;
        }
        last = first;
        last.next = null;// since last node should not have reference;
        first = previous;

    }

    /*
    *Find the Kth node from the end ie. it returns the value from the end
    *  */
    public int getKthFromTheEnd(int k){
        if (isEmpty()) {
            throw new IllegalStateException();
        }
        if(k == size){
            return last.value;
        }
        Node firstPointNode = first;
        Node lastPointNode = first;
        //first we put lastPOintNode in a distance of fPN (k-1)-> lPN
        for(int i = 0; i< k-1; i++){
            lastPointNode = lastPointNode.next;
            if(lastPointNode == null){
                throw new IllegalArgumentException();
            }
        }
        //loop until lPN is at last of linkedList
        while(lastPointNode != last){
            firstPointNode = firstPointNode.next;
            lastPointNode = lastPointNode.next;
        }
        // Now the fPN value is at kth position, then return the value
        return firstPointNode.value;
    }

    public int printMiddle(){
        if (isEmpty()) {
            throw new IllegalStateException();
        }
        if(first == last){
            return first.value;
        }

        Node middle = first;
        Node finalNode = first;

        // we make finalNode to increase twice and middle to one in each itaration
        while(finalNode != last && finalNode.next != last){
            finalNode = finalNode.next.next;
            middle = middle.next;
        }
        return middle.value;
    }
}
