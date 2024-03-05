package org.example;

public class BubbleSortB {

    public static void main(String[] args) {
        int[] vector = {-9,1,5,2,0,7,9,1,99, -10, 8};
        printList(sort(vector));
    }

    private static int[] sort(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector.length-i-1; j++) {
                int left = vector[j];
                int right = vector[j+1];
                if (left > right) {
                    vector[j] = right;
                    vector[j+1] = left;
                }
            }
        }
        return vector;
    }

    private static void printList(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]);
            System.out.print(" ");
        }
    }
}
