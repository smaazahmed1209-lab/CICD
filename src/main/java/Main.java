package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }

    public static String demoNotification(String username) {
        if (username == null || username.isBlank()) {
            return "Demo notification: Hello, User!";
        }
        return "Demo notification: Hello, " + username.trim() + "!";
    }
}
