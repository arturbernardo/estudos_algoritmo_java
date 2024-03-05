package org.example;

public class BubbleSort {
    public static int[] sort(int[] array) {
        for (int i = 0; i<array.length; i++) {
            for (int j = 0; j<array.length-i-1; j++) {
                int left = array[j];
                int right = array[j+1];
                if (array[j] > array[j+1]) {
                    array[j] = right;
                    array[j+1] = left;
                }
            }
        }

        return array;
    }

    public static void main(String[] args) {
        int [] testB = {2,8,4, -36346, 0 ,5,-1,1,10,0};
        int[] sort = sort(testB);
        for (int i = 0; i < sort.length; i++) {
            System.out.print(sort[i]);
            System.out.print(" ");
        }
    }
}

