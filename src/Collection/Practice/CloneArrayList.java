package collection.practice;
// 16. Write a Java program to clone an array list to another array list.

import java.util.ArrayList;
import java.util.List;

public class CloneArrayList {
    public static void main(String[] args) {
        // arraylist have the method of clone
        ArrayList<Integer> list = new ArrayList<>();
        list.add(50);
        list.add(10);
        list.add(90);
        list.add(80);
        list.add(60);

        //Returns a shallow copy of the list.
        List<Integer> list1 = (List<Integer>) list.clone();

        System.out.println(list1);


    }
}
