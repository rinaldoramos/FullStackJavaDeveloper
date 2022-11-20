package com.example;

/*
*   Palindrome words are those words that are the same when read backwards or forward
* */

public class PalindromeExamples {

    public static void main(String[] args) {
        String s1 = "NITIN";
        String s2 = "";

        for (int i = s1.length() - 1; i >= 0 ; i--) {
            s2 += s1.charAt(i);
        }

        System.out.println(s2);

        if (s1.equals(s2)) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }
    }

}
