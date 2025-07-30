package collection.Practice;
//Write a Java program to retrieve an element (at a specified index) from a given array list.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchArrayElement {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        Scanner sc = new Scanner(System.in);
        System.out.println("which index do you want");
        int index = sc.nextInt();

        if (index >= 0 && index < list.size()) {
            System.out.println(list.get(index));
        } else {
            System.out.println("Arraylist size is " + (list.size() - 1) + " and you want index " + index);
        }

    }
}
