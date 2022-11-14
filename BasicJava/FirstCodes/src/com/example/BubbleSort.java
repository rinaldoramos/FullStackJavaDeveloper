package com.example;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] a = {2, 7, 5, 2, 3, 1, 4, 6, 13, 50};

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
