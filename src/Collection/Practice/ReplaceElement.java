package collection.practice;
//21. Write a Java program to replace the second element of an ArrayList with the specified element.

import java.util.ArrayList;

public class ReplaceElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);

        System.out.println("Replace 2nd index element with another element");
        list.set(2, 500);
        System.out.println(list);

    }
}
