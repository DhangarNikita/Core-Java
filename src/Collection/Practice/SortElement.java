package collection.practice;
//23. Write a program to sort an ArrayList of Strings alphabetically.

import java.util.ArrayList;
import java.util.Collections;
public class SortElement {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(5);
        list.add("A");
        list.add("Z");
        list.add("C");
        list.add("R");
        list.add("E");
        System.out.println("Unsorted list : "+list);

        Collections.sort(list);
        System.out.println("Sorted list : "+list);
    }
}
