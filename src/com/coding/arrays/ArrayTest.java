package com.coding.arrays;

public class ArrayTest {

    public static void main(String[] args){
        Array array = new Array(3);
        array.insert(10);
        array.insert(20);
        array.insert(30);
        array.insert(40);

        array.reverse();
        for(int i = 0; i < array.length() ; i++){
            System.out.println("List : " +array.indexValue(i));
        }

        array.insertAt(3, 55);

        for(int i = 0; i < array.length() ; i++){
            System.out.println("New List : " +array.indexValue(i));
        }
        /*
        boolean isRemoved = array.removeAt(20);
        System.out.println("\nDoes item removed from index ="+ isRemoved + " because the list doesn't contain that index\n");
        for(int i = 0; i < array.size ; i++){
            System.out.println("List after removed: " +array.indexValue(i));
        }

        int indexOfValue = array.indexOf(40);
        if( indexOfValue == -1){
            System.out.println("Value is not presented in the list!");
        }else {
            System.out.println("\nindex of the value is: "+ indexOfValue );
        }*/
    }
}

