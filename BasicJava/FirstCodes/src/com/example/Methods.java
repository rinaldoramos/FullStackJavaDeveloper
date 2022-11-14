package com.example;


class Calculator {

    float add(float a, int b) {
        return a + b;
    }

    float add(float a, float b, int c) {
        return a + b + c;
    }
}

public class Methods {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.add(10, 20));
    }

}
