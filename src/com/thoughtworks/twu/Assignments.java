package com.thoughtworks.twu;

public class Assignments {

    public static void main(String[] args) {
        Assignments assignments = new Assignments();
        assignments.asterisk();
        assignments.horizontalLine(8);
        assignments.verticalLine(3);
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
     * Given a number n, print n lines, each with one asterisks
     *
     * @param n the number of lines to print.
     */
    private void verticalLine(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("*");
        }
    }
}
