package com.assignment4.rinaldo;

import java.util.Arrays;
import java.util.Scanner;

/*
 *
 * This is a program that prints to console any duplicate character on a sorted string
 *
 * */

public class PrintDuplicatesApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a String to evaluate: ");
        String word = scanner.nextLine();
        System.out.println("Printing original word :: " + word);
        char[] ar = word.toCharArray();
        //sort the array using built in method
        Arrays.sort(ar);

        System.out.print("\nPrinting duplicates from original word:: ");
        for (int i = 0; i < ar.length - 1; i++) {
            if (ar[i] == ar[i + 1]) {
                System.out.print(ar[i]);
            }
        }
        System.out.println();
    }
}
