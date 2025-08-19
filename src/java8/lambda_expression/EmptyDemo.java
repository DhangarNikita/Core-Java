package java8.lambda_expression;
//Write a Java program to implement a lambda expression to check if a given string is empty.

import java.util.Scanner;

@FunctionalInterface
interface EmptyString{
    boolean isEmpty(String str);
}

public class EmptyDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string");
        String str1 =sc.nextLine();

        EmptyString es =(str)-> str.isEmpty();

        boolean result= es.isEmpty(str1);
        System.out.println(result);
    }
}
