package practive_programs.basic_programs;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number");
        int number = sc.nextInt();
        int reverse = 0;
        int digit = 0;

        while (number != 0) {
            digit = number % 10;            // get last digit
            reverse = reverse * 10 + digit;   // add last digit to the variable
            number /= 10;                // remove last number
        }
        System.out.println("Reverse Number Is: " + reverse);
    }
}
