package org.example;

public class MainD {
    public static void main(String[] args) {
        DoubleLinkList linkedList = new DoubleLinkList(1);
        linkedList.append(5);
        linkedList.append(8);
        linkedList.append(1);
        linkedList.removeLast();
        linkedList.prepend(99);
        linkedList.prepend(77);

        printAll(linkedList);

    }


    private static void printAll(DoubleLinkList linkedList) {
        DoubleLinkList.Node temp = linkedList.head;
        for (int i =0; i< linkedList.length; i++) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
}