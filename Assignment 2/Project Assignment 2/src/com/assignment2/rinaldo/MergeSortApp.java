package com.assignment2.rinaldo;


/*
 *
 * This program is to sort an array of integers, using the merge sort and recursive. We use the divide and conquer approach
 * where the original array is divided in half creating  2 sub arrays and we continue to do so recursively until we
 * dont have more than one element in the sub arrays. From there we add them together again by comparing to have it
 * sorted
 * Author: Rinaldo Ramos
 *
 * */

public class MergeSortApp {


    public static void main(String[] args) {

        int[] ar = {15, 5, 24, 8, 1, 3, 16, 10, 20, 7, 80, 25}; //9

        System.out.println();
        System.out.println("Array before sorting:");
        for (int i : ar) {
            System.out.print(i + " ");
        }

        mergeSort(ar);

        System.out.println();
        System.out.println("Array before sorting:");
        for (int i : ar) {
            System.out.print(i + " ");
        }

    }

    public static void mergeSort(int[] ar) {

        int arrSize = ar.length;

        // if array has only one value it is sorted
        if (arrSize < 2) {
            return;
        }

        int mid = arrSize / 2;
        // create an array to represent the lower end of the original array
        int[] leftArray = new int[mid];
        // create an array to represent the higher end of the original array
        int[] rightArray = new int[arrSize - mid];

        // filling the left side of the array
        for (int i = 0; i < mid; i++) {
            leftArray[i] = ar[i];
        }

        // filling the right side of the array
        for (int i = mid; i < arrSize; i++) {
            rightArray[i - mid] = ar[i];
        }

        mergeSort(leftArray);
        mergeSort(rightArray);
        // Merging both sorted arrays
        merge(ar, leftArray, rightArray);
    }

    public static void merge(int[] ar, int [] leftArray, int [] rightArray ) {

        int leftArraySize = leftArray.length;
        int rightArraySize = rightArray.length;

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < leftArraySize && j < rightArraySize) {
            if (leftArray[i] <= rightArray[j]) {
                ar[k] = leftArray[i];
                i++;
            } else {
                ar[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // checking if there are any more elements on the leftArray
        while (i < leftArraySize) {
            ar[k] = leftArray[i];
            i++;
            k++;
        }

        // checking if there are any more elements on the rightArray
        while (j < rightArraySize) {
            ar[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
