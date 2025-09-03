package java8.stream.practice.more_practice;
//17) How do you find common elements between two arrays?

import java.util.Arrays;
import java.util.List;

public class Contains {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);
        List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);

        System.out.println("Common elements are : ");
        list1.stream().filter((e)->list2.contains(e)).forEach(e-> System.out.println(e));
    }
}
