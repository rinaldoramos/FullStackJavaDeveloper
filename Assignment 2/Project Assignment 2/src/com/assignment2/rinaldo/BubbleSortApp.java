package com.assignment2.rinaldo;


/*
 *
 * This program is to sort an array using the bubble sort. It does it by comparing
 * each element with the next one by pushing or swapping the biggest element until it reaches
 * the last index. From there repeat the process..
 * Author: Rinaldo Ramos
 *
 * */

public class BubbleSortApp  {

    public static void main(String[] args) {

        int[] a = {2, 7, 5, 400, 2, 3, 1, 4, 6, 13, 50, 80, 35, 23, 128};

        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a.length - i; j++) {
                if (a[j-1] > a[j]) {
                    int temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int elem : a) {
            System.out.print(elem + " ");
        }
    }
}
