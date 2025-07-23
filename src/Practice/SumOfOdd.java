package Practice;
//Write a program to find sum of all odd numbers between 1 to n

import java.util.Scanner;

public class SumOfOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number");
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                sum += i;

            }
        }
        System.out.println("Sum of " + n + " natural odd number is :");
        System.out.println(sum);
    }
}
