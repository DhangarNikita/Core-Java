package java8.lambda_expression;
//Write a Java program to implement a lambda expression to check if a given number is a perfect square.

import java.util.Scanner;

interface Square {
    int squareFind(int a);

}

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int a = sc.nextInt();

        Square sq = (b) -> {
            int count = 0;
            int square = 1;
            for (int i = 1; i <= b; i++) {
                square = i * i;
                if (square == b) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(b + " Is a perfect square number");
            } else {
                System.out.println(b + " Is not a perfect square number");
            }
            return count;
        };

        sq.squareFind(a);
    }
}
