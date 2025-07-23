package Practice;
//Write a program to print all natural numbers in reverse

import java.util.Scanner;

public class ReverseNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number");

        int n = sc.nextInt();
        System.out.println(n +" Naturel numbers in reverse order are : ");

        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
