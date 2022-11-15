package com.example;

public class StringUtLAndLtU {

    public static void main(String[] args) {

//        char ch = 'a'; // 97->a ==> 97 - 32 = A
//        char newCh = (char) (ch - 32);   = A

        String s1 = "ineuron";
        String s2 = "";

        for (int i = 0; i < s1.length(); i++) {
            s2 +=  (char)(s1.charAt(i) - 32);
        }

        System.out.println("Original input :: " + s1);
        System.out.println("Final output :: " + s2);

        String str1 = "RINALDO";
        String str2 = "";

        for (int i = 0; i < s1.length(); i++) {
            str2 +=  (char)(str1.charAt(i) + 32);
        }

        System.out.println("Original input :: " + str1);
        System.out.println("Final output :: " + str2);

        // To conver InEUrOn into iNeuRoN
        String ss = "InEUrOn";
        StringBuilder ss2 = new StringBuilder("");

        for (int i = 0; i < ss.length(); i++) {
            if (ss.charAt(i) >= 'a' && ss.charAt(i) <= 'z') {
                ss2.append((char) (ss.charAt(i) - 32));
            } else {
                ss2.append((char) (ss.charAt(i) + 32));
            }
        }

        System.out.println(ss2);
    }
}
