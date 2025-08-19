package java8.lambda_expression;
//Write a Java program to implement a lambda expression to check if a list of strings are all uppercase or all lowercase or mixedcase.

import java.util.ArrayList;
import java.util.List;

interface Check{
    void checker(List<String> list);

}
public class CheckCase {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("nikita");
        list.add("rneha");
        list.add("ruchita");
        list.add("krishika");

        Check ch = (list1) -> {
            boolean allUpper = false;
            boolean allLower = false;

            for (String s : list1) {
                if (s.equals(s.toUpperCase())) {
                    allUpper = true;
                }
                if (s.equals(s.toLowerCase())) {
                    allLower = true;
                }
            }

            if (allUpper==true) {
                System.out.println("To Uppercase");
            } else if (allLower==true) {
                System.out.println("To Lowercase");
            } else {
                System.out.println("Mixed Case");
            }
        };

        ch.checker(list);
    }
}