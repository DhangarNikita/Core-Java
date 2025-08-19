package java8.lambda_expression;
//Write a Java program to implement a lambda expression to find the length of the longest and smallest string in a list.

import java.util.Scanner;

interface FindLength {
    void lengthOf(String s1, String s2);

}

public class Length {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your 1st string");
        String str1 = sc.nextLine();

        System.out.println("Enter your 2nd String");
        String str2 = sc.nextLine();

        FindLength fl = (s1, s2) -> {
            if (s1.length() > s2.length()) {
                System.out.println(s1 + " is greater than " + s2);
            } else if (s2.length() > s1.length()) {
                System.out.println(s2 + " is greater than " + s1);
            } else {
                System.out.println("Both strings are same");
            }
        };

        fl.lengthOf(str1, str2);
    }
}
