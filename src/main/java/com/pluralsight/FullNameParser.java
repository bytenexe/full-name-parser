package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        // Declare name string variables

        String fullName;
        String firstName = "";
        String middleName = "";
        String lastName = "";

        // Prompt the user to enter their name in first and last names or first, middle, and last names

        System.out.println("Please enter your first and last name or your first, middle, and last names: ");
        fullName = input.nextLine().trim();
        String[] parts = fullName.split(" ");

        // Add in a switch and parse the name
        switch (parts.length) {
            case 2:
                firstName = parts[0];
                middleName = parts[1];
                lastName = ("none");
                break;
            case 3:
                firstName = parts[0];
                middleName = parts[1];
                lastName = parts[2];
                break;
        }

        // Display the individual pieces of their name
        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name: " + lastName);
    }

}

