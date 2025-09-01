package java8.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Occurrence {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");

        //How do you count occurrences of each word in a list using streams
        Map<String,Long> map =words.stream().collect(Collectors.groupingBy(n->n,Collectors.counting()));
        System.out.println(map);
    }
}
