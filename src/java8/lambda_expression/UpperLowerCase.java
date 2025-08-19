package java8.lambda_expression;

//Write a Java program to implement a lambda expression to convert a list of strings to uppercase and lowercase.

import java.util.ArrayList;
import java.util.List;


interface ConvertUL {
    String convert(String str);
}


public class UpperLowerCase {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Krishika");
        list.add("Ruchita");

        ConvertUL upper = (str) -> {
            return str.toUpperCase();

        };

        ConvertUL lower = (str) -> {
            return str.toLowerCase();
        };

        for (String demo : list) {
            System.out.println(upper.convert(demo));
        }

        System.out.println("==============================");
        for (String demo : list) {
            System.out.println(lower.convert(demo));
        }

    }
}
