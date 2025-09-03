package java8.stream.practice.more_practice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

//11) How do you get three maximum numbers and three minimum numbers from the given list of integers
public class ThreeMinMax {
    public static void main(String[] args) {

        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        System.out.println("Minimum three numbers are : ");
        listOfIntegers.stream().sorted().limit(3).toList().forEach(e-> System.out.println(e));

        System.out.println("Max 3 numbers are : ");
        listOfIntegers.stream().sorted((o1,o2)->o2.compareTo(o1)).limit(3).forEach(e-> System.out.println(e));

    }
}
