package collection.practice;
//14. Write a Java program that swaps two elements in an array list.
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SwapElement {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(50);
        list.add(10);
        list.add(90);
        list.add(80);
        list.add(60);

        System.out.println(list);

        Collections.swap(list, 1, 2);
        System.out.println(list);
    }
}
