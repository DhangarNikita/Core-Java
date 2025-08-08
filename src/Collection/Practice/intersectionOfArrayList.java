package collection.practice;
import java.util.ArrayList;
// 27. Write a program to find the intersection of two ArrayLists.
// common element copy to another list

public class intersectionOfArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Nikita");
        list.add("Rushika");
        list.add("Ruchita");
        list.add("Nikhil");
        list.add("Vivek");
        System.out.println(list);

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Shweta");
        list1.add("Swati");
        list1.add("Saurabh");
        list1.add("Nikhil");
        list1.add("Vivek");
        System.out.println(list1);

        ArrayList<String> intersection = new ArrayList<>(list);
        intersection.retainAll(list1);  // Keep only elements also in list2
        System.out.println(intersection);


    }
}
