package org.example;

public class DoubleLinkList {

    Node head;
    Node tail;
    int length;

    DoubleLinkList(int value) {
        Node node = new Node(value);
        head = node;
        tail = node;
        length++;
    }

    public Node append(int value) {
        Node node = new Node(value);
        Node temp = tail;
        temp.next = node;
        node.prev = tail;
        tail = node;
        length++;
        return tail;
    }

    public Node removeLast() {
        Node temp = tail;
        Node newTail = tail.prev;
        temp.prev = null;
        newTail.next = null;
        length--;
        return temp;
    }

    public Node prepend(int value) {
        Node newHead = new Node(value);
        Node temp = head;
        temp.prev = newHead;
        newHead.next = temp;
        head = newHead;
        length++;
        return head;
    }


    class Node {
        Node next;
        Node prev;
        int value;

        Node(int value) { this.value = value; }
    }
}
