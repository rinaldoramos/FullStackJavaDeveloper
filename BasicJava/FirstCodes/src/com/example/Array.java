package com.example;

public class Array {

    public static void main(String[] args) {

        // regular 1 dimensional array
        int[] ar1 = new int[5];
        ar1[2] = 4;

        // regular 2 dimensional array
        int[][] ar2 = new int[3][5];
        ar2[1][4] = 30;

        // regular 3 dimensional array
        int[][][] ar3 = new int[2][4][7];
        ar3[1][1][1] = 60;

        System.out.println("1D :: " + ar1[2]);
        System.out.println("2D :: " + ar2[1][4]);
        System.out.println("3D :: " + ar3[1][1][1]);


        // irregular (jagged) 2D array
        int[][] ar_1 = new int[3][];
        ar_1[0] = new int[2];
        ar_1[1] = new int[3];
        ar_1[2] = new int[4];

        ar_1[0][0] = 50;
        ar_1[1][2] = 60;
        ar_1[2][3] = 70;

        System.out.println("2D Jagged array :: " + ar_1[0][0]);
        System.out.println("2D Jagged array :: " + ar_1[1][1]);
        System.out.println("2D Jagged array :: " + ar_1[2][3]);

        System.out.println("");
        System.out.println("");
        System.out.println("===============================");
        System.out.println("");
        System.out.println("");

        int[][] ar = new int[3][];
        ar[0] = new int[3];
        ar[1] = new int[2];
        ar[2] = new int[4];

        for (int i = 0; i < ar.length; i++) {

            for (int j = 0; j < ar[i].length; j++) {
                ar[i][j] = j + 1;
            }
        }

        System.out.println("Printing the values in the array");

        for (int i = 0; i < ar.length; i++) {

            System.out.print("row " + i + ": ");

            for (int j = 0; j < ar[i].length; j++) {
                System.out.print(ar[i][j] + " ");
            }

            System.out.println();
        }
    }
}
