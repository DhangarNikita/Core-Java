package java8.stream.practice.more_practice;

import java.util.Arrays;
import java.util.List;
//7) From the given list of integers, print the numbers which are multiples of 5?

public class Filter {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        listOfIntegers.stream().filter(e->e%5==0).forEach(r-> System.out.println(r));

    }
}
