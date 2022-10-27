package com.assignment.rinaldo;

public class Number {

    public static void main(String[] args) {
        // counter to keep track of how many rows and columns I need
        int rows = 4;
        int colums = 4;

        // for loop to traverse the rows
        for (int i = 0; i < rows; i++) {

            // for loop to traverse the columns and print the numbers
            for (int j = 0; j < colums; j++) {
                System.out.print(i + 1);
            }
            System.out.println();
        }
    }
}
