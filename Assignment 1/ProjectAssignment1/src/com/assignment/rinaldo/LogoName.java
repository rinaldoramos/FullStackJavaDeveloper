package com.assignment.rinaldo;

public class LogoName {

    public static void main(String[] args) {

        int n = 8;

        // for loop to traverse the rows
        for (int i = 0; i < n; i++) {

            // for loop to create the letter I
            for (int j = 0; j < n; j++) {

                // condition to add a star if it is true
                if (i == 0 || i == n -1 || j == (n - 1) / 2)
                    System.out.print(" *");
                else
                    System.out.print("  ");
            }
            System.out.print("    ");



            // for loop to create the letter N
            for (int j = 0; j < n; j++) {

                // condition to add a star if it is true
                if (j == 0 || j == n -1 || i == j)
                    System.out.print(" *");
                else
                    System.out.print("  ");
            }
            System.out.print("    ");


            // for loop to create the letter E
            for (int j = 0; j < n; j++) {

                // condition to add a star if it is true
                if (i == 0 || i == (n - 1) / 2 || i == n - 1 || j == 0) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("    ");

            // for loop to create the letter U
            for (int j = 0; j < n; j++) {

                // condition to add a star if it is true
                if ((j == 0 && i != n - 1) || (j == n - 1 && i != n - 1) || (i == n -1 && (j > 0 && j < n - 1 ))) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("    ");


            // for loop to create the letter R
            for (int j = 0; j < n; j++) {

                // condition to add a star if it is true
//                if (j == 0 || ((i == (n - 1) / 2 || i == 0) && j <= n / 2))  {
                if (j == 0 || (j == n - 1 && i <= n / 2) || i == 0 || i == n / 2 || i == j && (i >= n / 2 && j >= n / 2)) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("    ");


            // for loop to create the letter O
            for (int j = 0; j < n; j++) {

                // condition to add a star if it is true
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("    ");

            // for loop to create the letter N
            for (int j = 0; j < n; j++) {

                // condition to add a star if it is true
                if (j == 0 || j == n -1 || i == j)
                    System.out.print(" *");
                else
                    System.out.print("  ");
            }
            System.out.print("    ");

            System.out.println();
        }
    }
}
