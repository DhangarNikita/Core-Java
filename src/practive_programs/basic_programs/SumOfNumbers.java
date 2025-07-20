package practive_programs.basic_programs;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number");
        int number = sc.nextInt();
        int total = 0;

        for (int i = 1; i <= number; i++) {
            total += i;
        }
        System.out.println("Sum of " + number + " Numbers is : " + total);

    }
}
