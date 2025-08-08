package collection.practice;
//18. Write a Java program to test whether an array list is empty or not.

import java.util.ArrayList;
import java.util.List;

public class EmptyOrNot {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(50);
        list.add(10);
        list.add(90);
        list.add(80);
        list.add(60);

        System.out.println(list);
        boolean b = list.isEmpty();
        System.out.println("Array List is empty : " + b);
    }
}
