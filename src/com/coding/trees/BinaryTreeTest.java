package com.coding.trees;

public class BinaryTreeTest {

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.insert(7);
        bt.insert(4);
        bt.insert(9);
        bt.insert(1);
        bt.insert(6);
        bt.insert(8);
        bt.insert(10);
        bt.insert(15);
        bt.insert(11);

        boolean val = bt.find(117);
        System.out.println(val);
    }
}
