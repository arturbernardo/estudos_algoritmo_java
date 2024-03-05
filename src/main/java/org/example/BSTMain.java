package org.example;

public class BSTMain {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree(1);

        bst.insert(5);
        bst.insert(7);

        System.out.println("Found: " + bst.contains(5));
    }
}
