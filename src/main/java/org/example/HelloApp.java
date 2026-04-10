package org.example;

public class HelloApp {

    public static void main(String[] args) {

        // If no arguments are provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Build comma-separated names using StringBuilder
        StringBuilder names = new StringBuilder();

        for (String name : args) {
            if (names.length() > 0) {
                names.append(", ");
            }
            names.append(name);
        }

        // Print greeting
        System.out.println("Hello, " + names + "!");
    }
}