package java8.lambda_expression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Write a Java program to implement a lambda expression to sort a list of strings in alphabetical order.

interface Sorting {
    void sort(List<String> list);
}

public class SortList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Nikita");
        list.add("Sneha");
        list.add("Ruchita");
        list.add("Krishika");

        Sorting so = (list1) -> {
            Collections.sort(list1);
            System.out.println(list1);
        };

        System.out.println("Sorted list is : ");
        so.sort(list);
    }
}
