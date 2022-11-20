package com.assignment4.rinaldo;

import java.util.Scanner;

/*
 *
 * This is a program to check if a given number by the user, is Palindrome or not. By checking if the word is
 * the same when reversed
 *
 * */

public class PalindromeExampleApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert a number to be checked: ");
        int number = scanner.nextInt();

        System.out.println("Number given :: " + number);
        char [] arNum = String.valueOf(number).toCharArray();
        int i = 0;
        int j = arNum.length - 1;
        boolean isPalandrome = false;

        while (i < j) {
            if (arNum[i] == arNum[j]) {
                i++;
                j--;
                isPalandrome = true;
            } else {
                isPalandrome = false;
                break;
            }
        }

        if (isPalandrome) {
            System.out.println("It is a Palindrome number");
        } else {
            System.out.println("Is not a Palindrome number");
        }
    }
}
