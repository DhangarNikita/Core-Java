package collection.practice;

import java.util.ArrayList;
import java.util.Collections;

public class MimElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(0);
        list.add(40);
        list.add(50);
        System.out.println(list);

        int min = Collections.min(list);
        System.out.println("Minimum number is : " + min);

    }
}
