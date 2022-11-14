package com.assignment2.rinaldo;


/*
 *
 * This program is to find if there are duplicates in the array. It does it by selecting the first
 * element of the array and compare it with all the other elements of the array.
 * Author: Rinaldo Ramos
 *
 * */

public class DuplicateApp {

    public static void main(String[] args) {

        // 1. WAP to find the duplicates present in an array.

        // initial array
        int[] ar = {1, 2, 3, 4, 5, 5, 3};

        // temporal variable to hold the first value of the array
        int temp;
        boolean flag = false;

        if (ar.length > 0) {

            for (int i = 0; i < ar.length; i++) {
                temp = ar[i];
                for (int j = i; (j + 1)< ar.length; j++) {
                    if (temp == ar[j + 1]) {
                        // Duplicate found
                        System.out.println("A duplicate have been found at the following indexes:");
                        System.out.println("At index :: " + i + " with value :: " + temp);
                        System.out.println("At index :: " + (j + 1) + " with value :: " + ar[j + 1]);
                        flag = true;
                        break;
                    }
                }
            }
            if (flag == false) {
                System.out.println("No duplicate was found!");
            }
        } else {
            System.out.println("The array is empty");
        }
    }
}
