package practice;
//Write a program to find the value of one number raised to the power of another

import java.util.Scanner;
public class RaisedToPower {
    public static void main(String[] args) {
        /*int num = 2;
        int power = 7;*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();

        System.out.println("Enter Power");
        int power = sc.nextInt();
        int result = 1;

        for (int i = 1; i <= power; i++) {
            result *= num;
        }
        System.out.println(result);

    }
}
