package collection.comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingListExample {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(75);
        list.add(100);
        list.add(20);
        list.add(30);
        list.add(90);
        list.add(65);
        list.add(55);
        list.add(25);

        System.out.println("Before Sorting"+list);

        //for loop

        Collections.sort(list);

        System.out.println("After Sorting"+list);
    }
}
