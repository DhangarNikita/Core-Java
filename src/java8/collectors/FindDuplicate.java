package java8.collectors;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicate {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");

        //How do you find duplicate elements in a list using streams
        Set<String> duplicates = words.stream()
                .filter(n -> Collections.frequency(words, n) > 1)
                .collect(Collectors.toSet());
        System.out.println(duplicates);
    }
}
