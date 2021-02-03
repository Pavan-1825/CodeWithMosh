package com.coding.HashTable;


import java.util.LinkedList;

public class HashTableLinkedList {

    private LinkedList<Entry>[] linkedList = new LinkedList[5];
    private Entry entry;

    private class Entry {
        private int key;
        private String value;

        public Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    public void put(int key, String value) {
        entry = new Entry(key, value);
        int index = hash1(key);
        if (linkedList[index] == null) {
            linkedList[index] = new LinkedList<>();
        }
        LinkedList<Entry> entries = linkedList[index];
        for (Entry entry : entries) {
            //If the key is same in the index we'll just update the value
            if (entry.key == key) {
                entry.value = value;
                return;
            }
        }
        //if the different key got
        entries.addLast(entry);
    }

    public String get(int key) {
        return getEntry(key) != null ? getEntry(key).value : null;
    }


    public void remove(int key) {
        if (getEntry(key) != null) {
            getEntries(key).remove(getEntry(key));
            return;
        }
        throw new IllegalStateException();
    }

    private int hash1(int key) {
        int hash1 = key % linkedList.length;
        return hash1;
    }

    private LinkedList<Entry> getEntries(int key) {
        int index = hash1(key);
        return linkedList[index] != null ? linkedList[index] : null;

    }

    private Entry getEntry(int key) {
        LinkedList<Entry> entries = getEntries(key);
        if (entries != null) {
            for (Entry entry : entries) {
                if (entry.key == key) {
                    return entry;
                }
            }
        }
        return null;
    }
}
