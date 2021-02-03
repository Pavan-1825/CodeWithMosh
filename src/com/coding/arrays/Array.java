package com.coding.arrays;

public class Array {

    private int[] list;
    public int size;
    private int index = 0;

    public Array(int size) {
        list = new int[size];
        this.size = size;
    }

    // The time complexity of this method is O(n)
    public void insert(int data) {
        if (index < list.length) {
            list[index] = data;
            index++;
        } else {
            size += size;
            index = 0;
            int[] incredLi = new int[size];
            for (int i = 0; i < list.length; i++) {
                incredLi[index] = list[i];
                index++;
            }
            incredLi[index] = data;
            list = incredLi;
            index++;
        }
    }

    public int indexValue(int indexAt) {
        return list[indexAt];
    }

    public boolean removeAt(int removeValueAtIndex) {
        if (removeValueAtIndex < list.length) {
            for (int i = removeValueAtIndex ; i < list.length - 1; i++) {
                list[i] = list[i + 1];
            }
            list[list.length - 1] = 0;
            return true;
        } else {
            return false;
        }
    }

    public int indexOf(int value) {
        boolean isIndexFound = false;
        for (int i = 0; i < list.length; i++) {
            if (list[i] == value) {
                isIndexFound = true;
                return i;
            }
        }
        return -1;
    }

    /*Exercise methods below*/

    // the time complexity for this method is O(n)
    public int max(){
        int maxValue = list[0];
        for (int i = 0; i< list.length; i++){
            if(list[i] > maxValue){
                maxValue = list[i];
            }
        }
        return maxValue;
    }

    public void reverse(){
        int[] temp = new int[size];
        for (int i = 0; i < list.length; i++){
            temp[i] = list[--size];
        }
        list = temp;
    }

    public int length(){
        return list.length;
    }

    public void insertAt(int index, int item){
       list[index] = item;
    }
}
