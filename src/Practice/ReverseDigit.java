package practice;
//write a program to reverse the given Digits

import java.util.Scanner;

public class ReverseDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number");
        int number = sc.nextInt();
        int reverse = 0;
        int digit = 0;

        while (number != 0) {
            digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        System.out.println("Reverse number is : " + reverse);
    }
}
