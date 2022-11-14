package com.assignment2.rinaldo;

/*
 *
 * This program is to find if one array is a subset of another array. It does it by checking each element
 * of one array with the other elements of the other array. If all are there, then it is a subset.
 * Author: Rinaldo Ramos
 *
 * */

public class SubsetArrayApp {

    public static void main(String[] args) {

       int arr1[] = {11, 13, 21, 3, 7, 1},  arr2[] = {11, 3, 7, 1};

        // Compare to determine if it is a subset or not

        if (isSubset(arr1, arr2)) {
            System.out.println("arr2[] is a subset of arr1");
        } else {
            System.out.println("arr2[] is not a subset of arr1");
        }

    }

    public static boolean isSubset(int arr1[], int arr2[])
    {
        int i = 0;
        int j = 0;

        for (i = 0; i < arr2.length; i++) {
            for (j = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j]) {
                    break;
                }
            }
            if (j == arr1.length)
                return false;
        }
        return true;
    }
}
