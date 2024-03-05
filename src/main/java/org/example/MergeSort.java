package org.example;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {

        int[] vector = {1,9,2,3, -1, 0, 99, 100, -2, 1, 8, 3, 6, 5, 5 ,9};
        printList(mergeSort(vector));
    }

    private static int[] mergeSort(int[] vector) {
        if (vector.length == 1) return vector;

        int midIndex = vector.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(vector, 0, midIndex));
        int[] right = mergeSort(Arrays.copyOfRange(vector, midIndex, vector.length));

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
        while(i < left.length) {
            merged[index] = left[i];
            index++;
            i++;
        }

        while (j < right.length) {
            merged[index] = right[j];
            index++;
            j++;
        }

        return merged;
    }

//
//
//    private static int[] mergeSort(int[] vector) {
//        if (vector.length == 1) return vector;
//
//        int mid = vector.length/2;
//        int[] left = mergeSort(Arrays.copyOfRange(vector, 0, mid));
//        int[] right = mergeSort(Arrays.copyOfRange(vector, mid, vector.length));
//
//        return merge(left, right);
//    }
//
//    private static int[] merge(int[] vectorA, int[] vectorB) {
//        int[] sorted = new int[vectorA.length + vectorB.length];
//        int index = 0;
//        int i = 0;
//        int j = 0;
//
//        while (i < vectorA.length && j < vectorB.length) {
//            if(vectorA[i] < vectorB[j]) {
//                sorted[index] = vectorA[i];
//                index++;
//                i++;
//            } else {
//                sorted[index] = vectorB[j];
//                index++;
//                j++;
//            }
//        }
//
//        while (i < vectorA.length) {
//            sorted[index] = vectorA[i];
//            index++;
//            i++;
//        }
//        while (j < vectorB.length) {
//            sorted[index] = vectorB[j];
//            index++;
//            j++;
//        }
//        return sorted;
//    }

    private static void printList(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]);
            System.out.print(" ");
        }
    }
}
