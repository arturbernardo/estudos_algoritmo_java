package org.example;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(1);
        linkedList.append(5);
        linkedList.append(3);
        linkedList.prepend(100);
        linkedList.append(2);
        linkedList.prepend(200);

        Node removedA = linkedList.removeLast();
        Node removedB = linkedList.removeLast();
        linkedList.append(81);
        linkedList.append(82);
        linkedList.prepend(99);
        linkedList.removeFirst();
        linkedList.removeFirst();


        printAll(linkedList);

        System.out.println("Removed");
        System.out.println(removedA.value);
        System.out.println(removedB.value);

        System.out.println("GET");
        System.out.println(linkedList.get(3).value);
        System.out.println(linkedList.get(0).value);
        System.out.println(linkedList.get(4).value);
        System.out.println(linkedList.get(20));

        System.out.println("SET");
        linkedList.set(999, 1);
        linkedList.set(998, 0);
        linkedList.set(993, 3);
        printAll(linkedList);

        System.out.println("INSERT");
        linkedList.insert(0, 880);
        linkedList.insert(1, 881);
        linkedList.insert(6, 886);
        linkedList.insert(8, 888);
        linkedList.insert(10, 889);
        linkedList.insert(1000, 1000);
//        printAll(linkedList);


        LinkedList linkedListB = new LinkedList(8);
        System.out.println("Removed L");
        System.out.println(linkedListB.removeLast().value);
        System.out.println(linkedListB.removeLast());

        LinkedList linkedListC = new LinkedList(8);
        System.out.println("Removed F");
        System.out.println(linkedListC.removeFirst().value);
        System.out.println(linkedListC.removeFirst());

        System.out.println("Removed by index");
        LinkedList linkedListD = new LinkedList(8);
        linkedListD.append(5);
        linkedListD.append(3);
        linkedListD.prepend(100);
        linkedListD.append(2);
        linkedListD.prepend(200);
        System.out.println(linkedListD.remove(0).value);
        System.out.println(linkedListD.remove(8));
        System.out.println(linkedListD.remove(3));

        printAll(linkedListD);

    }


    private static void printAll(LinkedList linkedList) {
        Node temp = linkedList.head;
        for (int i =0; i< linkedList.length; i++) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
}