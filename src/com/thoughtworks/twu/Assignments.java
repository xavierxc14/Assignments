package com.thoughtworks.twu;

import java.util.ArrayList;
import java.util.List;

public class Assignments {

    public static void main(String[] args) {
        Assignments assignments = new Assignments();
        assignments.asterisk();
        assignments.horizontalLine(8);
        assignments.verticalLine(3);
        assignments.rightTriangle(3);
        assignments.isoscelesTriangle(3);
        assignments.diamond(3);
        assignments.diamondWithName(3);
        assignments.fizzBuzz();
        List<Integer> primeFactors = assignments.generate(1);
        System.out.println(primeFactors);
        primeFactors = assignments.generate(30);
        System.out.println(primeFactors);
    }

    /**
     * Easiest exercise ever.
     * Print one asterisk to the console.
     */
    private void asterisk() {
        System.out.println("*");
    }

    /**
     * Draw a horizontal line.
     * Given a number n, print n asterisks on one line.
     *
     * @param n the number of asterisks to print.
     */
    private void horizontalLine(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    /**
     * Draw a vertical line.
     * Given a number n, print n lines, each with one asterisks.
     *
     * @param n the number of lines to print.
     */
    private void verticalLine(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("*");
        }
    }

    /**
     * Draw a right triangle.
     * Given a number n, print n lines, each with one more asterisk than the last.
     *
     * @param n the number of lines to print.
     */
    private void rightTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * Isosceles Triangle.
     * Given a number n, print a centered triangle.
     *
     * @param n the number of lines in the triangle.
     */
    private void isoscelesTriangle(int n) {
        int asterisks = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < asterisks; j++) {
                System.out.print("*");
            }
            asterisks = asterisks + 2;
            System.out.println();
        }
    }

    /**
     * Diamond.
     * Given a number n, print a centered diamond.
     *
     * @param n the number of lines included the center of the diamond.
     */
    private void diamond(int n) {
        isoscelesTriangle(n);
        upsideDownTriangle(n);
    }

    /**
     * Prints an upside-down triangle to complete the diamond.
     *
     * @param n the number of lines minus 1.
     */
    private void upsideDownTriangle(int n) {
        int asterisks = 2 * n - 3;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < asterisks; j++) {
                System.out.print("*");
            }
            asterisks = asterisks - 2;
            System.out.println();
        }
    }

    /**
     * Diamond with Name.
     * Given a number n, print a centered diamond with your name in place of the middle line.
     *
     * @param n the number of lines included the center of the diamond.
     */
    private void diamondWithName(int n) {
        int asterisks = 1;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < asterisks; j++) {
                System.out.print("*");
            }
            asterisks = asterisks + 2;
            System.out.println();
        }
        System.out.println("Xavier");
        upsideDownTriangle(n);
    }

    /**
     * FizzBuzz.
     * FizzBuzz is a simple number game where you count, but say "Fizz" and/or "Buzz" instead of numbers.
     * Rules:
     * Instead of numbers divisible by three print "Fizz".
     * Instead of numbers divisible by five print "Buzz".
     * Instead of numbers divisible by three and five print "FizzBuzz".
     */
    private void fizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    /**
     * Prime Factors.
     *
     * @param n the number to generate prime factors.
     * @return a list of integers such that the numbers are the factors of N and are arranged in increasing numerical order.
     */
    private List<Integer> generate(int n) {
        List<Integer> primeFactors = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                primeFactors.add(i);
                n = n / i;
            }
            if (n == 1) {
                break;
            }
        }
        return primeFactors;
    }
}
