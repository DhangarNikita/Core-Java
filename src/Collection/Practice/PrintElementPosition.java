package collection.practice;
//22. Write a Java program to print all the elements of an ArrayList using the elements' position.

import java.util.ArrayList;

public class PrintElementPosition {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println("Elements of ArrayList using position:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element At Position " + i + ": " + list.get(i));
        }
    }
}
