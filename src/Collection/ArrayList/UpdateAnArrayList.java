package Collection.ArrayList;
//Write a Java program to update an array element by the given element.
import java.util.ArrayList;
import java.util.List;

public class UpdateAnArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("Original List : " + list);

        list.set(1, 60);
        System.out.println("List after replacing element : " + list);
    }
}
