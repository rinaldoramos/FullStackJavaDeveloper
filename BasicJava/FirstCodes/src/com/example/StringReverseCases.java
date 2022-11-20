package com.example;

public class StringReverseCases {

    public static void main(String[] args) {

        /*String s1 = "ineuron"; // output -> norueni
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

        System.out.println();
        System.out.println();
*/
        // ineuron java -> java ineuron
        String ss = "ineuron java";
        String ss2 = "";
        String[] ar = ss.split(" ");//0 -> ineuron & 1 -> java

            /*for (int i = ar.length - 1; i >= 0; i--) {
                for (int j = 0; j < ar[i].length(); j++) {
                    ss2 += (char) ar[i].charAt(j);
                }
                ss2 += " ";
            }*/

        for (int i = ar.length - 1;  i >= 0 ; i--) {
            ss2 += ar[i] + " ";
        }

        System.out.println(ss);
        System.out.println(ss2);
    }
}
