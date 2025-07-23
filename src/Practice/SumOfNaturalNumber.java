package Practice;

import java.util.Scanner;

// Write a program to find sum of all natural numbers between 1 to n
public class SumOfNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum of 1 to " + n + " Natural numbers are :");
        System.out.println(sum);
    }
}
