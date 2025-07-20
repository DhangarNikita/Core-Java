package practive_programs.basic_programs;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number for fibonacciSeries");
        int number = sc.nextInt();
        int a = 0;
        int b = 1;

        System.out.println("Fibonacci Series of : " + number);

        for (int i = 1; i <= number; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;

        }
    }
}
