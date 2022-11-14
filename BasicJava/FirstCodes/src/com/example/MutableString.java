package com.example;

public class MutableString {

    public static void main(String[] args) {

   /*     // StringBuffer =>  mutable ( We can change and changes will be reflected in the same memory
        final StringBuffer sb = new StringBuffer("sachin");
        sb.append("tendulkar");
        System.out.println(sb);

//      sb = new StringBuffer("lola"); cannot be done since it is final

        StringBuffer sb1 = new StringBuffer();
        System.out.println(sb1.length());       // number if characters stored = 0
        System.out.println(sb1.capacity());     // how many number of characters can be stored

        sb1.append("abcdefghijklmnop");
        System.out.println(sb1.length());       // 16
        System.out.println(sb1.capacity());     // 16

        sb1.append("q");
        System.out.println(sb1.length());       // 16
        System.out.println(sb1.capacity());     // new capacity = (oldCapacity + 1) * 2 = 34

        System.out.println();
        System.out.println();
        StringBuffer sb2 = new StringBuffer(100);
        System.out.println(sb2.length());       // 0
        System.out.println(sb2.capacity());     // 100

        sb2.append("sachin");
        System.out.println(sb2.length());       // 6
        System.out.println(sb2.capacity());     // 100
        System.out.println();
        System.out.println();

        StringBuffer sb3 = new StringBuffer("sachin");
        System.out.println(sb3.length());       // 6
        System.out.println(sb3.capacity());     // 22
        System.out.println();
        */

      /*  StringBuffer sb = new StringBuffer("sachin");
        System.out.println(sb.charAt(4));
        System.out.println(sb.charAt(-1));
        */

        StringBuffer sb = new StringBuffer("Kohlianushka");
        sb.setCharAt(5, 'A');   // KohliAnushka
        System.out.println(sb);


    }
}
