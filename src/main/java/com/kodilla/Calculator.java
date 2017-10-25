package com.kodilla;

import java.util.Random;

public class Calculator {

    private double valueA;
    private double valueB;

    public Calculator(double valueA, double valueB) {
        this.valueA = valueA;
        this.valueB = valueB;
    }

    public double doAddition() {
        return valueA + valueB;
    }

    public double doSubtraction() {
        return valueA - valueB;
    }

    public double getValueA() {
        return valueA;
    }

    public double getValueB() {
        return valueB;
    }
}

class Application {

    public static void main(String[] args) {

        Random r = new Random();

        Calculator c1 = new Calculator(r.nextDouble() + r.nextInt(100), r.nextDouble() + r.nextInt(100));
        Calculator c2 = new Calculator(r.nextDouble() + r.nextInt(100), r.nextDouble() + r.nextInt(100));

        System.out.println("\n Addition of two random values");
        System.out.println("First: " + c1.getValueA());
        System.out.println("Second: " + c1.getValueB());
        System.out.println("The result is: " + c1.doAddition());

        System.out.println("\n Subtraction of two random values");
        System.out.println("First: " + c2.getValueA());
        System.out.println("Second: " + c2.getValueB());
        System.out.println("The result is: " + c2.doSubtraction());
    }
}
