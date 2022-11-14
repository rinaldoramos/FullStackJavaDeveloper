package com.example;

public class Loop {

    public static void main(String[] args) {

        int n = 12;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                        //p1                    //p2                    //p3                //p4
//                if ((i + j == (n-1)/2) || (i - j == (n-1)/2) || (j - i == ((n-1))/2) || i + j == n -1 + ((n-1)/2))
                if (i == 0 || i == n-1 || i + j == n-1)
                    System.out.print(" *");
                else
                    System.out.print("  ");
            }
            System.out.println("");


        }


    }
}
