package com.assignment4.rinaldo;

import java.util.Scanner;

/*
*
* This program is to check if a given word or phrase is Anagram, which a word or phrase that can be
* re-arrange to create a different one
*
* */

public class AnagramApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean isAnagram = false;

        System.out.print("Please enter first word or sentence:: ");
        String s1 = scanner.nextLine().toLowerCase(); // test it with -> a gentle man
        System.out.print("\nPlease enter second word or sentence:: ");
        String s2 = scanner.nextLine().toLowerCase(); // test it with -> gentle man

        //remove empty spaces
        s1 = s1.replace(" ", "");
        s2 = s2.replace(" ", "");

        //check if they have same length, if not, they are not Anagram
        System.out.println(s1);
        System.out.println(s2);
        if (s1.length() != s2.length()) {
            System.out.println("Length is not the same. Cannot be Anagram.");
        } else {
            // converting String into array of chars
            char[] ar1 = s1.toCharArray();
            char[] ar2 = s2.toCharArray();

            // sorting the arrays
            sortChar(ar1);
            sortChar(ar2);

            //checking if indexes are the same
            for (int i = 0; i < ar1.length; i++) {
                if (ar1[i] == ar2[i]) {
                    isAnagram = true;
                } else {
                    // if not same, end the loop
                    isAnagram = false;
                    break;
                }
            }

            if (isAnagram) {
                System.out.println("Both words are Anagram");
            } else {
                System.out.println("They are not Anagram");
            }
        }

    }

    public static void sortChar(char[] arChar) {
        for (int i = 0; i < arChar.length; i++) {
            for (int j = 1; j < arChar.length - i; j++) {
                if (arChar[j-1] > arChar[j]) {
                    int temp = arChar[j - 1];
                    arChar[j - 1] = arChar[j];
                    arChar[j] = (char) temp;
                }
            }
        }
    }
}
