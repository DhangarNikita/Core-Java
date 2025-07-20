package practive_programs.basic_programs;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number");
        int number = sc.nextInt();
        int count = 0;

        if (number == 1) {
            System.out.println("Number is not a prime number");
        } else {

            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    count++;
                }
            }
            if (count <= 2) {
                System.out.println("Number is Prime ");
            } else {
                System.out.println("Number is not a prime number");
            }
        }
    }
}