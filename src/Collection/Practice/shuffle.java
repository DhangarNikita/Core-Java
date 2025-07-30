package collection.Practice;
//10. Write a Java program to shuffle elements in an array list.
import java.util.ArrayList;
import java.util.Collections;

public class shuffle {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(50);
        list.add(10);
        list.add(90);
        list.add(80);
        list.add(60);

        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
    }
}
