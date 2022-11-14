package com.assignment2.rinaldo;

/*
 *
 * This program is to sort an array of integers, using the selection sort. Here we pick the first element of the array as
 * the smallest element of the array.From there, we check if there is another element smaller than the first element.
 * If found, we swapped places and repeat the process starting from the next element and so forth
 * Author: Rinaldo Ramos
 *
 * */

public class SelectionSortApp {

    public static void main(String[] args) {

        int[] ar = {7, 4, 10, 8, 3, 1, 2, 15, 50, 6}; // 6
        int size = ar.length - 1;                     // 5

        System.out.println("Array before sorting");
        for (int i = 0; i < size; i++) {
            System.out.print(ar[i] + " ");
        }

        for (int i = 0; i < size; i++) {
            int smallest = i;           // 0

            for (int j = i + 1; j < size; j++) {
                if (ar[j] < ar[smallest]) {
                    smallest = j;
                }
            }
            if (smallest != i) {
                int temp = ar[i];
                ar[i] = ar[smallest];
                ar[smallest] = temp;
            }
        }

        System.out.println();
        System.out.println("Array After sorting");
        for (int i = 0; i < size; i++) {
            System.out.print(ar[i] + " ");
        }

    }
}
