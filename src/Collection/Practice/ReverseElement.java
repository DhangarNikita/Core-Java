package collection.Practice;
// 11. Write a Java program to reverse elements in an array list.
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseElement {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(50);
        list.add(10);
        list.add(90);
        list.add(80);
        list.add(60);

        System.out.println("Our main list : "+list);

        Collections.reverse(list);
        System.out.println("Reverse list : "+list);
    }
}
