package collection.practice;
// 17. Write a Java program to empty an array list.

import java.util.ArrayList;

public class ClearArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(50);
        list.add(10);
        list.add(90);
        list.add(80);
        list.add(60);
        System.out.println(list);
        list.clear();
        System.out.println(list);
    }
}
