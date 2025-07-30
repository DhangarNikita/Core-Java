package collection.Practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//2. Write a Java program to iterate through all elements in an array list.
public class IterateArray {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
