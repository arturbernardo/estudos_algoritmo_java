package org.example;

public class BinarySearchTree {

    Node root;

    public BinarySearchTree(int value) {
        root = new Node(value);
    }

    public boolean contains(int value) {
        Node temp = root;
        while(temp != null) {
            if (temp.value < value) {
                temp = temp.right;
            } else if (temp.value > value) {
                temp = temp.left;
            } else {
                return true;
            }
        }

        return false;
    }


    public boolean insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return true;
        }
        Node temp = root;
        while (true) {
            if (newNode.value == temp.value) return false; //breaks
            if (newNode.value < temp.value) {
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;  //breaks
                }
                //keep searching
                temp = temp.left;
            } else {
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;  //breaks
                }
                //keep searching
                temp = temp.right;
            }
        }
    }

    class Node {
        public int value;
        public Node left;
        public Node right;

        Node(int value) {
            this.value = value;
        }
    }
}
