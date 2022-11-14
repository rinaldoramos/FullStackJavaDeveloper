package com.example;

import java.util.Arrays;

public class ArrayClass {

    public static void main(String[] args) {

        int[] a = new int[5];

        for (int elem : a) {
            System.out.print(elem + " ");
        }

        System.out.println();

        Arrays.fill(a, 5);

        for (int elem : a) {
            System.out.print(elem + " ");
        }

        System.out.println();

        int[] ar = {1, 4, 0, 0, 0, 30, 50};

        Arrays.fill(ar, 2, 5, 10);

        System.out.println();

        for (int elem : ar) {
            System.out.print(elem + " ");
        }
    }
}
