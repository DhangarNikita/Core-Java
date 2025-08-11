package collection.practice;
//34. Write a program to check if two LinkedLists are equal.

import java.util.LinkedList;

public class LinkedListEqual {
    public static void main(String[] args) {
        LinkedList<String> linked = new LinkedList<>();
        linked.add("A");
        linked.add("B");
        linked.add("C");
        linked.add("D");
        linked.add("E");

        LinkedList<String> linked1 = new LinkedList<>();
        linked1.add("A");
        linked1.add("B");
        linked1.add("C");
        linked1.add("D");
        linked1.add("E");

        boolean b = linked.equals(linked1);
        System.out.println(b);


    }
}
