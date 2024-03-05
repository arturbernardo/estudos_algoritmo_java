package org.example;

public class FindUnique {
    public static void main(String[] args) {
        int[] vectorA = {1,6,4,9,8,9,1,6,8};
        System.out.println(findUnique(vectorA));

        int[] vectorB = {1,6,4,9,8,9,1,6,8, -10, -10, 456, 11, 11, 456, 4, 999};
        System.out.println(findUnique(vectorB));
    }


    private static int findUnique(int[] vector) {
        int unique = 0;

        for (int i = 0; i < vector.length; i++) {
            unique ^= vector[i];
        }

        return unique;
    }
}
