package com.example;


/*
*
* a sentence, verse, etc., that includes all the letters of the alphabet. Complete English Grammar Rules is now available in paperback and eBook formats.
*
* */
public class PanagramExample {

    public static void main(String[] args) {

        // The quick brown fox jumps over lazy dog      ->  should include all the letters from A-Z
        // A -> 65 hence, 65 - 65 = 0 -> first index
        // Z -> 90 hence, 90 - 65 = 25 -> last index
        String s1 = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        boolean hyder = false;

        // remove all the empty spaces
        s1 = s1.replace(" ", "");

        // Array of Charts
        char[] ch = s1.toCharArray();
        // array of int to hold index from 0-25
        int[] ar = new int[26];

        for (int i = 0; i < ch.length; i++) {
            int index = ch[i] - 65;
            ar[index]++;
        }

        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == 0) {
                System.out.println("It's not panagram!");
                hyder = true;
            }
        }

        if (hyder == false) {
            System.out.println("It's panagram!");
        }
    }
}
