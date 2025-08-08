package collection.practice;

import java.util.ArrayList;

//32. Write a program to merge two ArrayLists into a single ArrayList.
public class MergeArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");


        ArrayList<String> list1 = new ArrayList<>();
        list1.add("E");
        list1.add("F");
        list1.add("G");
        list1.add("H");

        ArrayList<String> list2 = new ArrayList<>(list);
        list2.addAll(list1);

        System.out.println(list2);


    }
}
