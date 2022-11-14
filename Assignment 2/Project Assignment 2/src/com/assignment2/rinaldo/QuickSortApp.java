package com.assignment2.rinaldo;

/*
 *
 * This program is to sort an array of integers, using the quick sort and recursion. We select a pivot element,
 * in my case the first element but can be the middle or last or any random element, and we traverse
 * the remainder elements from lef -> right and viceversa. Once we find two elements smaller and bigger
 * than the pivot, you swapped then. In the end we will have the pivot in the right
 * position and all the elements to left, will be smaller and all the elements to the right, will be bigger.
 * Author: Rinaldo Ramos
 *
 * */
public class QuickSortApp {

    public static void main(String[] args) {

        // Array given
        int[] ar = {7, 6, 10, 5, 9, 2, 1, 15, 7, 56, 34, 13, 0};
        int low = 0;
        int high = ar.length - 1;

        System.out.println();
        System.out.println("Array before sorting:");
        for (int i : ar) {
            System.out.print(i + " ");
        }

        // calling the sorting method quickSort
        quickSort(ar, low, high);

        System.out.println();
        System.out.println();
        System.out.println("Array after sorting:");
        for (int i : ar) {
            System.out.print(i + " ");
        }

    }
    // Recursive method
    public static void quickSort(int[] ar, int lb,int hb) {

        if (lb < hb) {
            int pivotLocation = partition(ar, lb, hb);

            // calling arrays substring
            quickSort(ar, lb, pivotLocation - 1);
            quickSort(ar, pivotLocation + 1, hb);
        }
    }

    public static int partition(int[] ar, int lb, int hb) {

        // ar = {7, 6, 10, 5, 9, 2, 1, 15, 7};
        // pivot element chosen will be the first element of the array
        int pivot = ar[lb]; // 7
        int start = lb;     // 7
        int end = hb;       // 7

        while (start < end) {

            // Traverse the array from left -> right
            while (ar[start] <= pivot && start < hb) { //9
                start++;
            }

            // Traverse the array from right -> left
            while (ar[end] > pivot && end > lb) {   //1
                end--;
            }

            //  swap values
            if (start < end) {
                int temp = ar[start];
                ar[start] = ar[end];  //4
                ar[end] = temp;       //6
            }
        }

        // now we swapped the pivot with the end index value
        int swapPivot = ar[end];
        ar[end] = pivot;
        ar[lb] = swapPivot;

        // now return the correct pivot index location
        return end;
    }
}
