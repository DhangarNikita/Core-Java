package collection.practice;

import java.util.ArrayList;
import java.util.List;

//9. Write a Java program to copy one array list into another.
public class CopyArray {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(50);
        list.add(10);
        list.add(90);
        list.add(80);
        list.add(60);

        System.out.println(list);

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(list);

        System.out.println("Copy List "+list1);
    }
}
