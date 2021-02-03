package com.coding.linkedlists;

public class LinkedListTest {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList();
        list.addFrist(10);
        list.addFrist(20);
        list.addFrist(30);
        list.addFrist(40);
        list.addFrist(50);
       /* System.out.println("Index of value: " + list.contains(20));
        System.out.println("size: " + list.size());
        int[] lAr = list.toArray();
        for (int i = 0; i < lAr.length; i++) {
            System.out.println(lAr[i]);
        }*/
        /*list.reverse();
        int[] reArr = list.toArray();
        for (int i = 0; i < reArr.length; i++) {
            System.out.println("Reversed List: " +lAr[i]);
        }*/

        System.out.println(list.printMiddle());

    }
}
