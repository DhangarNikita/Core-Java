package practice;
//Write a program to print reverse tables

import java.util.Scanner;

public class ReverseTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Which table do you want in reverse order");

        int t = sc.nextInt();
        System.out.println("Table of " + t + " in reverse order is: ");
        for (int i = 10; i >= 1; i--) {
            System.out.println(t * i);
        }
    }
}
