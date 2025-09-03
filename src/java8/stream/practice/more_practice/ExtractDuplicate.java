package java8.stream.practice.more_practice;

//25) How do you extract duplicate elements from an array

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ExtractDuplicate {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);
        Set<Integer> unique = new HashSet<>();
        Set <Integer> set =listOfIntegers.stream().filter(i->!unique.add(i)).collect(Collectors.toSet());
        System.out.println(set);
    }
}
