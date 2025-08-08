package collection.practice;

import java.util.ArrayList;
import java.util.List;

// 13. Write a Java program to compare two array lists.
public class CompareArrayList {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(50);
        list.add(10);
        list.add(90);
        list.add(80);
        list.add(60);

        List<Integer> list1 = new ArrayList<>();
        list1.add(50);
        list1.add(10);
        list1.add(90);
        list1.add(80);
        list1.add(60);
        list1.add(100);

        /*List<String> list1 = new ArrayList<>();
        list1.add("a");*/

        boolean b = list.equals(list1);
        System.out.println("Are the list are equals ? : "+b);

    }
}
