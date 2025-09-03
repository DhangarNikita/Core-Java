package java8.stream.practice.more_practice;

import java.util.Arrays;
import java.util.List;

//8) Given a list of integers, find maximum and minimum of those numbers
public class MinMax {
    public static void main(String[] args) {

        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        int n = listOfIntegers.stream().min((o1,o2)-> o1.compareTo(o2)).get();
        System.out.println("Min number is : "+n);

        int n1 = listOfIntegers.stream().max((o1,o2)-> o1.compareTo(o2)).get();
        System.out.println("Max number is : "+n1);

    }
}
