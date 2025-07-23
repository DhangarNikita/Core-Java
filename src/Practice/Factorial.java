package Practice;

import java.util.Scanner;

//Write a program to find the factorial value of any number
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to be find factorial");
        int n = sc.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Factorial of " + n + " is: " + result);

    }
}
