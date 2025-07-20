package practive_programs.basic_programs;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number");
        int number = sc.nextInt();
        int originalNumber = number;
        int reverse = 0;
        int digit = 0;

        while (number != 0) {
            digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        System.out.println(reverse);
        if (reverse == originalNumber) {
            System.out.println("Number is palindrome");
        } else {
            System.out.println("Number is not a palindrome");
        }
    }
}
