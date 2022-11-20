package com.assignment4.rinaldo;

/*
* This program find the maximum occurring character on a String
* */

import java.util.Scanner;

public class MaximunOccuranceCharacterApp {

    public static void main(String[] args) {

//        String sentence = "Amazingly few discotheques provide jukeboxes";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a String to evaluate: ");
        String sentence = scanner.nextLine();
        int[] letterArraysOccurrences;
        int counterToCheckLetter = 0;

        // make it lowerCase and remove empty spaces
        sentence = sentence.toUpperCase().replace(" ", "");

        // initialize index array to track letters occurrences
        letterArraysOccurrences = new int[sentence.length()]; // exact number of total letters

        // convert to array of char
        char[] ar = sentence.toCharArray();

        // order ascending order
        sortCharArray(ar);

        for (char c : ar) {
            System.out.print(c);
        }
        System.out.println();
        System.out.println();

        for (int i = 0; i < sentence.length(); i++) {
            if (ar[i] == counterToCheckLetter + 65) {
                letterArraysOccurrences[counterToCheckLetter]++;
            } else if (ar[i] == ++counterToCheckLetter + 65) {
                letterArraysOccurrences[counterToCheckLetter]++;
            }
        }

        // determine the biggest index from letterArraysOccurrences
        int maximumOccurrence = letterArraysOccurrences[0];
        int indexOfMaximumOccurrences = 0;

        for (int i = 1; i < letterArraysOccurrences.length; i++) {
            if (letterArraysOccurrences[i] > maximumOccurrence) {
                maximumOccurrence = letterArraysOccurrences[i];
                indexOfMaximumOccurrences = i;
            }
        }

        System.out.println("The letter with more occurrences is " +
         "" + (char)(65 + indexOfMaximumOccurrences) + ", with a maximum occurrance of " + maximumOccurrence);
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
