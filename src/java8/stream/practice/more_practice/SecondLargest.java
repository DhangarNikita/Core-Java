package java8.stream.practice.more_practice;
//14) Find second largest number in an integer array?

import java.util.Arrays;
import java.util.List;

public class SecondLargest {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        Integer n = listOfIntegers.stream().sorted((o1,o2)->o2.compareTo(o1)).skip(1).findFirst().get();
        System.out.println("Second largest element is : "+n);

    }
}
