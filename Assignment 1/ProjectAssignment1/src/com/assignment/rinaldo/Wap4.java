package com.assignment.rinaldo;

public class Wap4 {

    public static void main(String[] args) {
        int n = 15;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                // condition to add a star if it is true
                if (i - j >= (n - 1) / 2 || i + j >= n + ((n - 1) / 2) - 1) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
