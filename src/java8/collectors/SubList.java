package java8.collectors;
//How do you extract a sublist based on a condition using streams

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SubList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 12, 8, 20, 3, 15, 7);

        List<Integer> sub = numbers.stream().filter(n->n>10).collect(Collectors.toList());
        System.out.println(sub);


    }
}
