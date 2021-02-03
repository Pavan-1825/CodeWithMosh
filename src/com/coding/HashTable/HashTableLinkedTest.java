package com.coding.HashTable;


public class HashTableLinkedTest {
    public static void main(String[] args) {
        HashTableLinkedList hashTable = new HashTableLinkedList();
        hashTable.put(6, "a");
        hashTable.put(8, "b");
        hashTable.put(11, "c");
        hashTable.put(13,"d");
        hashTable.put(10, "e");

        System.out.println(hashTable.get(13));
        hashTable.remove(13);
        hashTable.remove(13);
        System.out.println(hashTable.get(13));
    }
}
