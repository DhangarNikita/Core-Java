package string.programs;
// Write a Java program to retrieve the character at a given index from a string,
// and display a custom message if the index is out of range.

import java.util.Scanner;

public class CharAtIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = scanner.nextLine();

        System.out.println("Enter the index ");
        int index = scanner.nextInt();

        if (index >= 0 && index < str.length()) {
            char result = str.charAt(index);
            System.out.println("Character at index " + index + " is: " + result );
        } else {
            System.out.println("Error: Index " + index + " is out of range");
        }

        scanner.close();
    }
}

