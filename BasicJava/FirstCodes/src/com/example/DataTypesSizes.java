package com.example;

public class DataTypesSizes {

    public static void main(String[] args) {

        System.out.println("byte size:: " + Byte.SIZE);
        System.out.println("byte min:: " + Byte.MIN_VALUE);
        System.out.println("byte max:: " + Byte.MAX_VALUE);

        System.out.println("short size:: " + Short.SIZE);
        System.out.println("short min:: " + Short.MIN_VALUE);
        System.out.println("short max:: " + Short.MAX_VALUE);

        System.out.println("int size:: " + Integer.SIZE);
        System.out.println("int min:: " + Integer.MIN_VALUE);
        System.out.println("int max:: " + Integer.MAX_VALUE);

        System.out.println("long size:: " + Long.SIZE);
        System.out.println("long min:: " + Long.MIN_VALUE);
        System.out.println("long max:: " + Long.MAX_VALUE);


        System.out.println("float size:: " + Float.SIZE);
        System.out.println("float min:: " + Float.MIN_VALUE);
        System.out.println("float max:: " + Float.MAX_VALUE);


        System.out.println("double size:: " + Double.SIZE);
        System.out.println("double min:: " + Double.MIN_VALUE);
        System.out.println("double max:: " + Double.MAX_VALUE);

        System.out.println("char size:: " + Character.SIZE);
        System.out.println("char min:: " + Character.MIN_VALUE);
        System.out.println("char max:: " + Character.MAX_VALUE);

        byte a = 10;
        byte b = 20;
        byte c = (byte) (a*b);

        System.out.println("c = " + c);
    }
}