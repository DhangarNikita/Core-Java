package collection.Practice;
//12. Write a Java program to extract a portion of an array list.
import java.util.ArrayList;
import java.util.List;

public class ExtractPosition {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(50);
        list.add(10);
        list.add(90);
        list.add(80);
        list.add(60);

        System.out.println("Original List : "+list);
        System.out.println("Extracted List from index 2 to 4 : "+list.subList(2,5));
    }
}
