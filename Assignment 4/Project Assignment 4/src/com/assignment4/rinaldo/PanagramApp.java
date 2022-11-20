package com.assignment4.rinaldo;


import java.util.Arrays;

/*
*
* This is a program to check if a given sentence is a Panagram. A sentence that includes
* all the letters of the alphabet
*
* */
public class PanagramApp {

    public static void main(String[] args) {

        String panagramSentence = "Fred specialized in the job of making very quaint wax toys";
        int[] index = new int[26]; // 0 - 25
        int countLettersOfAlphabet = 0; // to help compare the letters


        // Make it UpperCase and remove empty spaces
        panagramSentence = panagramSentence.toUpperCase().replace(" ", "");
        System.out.print("Sentence provided ===> ");
        System.out.println(panagramSentence);

        //convert the string into an array of char
        char[] ar = panagramSentence.toCharArray();

        // sort array with method sortCharArr below
        sortCharArr(ar);
        System.out.print("\nSorted sentence   ===> ");
        for (char c : ar) {
            System.out.print(c);
        }
        System.out.println();
        System.out.println();

        // from 65 - 90 are all the letters in the alphabet in capital in Unicode value.
        // Therefore, compare each letter from the array with the expected letter from the alphabet.
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == (countLettersOfAlphabet + 65)) {
                index[countLettersOfAlphabet]++;
                countLettersOfAlphabet++;
            }
        }

        for (int i : index) {
            if (i == 0) {
                System.out.println("The sentences provided is not a Panagram!");
                System.exit(0);
            }
        }

        System.out.println("The sentence provided is a Panagram!!");
    }

    public static void sortCharArr(char[] a) {
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
