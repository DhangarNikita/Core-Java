package Practice;

import java.util.Scanner;

//Write a program to print all natural numbers from 1 to n
public class NaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter yoy number");

        int n = sc.nextInt();
        System.out.println("The " + n + " Naturel numbers are :");

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}
