package com.example;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Welcome to the Simple Java Calculator!");
        System.out.println("Adding 5 + 3 = " + calc.add(5, 3));
        System.out.println("Subtracting 5 - 3 = " + calc.subtract(5, 3));
        System.out.println("Multiplying 5 * 3 = " + calc.multiply(5, 3));
    }
}
