package com.example;

public class StringReverseCases {

    public static void main(String[] args) {

        String s1 = "ineuron"; // output -> norueni
        String s2 = "";

        for (int i = s1.length() -1; i >= 0; i--) {
            s2 += s1.charAt(i);
        }

        System.out.println("Original String " + s1);
        System.out.println("Reverse String " + s2);
        System.out.println();

        // ineuron java -> avaj norueni

        String str1 = "ineuron java";
        StringBuffer str2 = new StringBuffer();

        String[] sArr = str1.split(" ");

        for (String tempArr : sArr) {
            for (int i = tempArr.length() - 1; i >= 0; i--) {
                str2.append((char) (tempArr.charAt(i)));
            }
        }

        str2.insert(7, " ");
        System.out.println(str1);
        System.out.println(str2);
    }
}
