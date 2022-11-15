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

       /* StringBuffer sb = new StringBuffer("Kohlianushka");
        sb.setCharAt(5, 'A');   // KohliAnushka
        System.out.println(sb);

        System.out.println("Continue practice");
        */

      /*  StringBuffer sb = new StringBuffer();
        sb.append("The value of PI is :: ");
        sb.append(3.14);
        sb.append(" This is exactly ");
        sb.append(true);
        System.out.println(sb);
        */

     /*   StringBuffer sb = new StringBuffer("abcdefgh");
        sb.insert(2, "xyz");
        System.out.println(sb); // abxyzcdefgh
        sb.insert(9, 11);
        System.out.println(sb); // abxyzcdef11gh
        sb.insert(sb.length(), "Dhoni");
        System.out.println(sb);*/

/*

        StringBuffer sb = new StringBuffer("sachinrameshTtendulkar");
        sb.delete(6, 12);
        System.out.println(sb);

        sb.deleteCharAt(7);
        System.out.println(sb);

*/
       /*
       StringBuffer sb = new StringBuffer("rinaldoramos");
        System.out.println(sb);             //rinaldoramos
        System.out.println(sb.reverse());   //somarodlanir
        */

        /*
        StringBuffer sb = new StringBuffer("rinaldoramos");
        System.out.println(sb);
        sb.setLength(7);
        System.out.println(sb);

*/


        /*StringBuffer sb = new StringBuffer("sachinrameshTtendulkar");
        System.out.println(sb);
        sb.delete(0, 6);
        System.out.println(sb); //rameshTtendulkar
        sb.delete(6, sb.length());
        System.out.println(sb); //ramesh*/


    /*    StringBuffer sb = new StringBuffer(1000);
        System.out.println(sb.capacity());  //1000
        sb.append("sachin");
        System.out.println(sb.capacity());  //1000
        sb.trimToSize();
        System.out.println(sb.capacity());  //6*/


        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());  //16
        sb.ensureCapacity(20);
        System.out.println(sb.capacity());  //34

//        StringBuffer (v1.0)   ->  These are syncronized
//        StringBuilder(v1.5)   ->  These are not syncronized



    }
}
