package practice;

import java.util.Scanner;

//Write a program to calculate HCF of Two given number
public class Hcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int n1 = sc.nextInt();
        System.out.println("Enter second number");
        int n2 = sc.nextInt();

        int hcf = 1;
        int min = 0;
        if (n1 < n2) {
            min = n1;
        } else {
            min = n2;
        }

        for (int i = 1; i <= min; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                hcf = i;
            }
        }

        System.out.println("Highest common factor of " + n1 + " and " + n2 + " is : " + hcf);
    }

}
