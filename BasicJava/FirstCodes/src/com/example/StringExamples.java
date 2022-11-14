package com.example;


/*
*
* Most used String methods
*   public char charAt(int index)
*   public String concat(String str)
*   public boolean equals(Object o)
*   public boolean equalsIgnoreCase(String s)
*   public String subsString(int begin)
*   public String subsString(int begin, int end)
*   public int length()
*   public String replace(char old, char new)
*   public String toLowerCase()
*   public String toUpperCase()
*   public String trim()
*   public int indexOf(char ch)
*   public int lastIndexOf(char ch)
*
* */
public class StringExamples {

    public static void main(String[] args) {

        // String by default it is inmutable, you need to create a new reference if you want to add more values.
        // Hence use StringBuffer or StringBuilder, prefered the latter when possible
       /* String s = "Rinaldo";


        String s2 = s.concat(" Ramos");

        System.out.println("s = " + s);
        System.out.println("s2 = " + s2);

        System.out.println();

        StringBuilder sb = new StringBuilder("Ajnur");
        sb.append(" Kodra");
        System.out.println("sb = " + sb);

        // different objects pointing to different references
        String s3 = "sachin";
        String s4 = new String("sachin");
        // String s4 = "sachin"; //this is true

        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));

        System.out.println();

        // different objects pointing to same references
        String s5 = s3;
        System.out.println(s5 == s3);
        System.out.println(s5.equals(s3));

        System.out.println();
        CharSequence ch = "sachin";
        System.out.println(ch == s3);
        System.out.println(ch.equals(s3));

        System.out.println();

        String t = "Rinaldo";
        t = t + " Ramos";
        System.out.println(t);

        System.out.println();
        System.out.println();
        System.out.println();

        String s1 = new String("sachin");
        s1.concat("Tendulkar");
        s1 = s1.concat("IND");
        s2 = s1.concat("Mi");

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);

        String s1 = new String("you cannot change me!");
        String s2 = new String("you cannot change me!");

        System.out.println(s1 == s2);

        String s3 = "you cannot change me!";
        System.out.println(s1 == s3);
        String s4 = "you cannot change me!";
        System.out.println(s3 == s4);

        String s5 = "you cannot " + "change me!";
        System.out.println(s3 == s5);

        String s6 = "you cannot ";
        String s7 = s6 + "change me!";
        System.out.println(s3 == s7);

        final String s8 = "you cannot ";
        String s9 = s8 + "change me!";
        System.out.println(s3 == s9);
        System.out.println(s6 == s8);

        String name = "Rinaldo";

        String s10 = "Rinaldo".intern();

        if (s10.equals("Rinaldo")) {
            System.out.println("Found");
        }

        */

        // Examples of the most use methods in String Class

        System.out.println("Testing method charAt");
        String s = new String("sachin");
        System.out.println(s.charAt(3));
        System.out.println();

        System.out.println("Testing equals & equalsIgnoreCase methods");
        String same = "java";
        String same1 = "JAVA";
        System.out.println(same.equals(same1));
        System.out.println(same.equalsIgnoreCase(same1));
        System.out.println();

        System.out.println("Testing substring method");
        String s1 = "sachinINDMI";
        System.out.println(s1.length());
        System.out.println(s1.substring(9));
        System.out.println(s1.substring(0, 9));
        System.out.println();

        System.out.println("Testing replace method");
        String name = "sbchin";
        System.out.println(name.replace('b', 'a')); // sachin

        String data = "ababab";
        System.out.println(data.replace('a', 'b')); // bbbbbb
        System.out.println();

        System.out.println("Testing toUpper & toLower");
        String mixed = "RinalDo";
        System.out.println(mixed.toUpperCase()); // RINALDO
        System.out.println(mixed.toLowerCase()); // rinaldo
        System.out.println();

        System.out.println("Testing the trim method");
        String trim = "Sachin IND";
        System.out.println(trim.length()); // 10
        System.out.println(trim.trim());   // SachinIND
        System.out.println(trim.length()); // 9
        System.out.println();

        String state = "  Karnataka  ";
        System.out.println(state.length()); // 13
        System.out.println(state.trim());   // Karnataka
        System.out.println(state.length()); //13
        System.out.println();

        System.out.println("Testing the indexOf and lastIndex");
        String name2 = "hyderAbbas";
        System.out.println(name2.length());     // 10
        System.out.println(name2.indexOf('A')); // 5
        System.out.println(name2.indexOf('a')); // 8

        System.out.println();

        System.out.println(name2.indexOf('b'));         // 6
        System.out.println(name2.lastIndexOf('b')); // 7

        System.out.println();

        System.out.println(name2.lastIndexOf('Z')); // -1
        System.out.println();

        System.out.println("Testing toString method");
        Student student = new Student();
        System.out.println(student);
        System.out.println(student.toString());

        System.out.println();

        String na = "Dohna";
        System.out.println(na);
        System.out.println(na.toString());
    }
    static class Student {
        String name = "Rinaldo";
        int id = 10;

    }
}
