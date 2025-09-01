package java8.stream.practice;

import java.util.*;

public class FindAnyExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "d", "c");

        list.parallelStream().findAny().ifPresent(System.out::println);

       // result.ifPresent(System.out::println); // Output: A (usually)
    }
}
