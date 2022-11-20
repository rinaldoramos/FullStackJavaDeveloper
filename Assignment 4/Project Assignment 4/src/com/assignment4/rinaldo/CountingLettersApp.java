package com.assignment4.rinaldo;


import java.util.Scanner;

/*
*
* This is a program to determine how many consonants, vowels and special characters are present in a given string
*
* */
public class CountingLettersApp {

    public static void main(String[] args) {

        // declaring variables and objects.
        Scanner scanner = new Scanner(System.in);
        String userValue;
        char[] arSentence;
        int numberOfConsonants = 0;
        int numberOfVowels = 0;
        int numberOfSpecialCharacters = 0;

        System.out.print("Please give us a sentence: ");
        userValue = scanner.nextLine().toLowerCase();
        arSentence = userValue.toCharArray();

        for (int i = 0; i < arSentence.length; i++) {
            // check for vowel
            if (arSentence[i] == 97 || arSentence[i] == 101 || arSentence[i] == 105 || arSentence[i] == 111 || arSentence[i] == 117) {
                numberOfVowels++;
            } else if (arSentence[i] >= 97 && arSentence[i] <= 122) {
                numberOfConsonants++;
            } else {
                numberOfSpecialCharacters++;
            }
        }

        System.out.println("The sentence provided in lowercase is :: " + userValue);
        System.out.println("Total length of characters :: " + userValue.length());
        System.out.println("Number of vowels present: " + numberOfVowels);
        System.out.println("Number of consonants present: " + numberOfConsonants);
        System.out.println("Number of special characters present: " + numberOfSpecialCharacters);
    }
}
