package com.assignment4.rinaldo;

/*
* This program is going to check if every character in a given string is unique or not.
* */

import java.util.Scanner;

public class UniqueCharactersApp {

    public static void main(String[] args) {

        // given String
//        String givenString = "Pack my box with five dozen liquor jugs.";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a String to evaluate: ");
        String givenString = scanner.nextLine();
        boolean isNotUnique = false;

        // remove extra spaces from the string
        givenString = givenString.replace(" ", "");

        // convert string to array of char
        char[] ar = givenString.toCharArray();

        // sort arry of characters
        sortCharArray(ar);

        // check if current index is the same as the next index.
        // if so, it is not unique
        for (int i = 0; i < ar.length - 1; i++) {
            if (ar[i] == ar[i + 1]) {
                //not unique
                isNotUnique = true;
            }
        }

        if (isNotUnique) {
            System.out.println("The sentence given is not unique");
        } else {
            System.out.println("The sentence given contains unique characters!");
        }
    }

    private static void sortCharArray(char[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a.length - i; j++) {
                if (a[j-1] > a[j]) {
                    int temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = (char) temp;
                }
            }
        }
    }
}
