package com.example;

import java.util.Scanner;

// for linear search just traverse the array index by index until found or not found
public class LinearSearch {

    public static void main(String[] args) {

        int[] ar = {10, 20, 40, 30, 60, 90, 80,};
        boolean flag = false;

        System.out.println("Please enter the number to search");
        Scanner scanner = new Scanner(System.in);
        int key = scanner.nextInt();

        for (int i = 0; i < ar.length; i++) {
            if (key == ar[i]) {
                System.out.println("Key " + key + " found at index: " + i);
                flag = true;
                break;
            }
        }
        if (flag == false)
            System.out.println("Key not found");
    }
}
