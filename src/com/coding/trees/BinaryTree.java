package com.coding.trees;

public class BinaryTree {

    private class Node {
        private int data;
        private Node leftChild;
        private Node rightChild;

        public Node(int data) {
            this.data = data;
        }
    }

    private Node root;

    public void insert(int element) {

        Node node = new Node(element);
        //If the root node is empty set value in root
        if (root == null) {
            root = node;
            return;
        }

        Node child = root;
        //Iterate until we set the element in childNode and break the loop after setting
        while (true) {
            if (element < child.data) {
                if (child.leftChild == null) {
                    child.leftChild = node;
                    break;
                }
                child = child.leftChild;
            } else {
                if (child.rightChild == null) {
                    child.rightChild = node;
                    break;
                }
                child = child.rightChild;
            }
        }
    }

    public boolean find(int element) {
        if (root == null) {
            throw new IllegalStateException();
        }
        Node child = root;
        while (child != null) {
            if (element < child.data)
                child = child.leftChild;
            else if (element > child.data)
                child = child.rightChild;
            else return true;
        }
        return false;
    }

    /*
    * Breadth First Traversal of Tree(also called level order)
    * In this traversal first visit tree from root, next left and right
    * We traverse tree level by level first we print
    * */
    public void BFT(){
        Node current = root;
        while(current != null) {
            System.out.println(current.data);
            Node nextRoot;
            if(current.leftChild != null){
                System.out.println(current.leftChild.data);

            }
            if(current.rightChild != null){
                System.out.println(current.rightChild.data);
            }
            if(current.leftChild == null && current.rightChild == null){

            }
        }
    }

}
