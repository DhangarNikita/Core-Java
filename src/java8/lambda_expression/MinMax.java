package java8.lambda_expression;

//Write a Java program to implement a lambda expression to find the maximum and minimum values in a list of integers.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

interface MinMaxNumber{
    void minmax(List<Integer>list);
}

public class MinMax {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(100);
        list.add(9);
        list.add(25);

        MinMaxNumber mm =(list2)->{
            System.out.println("Minimum number is : "+Collections.min(list2));
            System.out.println("Maximum number is : "+Collections.max(list2));

        };

        mm.minmax(list);

    }
}
