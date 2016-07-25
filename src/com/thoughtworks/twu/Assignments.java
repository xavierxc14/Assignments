package com.thoughtworks.twu;

public class Assignments {

    public static void main(String[] args) {
        Assignments assignments = new Assignments();
        assignments.asterisk();
        assignments.horizontalLine(8);
    }

    private void asterisk() {
        System.out.println("*");
    }

    private void horizontalLine(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
    }
}
