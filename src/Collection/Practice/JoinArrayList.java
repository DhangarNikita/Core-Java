package collection.practice;
//15. Write a Java program to join two array lists.
import java.util.ArrayList;
import java.util.List;

public class JoinArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(50);
        list.add(10);
        list.add(90);
        list.add(80);
        list.add(60);

        List<Integer> list1 = new ArrayList<>();
        list1.add(101);
        list1.add(102);
        list1.add(103);
        list1.add(104);
        list.addAll(list1);
        System.out.println(list);
    }
}
