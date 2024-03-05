package org.example;

public class LinkedList {
    Node head;
    Node tail;
    int length;

    public LinkedList() {
        head = null;
        tail = null;
    }
    public LinkedList(int value) {
        Node node = new Node(value);
        head = node;
        tail = node;
        length++;
    }

    public void append(int value) {
        Node node = new Node(value);
        if (length == 0) {
            head = node;
        } else {
            Node temp = tail;
            temp.next = node;
        }
        tail = node;

        length++;
    }

    public void reverse() {
        Node temp = head;
        head = tail;
        tail = temp;
        Node after = temp.next;
        Node before = null;
        for (int i = 0; i < length; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }

    public Node remove(int index) {
        if (index < 0 || index > length)
            return null;
        if (index == 0) {
            return removeFirst();
        }
        if (index == length) {
            return removeLast();
        }

        Node prev = get(index-1);
        Node temp = prev.next;

        prev.next = temp.next;
        temp.next = null;
        length--;
        return temp;

    }

    public boolean insert(int index, int value) {
        if (index < 0 || index > length)
            return false;
        if (index == 0) {
            prepend(value);
            return true;
        }
        if (index == length) {
            append(value);
            return true;
        }

        Node newNode = new Node(value);
        Node temp = get(index - 1);

        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }

    public boolean set(int value, int pos) {
        Node temp = get(pos);
        if (temp != null) {
            temp.value = value;
            return true;
        }

        return false;
    }

    public Node get(int pos) {
        if (pos == length) {
            return tail;
        }

        Node temp = head;
        for (int i = 0; i < pos; i++) {
            if (temp.next != null) {
                temp = temp.next;
            } else {
                return null;
            }
        }

        return temp;
    }

    public void prepend(int value) {
        Node node = new Node(value);
        if (length == 0) {
            tail = node;
            head = node;
        } else {
            Node temp = head;
            head = node;
            head.next = temp;
        }

        length++;
    }

    public Node removeFirst() {
        Node temp = head;
        if (length == 0){
            return null;
        }
        if (length == 1) {
            temp = head;
            head = null;
            tail = null;
            length--;
            return temp;
        }

        length--;
        head = head.next;
        return temp;
    }

    public Node removeLast() {
        Node temp;
        if (length == 0){
            return null;
        }
        if (length == 1) {
            temp = head;
            head = null;
            tail = null;
            length--;
            return temp;
        }

        Node oneToLast;
        temp = head;
        while (temp.next != null) {
            oneToLast = temp;
            temp = temp.next;
            if (temp == tail) {
                oneToLast.next = null;
                tail = oneToLast;
            }
        }
        length--;
        return temp;
    }


}
