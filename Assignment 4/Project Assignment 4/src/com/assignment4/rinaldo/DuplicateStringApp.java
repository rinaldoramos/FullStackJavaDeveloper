package com.assignment4.rinaldo;

import java.util.Arrays;
import java.util.Scanner;

/*
*
* This is a program that creates a new string without duplicates from another string given by the user.
*
* */
public class DuplicateStringApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a String to evaluate: ");
        String word = scanner.nextLine();
        System.out.println("Printing original word :: " + word);
        System.out.println("Printing original word length :: " + word.length());
        char[] ar = word.toCharArray();
        //sort the array using built in method
        Arrays.sort(ar);
        System.out.print("\nPrinting sorted array :: ");
        for (char c : ar) {
            System.out.print(c);
        }
        System.out.println();
        System.out.println("Printing sorted array length :: " + ar.length);

        // new word without duplicates
        StringBuffer sb = new StringBuffer();
        sb.append(ar[0]);

        for (int i = 0; i < ar.length - 1; i++) {
            if (ar[i] != ar[i + 1]) {
                sb.append(ar[i + 1]);
            }
        }
        System.out.println("\nPrinting array without duplicates :: " + sb);
    }
}
