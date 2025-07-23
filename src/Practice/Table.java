package Practice;
//Write a program to print tables

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which table do you want");

        int t = sc.nextInt();
        System.out.println("Table of " + t + " is");

        for (int i = 1; i <= 10; i++) {
            System.out.println(t * i);
        }
    }
}
