package Practice;

import java.util.Scanner;
//write a program to sum of its Digits

public class SumOfDigit {
    public static void main(String[] args) {
        //int n = 14587;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();
        int remain = 0;
        int total = 0;

        while (n != 0) {
            remain = n % 10;
            total += remain;
            n /= 10;
        }
        System.out.println("Sum of number is: " + total);
    }
}
