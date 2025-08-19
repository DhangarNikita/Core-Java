package java8.lambda_expression;

//Write a Java program to implement a lambda expression to convert an integer to their corresponding binary representation.

import java.util.Scanner;

interface Binary{
    String convertBinary(int n);
}

public class BinaryConvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Integer");
        int n = sc.nextInt();

        Binary br=(b)-> Integer.toBinaryString(b);

        String str = br.convertBinary(n);
        System.out.println(n+" integer to "+str+" binary");

    }
}
