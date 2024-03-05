package org.example;

import java.util.Arrays;

public class MergeSortB {
    public static void main(String[] args) {
        int[] vector = {100, 99, -9,1,5,2,0,7,9,1,99, -10, 8, 15};
        printList(sort(vector));
    }

    private static int[] sort(int[] array) {
        if (array.length == 1) return array;

        int mid = array.length/2;
        int[] left = sort(Arrays.copyOfRange(array, 0, mid));
        int[] right = sort(Arrays.copyOfRange(array, mid, array.length));

        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) {
        int[] merged = new int[left.length + right.length];
        int index = 0;
        int i = 0;
        int j = 0;

        while(i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                merged[index] = left[i];
                index++;
                i++;
            } else {
                merged[index] = right[j];
                index++;
                j++;
            }
        }

        while (i < left.length){
            merged[index] = left[i];
            index++;
            i++;
        }

        while (j < right.length){
            merged[index] = right[j];
            index++;
            j++;
        }

        return merged;
    }

    private static void printList(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]);
            System.out.print(" ");
        }
    }
}